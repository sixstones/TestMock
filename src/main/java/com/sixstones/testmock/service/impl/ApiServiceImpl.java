package com.sixstones.testmock.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.jdbc.Constants;
import com.mysql.jdbc.Field;
import com.sixstones.testmock.constants.RedisKey;
import com.sixstones.testmock.dao.ApiDao;
import com.sixstones.testmock.dao.ApiFieldDao;
import com.sixstones.testmock.dao.FieldRelationDao;
import com.sixstones.testmock.entity.ApiFieldEntity;
import com.sixstones.testmock.entity.FieldRelationEntity;
import com.sixstones.testmock.enums.FieldTypeEnum;
import com.sixstones.testmock.service.ApiService;
import com.sixstones.testmock.vo.FieldVo;

@Service
public class ApiServiceImpl implements ApiService {

	@Autowired
	private ApiDao apiDao;
	
	@Autowired
	private ApiFieldDao fieldDao;
	
	@Autowired
	private FieldRelationDao relationDao;
	
	@Autowired
	private RedisServiceImpl redisService;

	@Override
	public Map dealRelation(ApiFieldEntity apiField,Map request,Map response) {
		FieldRelationEntity relation = relationDao.getRelationByRequestId(apiField.getFieldId());
		if(null == relation) {
			return response;
		}
		switch (relation.getRelateType()) {
		case "==":
			String reqVal = String.valueOf(request.get(apiField.getName()));
			ApiFieldEntity respField = fieldDao.get(relation.getResponseFieldId());
			response.put(respField.getName(), reqVal);
			break;
		default:
			break;
		}
		return response;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void saveApiField(int apiId, FieldVo field, int inOrOut,int pid) {
		
		if(field.getType() == FieldTypeEnum.对象) {
			ApiFieldEntity fieldEntity = new ApiFieldEntity();
			fieldEntity.setName(field.getKey());
			fieldEntity.setApiId(apiId);
			fieldEntity.setInOrOut(inOrOut);
			fieldEntity.setType(FieldTypeEnum.对象.getType());
			fieldEntity.setpFieldId(pid);
			fieldDao.add(fieldEntity);
			for(FieldVo child : field.getChildren()) {
				saveApiField(apiId,child,inOrOut,fieldEntity.getFieldId());
			}
		}
		else if(field.getType() == FieldTypeEnum.列表) {
			ApiFieldEntity fieldEntity = new ApiFieldEntity();
			fieldEntity.setName(field.getKey());
			fieldEntity.setApiId(apiId);
			fieldEntity.setInOrOut(inOrOut);
			fieldEntity.setType(FieldTypeEnum.列表.getType());
			fieldEntity.setpFieldId(pid);
			fieldDao.add(fieldEntity);
			for(FieldVo child : field.getChildren()) {
				saveApiField(apiId,child,inOrOut,fieldEntity.getFieldId());
			}
		}else {
			ApiFieldEntity fieldEntity = new ApiFieldEntity();
			fieldEntity.setName(field.getKey());
			fieldEntity.setApiId(apiId);
			fieldEntity.setInOrOut(inOrOut);
			fieldEntity.setType(field.getType().getType());
			fieldEntity.setpFieldId(pid);
			fieldDao.add(fieldEntity);
		}
	}

	@Override
	public ApiFieldEntity queryApiByUrl(String url) {
		return (ApiFieldEntity) redisService.get(String.format(RedisKey.APIURL, url));
	}
	
}

package com.sixstones.testmock.service;

import java.util.Map;

import com.sixstones.testmock.entity.ApiFieldEntity;
import com.sixstones.testmock.vo.FieldVo;

public interface ApiService {
	
	/**
	 * 处理关联关系
	 * @param apiField 请求字段实体
	 * @param request 请求参数
	 * @param response 响应参数
	 * @return
	 */
	Map dealRelation(ApiFieldEntity apiField,Map request,Map response);
	
	
	/**
	 * 保存接口定义
	 * @param apiId 接口Id 
	 * @param field
	 * @param inOrOut
	 */
	void saveApiField(int apiId ,FieldVo field,int inOrOut,int pId);
}

package com.sixstones.testmock.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sixstones.testmock.entity.ApiFieldEntity;

public interface ApiFieldDao extends BaseDao<ApiFieldEntity, Integer>{

	/**
	 * 获取接口参数（入参|出参）
	 * @param apiId 接口ID
	 * @param inOrOut	1:IN;2:OUT
	 * @return
	 */
	List<ApiFieldEntity> getApiField(@Param("apiId")int apiId,@Param("inOrOut")int inOrOut);
}

package com.sixstones.testmock.entity;

/**
 * 接口定义实体
 * @author Administrator
 *
 */
public class ApiEntity extends BaseEntity {

	//接口ID
	private int apiId;
	
	//接口名称
	private String apiName;
	
	//接口方法
	private String method;
	
	//接口地址
	private String url;
	
	//接口描述
	private String desc;
	
	//参数类型：JSON，XML
	private int paramType;

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getParamType() {
		return paramType;
	}

	public void setParamType(int paramType) {
		this.paramType = paramType;
	}
	
}

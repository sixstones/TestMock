package com.sixstones.testmock.entity;

/**
 * �ӿڶ���ʵ��
 * @author Administrator
 *
 */
public class ApiEntity extends BaseEntity {

	//�ӿ�ID
	private int apiId;
	
	//�ӿ�����
	private String apiName;
	
	private String apiCode;
	
	//�ӿڷ���
	private String method;
	
	//�ӿڵ�ַ
	private String url;
	
	//�ӿ�����
	private String desc;
	
	//�������ͣ�JSON��XML
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
	
	

	public String getApiCode() {
		return apiCode;
	}

	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
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

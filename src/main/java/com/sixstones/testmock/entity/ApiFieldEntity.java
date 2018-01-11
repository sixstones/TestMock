package com.sixstones.testmock.entity;

/**
 * �ӿ��ֶ�
 * @author Administrator
 *
 */
public class ApiFieldEntity extends BaseEntity{

	//�ֶ�ID
	private int fieldId;
	
	//�����ӿ�ID
	private int apiId;
	
	//��Σ�����
	private int inOrOut;
	
	//�ֶ�����
	private String name;
	
	//�ֶ�����
	private String type;
	
	//�ֶ�����
	private String desc;

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}

	public int getInOrOut() {
		return inOrOut;
	}

	public void setInOrOut(int inOrOut) {
		this.inOrOut = inOrOut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}

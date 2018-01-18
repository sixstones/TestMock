package com.sixstones.testmock.entity;

/**
 * 接口字段实体类
 * @author Administrator
 *
 */
public class ApiFieldEntity extends BaseEntity{

	//字段ID
	private int fieldId;
	
	//接口ID
	private int apiId;
	
	//父字段ID
	private int pFieldId;
	
	//1：入参；2出参
	private int inOrOut;
	
	//字段名称
	private String name;
	
	//字段类型
	private String type;
	
	//字段描述
	private String desc;

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public int getpFieldId() {
		return pFieldId;
	}

	public void setpFieldId(int pFieldId) {
		this.pFieldId = pFieldId;
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

package com.sixstones.testmock.entity;

public class FieldRelationEntity extends BaseEntity {

	private int relateId;

	private int requestFieldId;

	private int responseFieldId;

	private String relateType;

	public int getRelateId() {
		return relateId;
	}

	public void setRelateId(int relateId) {
		this.relateId = relateId;
	}

	public int getRequestFieldId() {
		return requestFieldId;
	}

	public void setRequestFieldId(int requestFieldId) {
		this.requestFieldId = requestFieldId;
	}

	public int getResponseFieldId() {
		return responseFieldId;
	}

	public void setResponseFieldId(int responseFieldId) {
		this.responseFieldId = responseFieldId;
	}

	public String getRelateType() {
		return relateType;
	}

	public void setRelateType(String relateType) {
		this.relateType = relateType;
	}

}

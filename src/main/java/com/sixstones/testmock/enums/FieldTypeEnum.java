package com.sixstones.testmock.enums;

public enum FieldTypeEnum {
	
	字符("String"),
	整型("Integer"),
	浮点("Float"),
	长整型("Long"),
	双精度("Double"),
	对象("Object"),
	布尔型("Boolean"),
	列表("List");
	
	private String type;

	private FieldTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}

package com.sixstones.testmock.vo;

import java.util.List;

import com.sixstones.testmock.enums.FieldTypeEnum;

public class FieldVo {

	private String key;
	private FieldTypeEnum type;
	private List<FieldVo> children;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public FieldTypeEnum getType() {
		return type;
	}

	public void setType(FieldTypeEnum type) {
		this.type = type;
	}

	public List<FieldVo> getChildren() {
		return children;
	}

	public void setChildren(List<FieldVo> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"key\":" + (key == null ? "null" : key) + ",");
		sb.append("\"type\":" + (type == null ? "null" : type.getType()) + ",");
		sb.append("\"children\":" + (children == null ? "null" : children));
		sb.append("}");
		return sb.toString();
	}

}

package com.sixstones.testmock.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sixstones.testmock.enums.FieldTypeEnum;
import com.sixstones.testmock.vo.FieldVo;

public class JsonUtil {

	private static ObjectMapper mapper = new ObjectMapper();

	public static String toString(Object obj) throws JsonProcessingException {
		return mapper.writeValueAsString(obj);
	}

	public static Map<String, Object> toMap(String json) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(json, Map.class);
	}

	public static Object toObject(String json, Class clazz)
			throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(json, clazz);
	}

	public static void parse(Object obj, FieldVo upperField) {
		// 1、非数组格式
		// 2.遍历所有键值
		// 3.基本类型新增子字段
		// 4.Map
		if (obj instanceof Map) {
			upperField.setType(FieldTypeEnum.对象);
			Map<String, Object> map = (Map<String, Object>) obj;
			for (Entry<String, Object> entry : map.entrySet()) {
				// 每个键值生个字段对象
				FieldVo temp = new FieldVo();
				String key = entry.getKey();
				Object val = entry.getValue();
				temp.setKey(key);
				parse(val, temp);
				if (null == upperField.getChildren()) {
					List<FieldVo> children = new ArrayList<FieldVo>();
					children.add(temp);
					upperField.setChildren(children);
				} else {
					upperField.getChildren().add(temp);
				}
			}
		}
		// 2、数组格式
		else if (obj instanceof List) {
			List list = (List) obj;
			upperField.setType(FieldTypeEnum.列表);
			FieldVo temp = new FieldVo();
			parse(list.get(0), temp);
			if (null == upperField.getChildren()) {
				List<FieldVo> children = new ArrayList<FieldVo>();
				children.add(temp);
				upperField.setChildren(children);
			} else {
				upperField.getChildren().add(temp);
			}
		} else if (obj instanceof String) {
			upperField.setType(FieldTypeEnum.字符);
		} else if (obj instanceof Integer) {
			upperField.setType(FieldTypeEnum.整型);
		} else if (obj instanceof Boolean) {
			upperField.setType(FieldTypeEnum.布尔型);
		} else if (obj instanceof Float) {
			upperField.setType(FieldTypeEnum.浮点);
		} else if (obj instanceof Long) {
			upperField.setType(FieldTypeEnum.长整型);
		} else if (obj instanceof Double) {
			upperField.setType(FieldTypeEnum.双精度);
		}
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String json = "{\r\n" + 
				"    \"name\": \"三班\",\r\n" + 
				"    \"students\": [\r\n" + 
				"        {\r\n" + 
				"            \"age\": 25,\r\n" + 
				"            \"gender\": \"female\",\r\n" + 
				"            \"grades\": \"三班\",\r\n" + 
				"            \"name\": \"露西\",\r\n" + 
				"            \"score\": {\r\n" + 
				"                \"网络协议\": 98,\r\n" + 
				"                \"JavaEE\": 92,\r\n" + 
				"                \"计算机基础\": 93\r\n" + 
				"            },\r\n" + 
				"            \"weight\": 51.3\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"age\": 26,\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"grades\": \"三班\",\r\n" + 
				"            \"name\": \"杰克\",\r\n" + 
				"            \"score\": {\r\n" + 
				"                \"网络安全\": 75,\r\n" + 
				"                \"Linux操作系统\": 81,\r\n" + 
				"                \"计算机基础\": 92\r\n" + 
				"            },\r\n" + 
				"            \"weight\": 66.5\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"age\": 25,\r\n" + 
				"            \"gender\": \"female\",\r\n" + 
				"            \"grades\": \"三班\",\r\n" + 
				"            \"name\": \"莉莉\",\r\n" + 
				"            \"score\": {\r\n" + 
				"                \"网络安全\": 95,\r\n" + 
				"                \"Linux操作系统\": 98,\r\n" + 
				"                \"SQL数据库\": 88,\r\n" + 
				"                \"数据结构\": 89\r\n" + 
				"            },\r\n" + 
				"            \"weight\": 55\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
		FieldVo field = new FieldVo();
		Object obj = JsonUtil.toObject(json, Object.class);
		JsonUtil.parse(obj, field);
		System.out.println(field);
	}
}

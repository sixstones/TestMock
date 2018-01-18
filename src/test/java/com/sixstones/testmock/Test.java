package com.sixstones.testmock;


import java.io.IOException;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sixstones.testmock.service.ApiService;
import com.sixstones.testmock.utils.JsonUtil;
import com.sixstones.testmock.vo.FieldVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:/spring/spring-*.xml"
})
public class Test {
	
	@Autowired
	private ApiService apiService;

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
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
		apiService.saveApiField(1, field, 1, 0);
	}

}

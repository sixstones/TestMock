package com.sixstones.testmock.web;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixstones.testmock.utils.JsonUtil;

@Controller
public class MockController extends BaseController{

	@RequestMapping(value="/doMock")
	@ResponseBody
	public Object doMock(HttpServletRequest request) {
		
		String apiCode = request.getParameter("apiCode");
		try {
			String requestBody = this.getRequestBody(request);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

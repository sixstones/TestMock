package com.sixstones.testmock.web;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixstones.testmock.utils.JsonUtil;

@Controller
public class MockController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(MockController.class);

	@RequestMapping(value = "/**")
	@ResponseBody
	public Object doMock(HttpServletRequest resquest) {
		String url = resquest.getRequestURI();
		logger.info(url);
		return url;
	}
}

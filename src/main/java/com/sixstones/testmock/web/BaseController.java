package com.sixstones.testmock.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletRequest;

public class BaseController {
	
	/**
	 * 获取请求消息体
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public String getRequestBody(ServletRequest request) throws UnsupportedEncodingException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer();
		String temp;
		while((temp = br.readLine())!=null) {
			sb.append(temp);
		}
		br.close();
		return sb.toString();
	}

}

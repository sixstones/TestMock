package com.sixstones.testmock.handler;

import java.util.Map;
import com.sixstones.testmock.utils.JsonUtil;

public class JsonRequestHandler implements MockHandler{

	@Override
	public Map parseParam(String requestBody) {
		try {
			return JsonUtil.toMap(requestBody);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object doHandler(Object obj) {
		return null;
	}


}

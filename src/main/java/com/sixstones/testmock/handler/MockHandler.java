package com.sixstones.testmock.handler;

import java.util.Map;

public interface MockHandler {


	Map parseParam(String requestBody);
	
	Object doHandler(Object obj);
}

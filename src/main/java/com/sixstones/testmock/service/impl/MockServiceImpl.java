package com.sixstones.testmock.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.sixstones.testmock.service.MockService;

@Service
public class MockServiceImpl implements MockService {

	@Override
	public boolean checkRequest(Map requestParam) {
		return false;
	}

}

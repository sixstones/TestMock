package com.sixstones.testmock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixstones.testmock.dao.ApiDao;
import com.sixstones.testmock.service.ApiService;

@Service
public class ApiServiceImpl implements ApiService {

	@Autowired
	private ApiDao apiDao;
}

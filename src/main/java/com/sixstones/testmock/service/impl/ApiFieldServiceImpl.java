package com.sixstones.testmock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixstones.testmock.dao.ApiFieldDao;
import com.sixstones.testmock.service.ApiFieldService;

@Service
public class ApiFieldServiceImpl implements ApiFieldService {
	
	@Autowired
	private ApiFieldDao dao;
}

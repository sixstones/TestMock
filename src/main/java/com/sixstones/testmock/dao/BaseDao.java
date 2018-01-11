package com.sixstones.testmock.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T, PK> {

	int add(T t);

	int delete(PK pk);

	int update(T t);
	
	T get(PK pk);

	List<T> query(Map<String, Object> params);
}

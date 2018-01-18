package com.sixstones.testmock.dao;

import com.sixstones.testmock.entity.FieldRelationEntity;

public interface FieldRelationDao extends BaseDao<FieldRelationEntity, Integer> {

	FieldRelationEntity getRelationByRequestId(int requestFieldId);
}

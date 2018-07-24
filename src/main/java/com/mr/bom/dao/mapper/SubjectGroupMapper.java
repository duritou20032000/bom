package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.SubjectGroup;

public interface SubjectGroupMapper {
    int deleteByPrimaryKey(String subjectGroupId);

    int insert(SubjectGroup record);

    int insertSelective(SubjectGroup record);

    SubjectGroup selectByPrimaryKey(String subjectGroupId);

    int updateByPrimaryKeySelective(SubjectGroup record);

    int updateByPrimaryKey(SubjectGroup record);
}
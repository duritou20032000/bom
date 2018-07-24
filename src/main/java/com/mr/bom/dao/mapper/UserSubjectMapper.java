package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.UserSubject;

public interface UserSubjectMapper {
    int deleteByPrimaryKey(String userSubjectId);

    int insert(UserSubject record);

    int insertSelective(UserSubject record);

    UserSubject selectByUserId(String userId);

    UserSubject selectByPrimaryKey(String userSubjectId);

    int updateByPrimaryKeySelective(UserSubject record);

    int updateByPrimaryKey(UserSubject record);
}
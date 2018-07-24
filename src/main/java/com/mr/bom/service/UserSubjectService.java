package com.mr.bom.service;

import com.mr.bom.dao.domain.UserSubject;
import com.mr.bom.dao.mapper.UserSubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSubjectService {
    @Autowired
    private UserSubjectMapper userSubjectMapper;

    public UserSubject selectByUserId(String userId){
        return  userSubjectMapper.selectByUserId(userId);
    }

}

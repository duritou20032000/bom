package com.mr.bom.service;

import com.mr.bom.dao.domain.Role;
import com.mr.bom.dao.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> getBySubjectGroupId(String subjectGroupId){

        List<Role> recorders = roleMapper.getBySubjectGroupId(subjectGroupId);

        return recorders;
    }


}

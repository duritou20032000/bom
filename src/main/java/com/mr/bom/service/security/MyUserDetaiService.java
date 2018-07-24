package com.mr.bom.service.security;

import com.mr.bom.dao.domain.Role;
import com.mr.bom.dao.domain.User;
import com.mr.bom.dao.domain.UserSubject;
import com.mr.bom.dao.mapper.UserMapper;
import com.mr.bom.dao.mapper.UserSubjectMapper;
import com.mr.bom.service.RoleService;
import com.mr.bom.service.UserService;
import com.mr.bom.service.UserSubjectService;
import com.mr.bom.utils.PasswordUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyUserDetaiService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserSubjectService userSubjectService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new PasswordUtil();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.selectByUsername(s);
        List<String> list = new ArrayList<>();
        String password = "";
        if(user != null){
            password= user.getPwd();
        }

        UserSubject us = userSubjectService.selectByUserId(user.getUserId());

        if(us != null){
           List<Role> roles = roleService.getBySubjectGroupId(us.getUserSubjectId());
            for (Role role : roles) {
                String authority = role.getCode();
                list.add(authority);
            }
        }
        return new org.springframework.security.core.userdetails.User(s,password,AuthorityUtils.commaSeparatedStringToAuthorityList(list.toString()));
    }
}

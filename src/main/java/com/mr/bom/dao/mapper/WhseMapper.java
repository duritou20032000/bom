package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.Whse;

public interface WhseMapper {
    int deleteByPrimaryKey(String whseId);

    int insert(Whse record);

    int insertSelective(Whse record);

    Whse selectByPrimaryKey(String whseId);

    int updateByPrimaryKeySelective(Whse record);

    int updateByPrimaryKey(Whse record);
}
package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.Counter;

public interface CounterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Counter record);

    int insertSelective(Counter record);

    Counter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}
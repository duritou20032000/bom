package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(String workorderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String workorderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.Do;

public interface DoMapper {
    int deleteByPrimaryKey(String doDtlId);

    int insert(Do record);

    int insertSelective(Do record);

    Do selectByPrimaryKey(String doDtlId);

    int updateByPrimaryKeySelective(Do record);

    int updateByPrimaryKey(Do record);
}
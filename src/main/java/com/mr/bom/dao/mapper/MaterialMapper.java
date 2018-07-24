package com.mr.bom.dao.mapper;

import com.mr.bom.dao.domain.Material;

public interface MaterialMapper {
    int deleteByPrimaryKey(String workorderDtlId);

    int insert(Material record);

    int insertSelective(Material record);

    Material selectByPrimaryKey(String workorderDtlId);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}
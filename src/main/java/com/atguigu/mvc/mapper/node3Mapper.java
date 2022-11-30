package com.atguigu.mvc.mapper;

import com.atguigu.mvc.pojo.node3;

public interface node3Mapper {
    int deleteByPrimaryKey(String sSerialNum);

    int insert(node3 record);

    int insertSelective(node3 record);

    node3 selectByPrimaryKey(String sSerialNum);

    int updateByPrimaryKeySelective(node3 record);

    int updateByPrimaryKey(node3 record);
}
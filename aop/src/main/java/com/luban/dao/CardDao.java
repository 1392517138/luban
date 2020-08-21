package com.luban.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 19:10 2020/8/20 0020
 */
public interface CardDao {

    @Select("select * from citq where sequence_name like '%${name}%'")
    List<Map<Integer,String>> list(@Param("name") String name);
}

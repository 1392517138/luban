package com.luban.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 20:12 2020/8/15 0015
 */
@Mapper
public interface UserDao {

    @Select("select * from citq")
    List<Map<String,Object>> list();
}

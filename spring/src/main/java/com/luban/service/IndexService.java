package com.luban.service;

import com.luban.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 20:15 2020/8/15 0015
 */
@Service
public class IndexService {
    @Autowired
    UserDao userDao;
    public List<Map<String,Object>> list(){
        List<Map<String, Object>> list = userDao.list();
        return list;
    }
}

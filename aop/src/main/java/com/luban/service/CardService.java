package com.luban.service;

import com.luban.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 19:10 2020/8/20 0020
 */
@Component
public class CardService {
    @Autowired
    CardDao cardDao;

    public void list(){
        System.out.println(cardDao.list("de"));
    }

    @PostConstruct
    public void init(){
        System.out.println("CardService ---- init ----");
    }
}

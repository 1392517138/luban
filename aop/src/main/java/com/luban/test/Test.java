package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.app.MyInvocationHandler;
import com.luban.dao.CardDao;
import com.luban.service.CardService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 19:11 2020/8/20 0020
 */
public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.getBean(CardService.class).list();
    }
}
 
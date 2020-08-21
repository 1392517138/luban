package com.luban.test;

import com.luban.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 14:17 2020/8/15 0015
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.start();
    }
}

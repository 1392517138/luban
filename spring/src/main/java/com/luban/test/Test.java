package com.luban.test;

import com.luban.config.AppConfig;
import com.luban.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 20:16 2020/8/15 0015
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexService indexService = (IndexService)applicationContext.getBean("indexService");
        List<Map<String, Object>> list = indexService.list();


    }
}

package com.luban.test;

import com.luban.app.MyInvocationHandler;
import com.luban.dao.CardDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 11:07 2020/8/21 0021
 */
//这里不能有@Component
public class MyFactoryBean implements FactoryBean, InvocationHandler {
    Class clazz;

    public MyFactoryBean(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object getObject() throws Exception {
        Class[] clazzs = new Class[]{clazz};
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, this);
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");
        return null;
    }
}

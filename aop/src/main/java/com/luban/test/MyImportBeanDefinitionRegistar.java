package com.luban.test;

import com.luban.app.MyInvocationHandler;
import com.luban.dao.CardDao;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 10:58 2020/8/21 0021
 */
public class MyImportBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {
    /**
     * 1. 得到bd
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //1.扫描bd
//        CardDao dao = (CardDao) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{CardDao.class}, new MyInvocationHandler());
//        dao.list("de");
        /**
         * 上面的还是会打印aaa，但是会报错，因为spring注入不进来
         * 因为你是一个代理对象，spring new不出来
         */
        //----------------------------------------------------------------------
        //这里是getClass，因为是代理出来的。如果是new出来的则.class都可以
//        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(dao.getClass());
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition)builder.getBeanDefinition();
        /**
         * 由于我们的MyFactoryBean写了一个带参的构造方法，spring要用的默认构造方法没了，所以我们要指名一下
         * 自动装配三种方法
         * byType、byName、byConstructor
         * 之前这个cardDao已经传给spring了，这里理解为给一个名字，spring就会去找针对于该名字的一个类型
         */
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.luban.dao.CardDao");
        beanDefinition.setBeanClass(MyFactoryBean.class);
        registry.registerBeanDefinition("cardDao",beanDefinition);
    }
}

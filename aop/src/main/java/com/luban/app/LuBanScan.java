package com.luban.app;

import com.luban.test.MyImportBeanDefinitionRegistar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 11:28 2020/8/21 0021
 */
@Import(MyImportBeanDefinitionRegistar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface LuBanScan {
}

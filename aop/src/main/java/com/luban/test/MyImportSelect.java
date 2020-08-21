package com.luban.test;

import com.luban.dao.CardDao;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 10:54 2020/8/21 0021
 */
public class MyImportSelect implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //有问题，得不到代理对象的类名，且要先产生这个代理对象出来。即这个类必须在这个项目当中
        return new String[]{CardDao.class.getName()};
    }
}

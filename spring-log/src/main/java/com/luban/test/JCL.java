package com.luban.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:18 2020/8/15 0015
 */
public class JCL {
    public static void main(String[] args) {
        //既可以选择log4j，也可以jul
        //LogFactory.getLog为什么可以返回两个不同的类出来
        Log log = LogFactory.getLog("jcl");
        log.info("jcl");
    }
}

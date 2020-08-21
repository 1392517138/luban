package com.luban.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 18:17 2020/8/15 0015
 */
public class SLF4J {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("slf4j");
        logger.info("slf4j");
    }
}

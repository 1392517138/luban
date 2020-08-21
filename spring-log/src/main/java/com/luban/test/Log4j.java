package com.luban.test;

import java.util.logging.Logger;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:15 2020/8/15 0015
 */
public class Log4j {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log4j");
        logger.info("log4j");
    }
}

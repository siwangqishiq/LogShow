package com.xinlan.test;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class Demo {
    private static final Logger logger = Logger.getLogger(Demo.class);

    public static void main(String args[]){
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");

        for(int i = 0 ;i <10;i++){
            logger.info("This is info message."+i);
        }
    }
}

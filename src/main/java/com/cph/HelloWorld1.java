package com.cph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cph
 * @date 2019/10/15
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("com.cph.HelloWorld1");
        logger.debug("Hello World.");
    }
}

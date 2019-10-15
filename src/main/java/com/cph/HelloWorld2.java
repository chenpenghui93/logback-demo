package com.cph;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cph
 * @date 2019/10/15
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("com.cph.HelloWorld2");
        logger.debug("Hello World.");

        //打印内部状态
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}

package com.cph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cph
 * @date 2019/10/15
 */
public class MyApp1 {
    final static Logger logger = LoggerFactory.getLogger(MyApp1.class);

    public static void main(String[] args) {
        logger.info("Entering application.");

        Foo foo = new Foo();
        foo.doIt();
        logger.info("Exiting application.");
    }
}

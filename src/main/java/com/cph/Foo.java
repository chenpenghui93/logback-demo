package com.cph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cph
 * @date 2019/10/15
 */
public class Foo {
    static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void doIt(){
        logger.debug("Do it again!");
    }
}

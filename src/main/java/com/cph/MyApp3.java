package com.cph;

import ch.qos.logback.access.joran.JoranConfigurator;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cph
 * @date 2019/10/16
 */
public class MyApp3 {
    final static Logger logger = LoggerFactory.getLogger(MyApp3.class);

    public static void main(String[] args) {
        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();

        try {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(context);
            context.reset();
            configurator.doConfigure(args[0]);
        } catch (JoranException e) {
            e.printStackTrace();
        }

        StatusPrinter.printInCaseOfErrorsOrWarnings(context);

        logger.info("Entering application.");
        Foo foo = new Foo();
        foo.doIt();
        logger.info("Exiting application.");
    }
}

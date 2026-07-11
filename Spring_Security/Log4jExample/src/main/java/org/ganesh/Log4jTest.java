package org.ganesh;

//logger-tells which class should go in log tracking
//appender-decides where to send it either at files or mail etc
//layout-layout of the logs

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.ganesh.Log4jTest.process;

public class Log4jTest
{
    private static final Logger logger= LogManager.getLogger(Log4jTest.class);
    public static void main(String []args)
    {
        process();
    }

    public static void process()
    {
        //services
        logger.trace("From the trace method");
        logger.debug("From the debug method");
        logger.info("From the info method");
        logger.warn("From the warn method");
        logger.error("From the error method");
        logger.fatal("From the fatal method");

    }
}

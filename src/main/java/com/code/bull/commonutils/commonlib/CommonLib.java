package com.code.bull.commonutils.commonlib;

import com.code.bull.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;

public class CommonLib extends Driver {

    private static final Logger log = LogManager.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

    /**
     * Logger level
     * 1. info
     * 2. error
     * 3. fail
     * 4. warning
     * 5. pass
     */

    /**
     * This method is used to print info message
     *
     * @param msg the msg
     */
    public static void info(String msg) {
        log.info(msg);
    }

    /**
     * This method is used to print warn message
     *
     * @param msg the msg
     */
    public static void warn(String msg) {
        log.warn(msg);
    }

    /**
     * This method is used to print error message
     *
     * @param msg the msg
     */
    public static void error(String msg) {
        log.error(msg);
    }


}

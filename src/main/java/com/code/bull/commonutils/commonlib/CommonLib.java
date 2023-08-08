package com.code.bull.commonutils.commonlib;

import com.aventstack.extentreports.Status;
import com.code.bull.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;

public class CommonLib extends Driver {

    private static final Logger log = LogManager.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());
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


    /**
     * This method is used to print pass msg
     *
     * @param s the msg
     */
    public static void pass(String s) {
        log.info(s);
    }
    /**
     * This method is used to log the failure message into report
     * @param message The Message
     * @param requireScreenshot The screenshot True/False
     */
    public static void fail(String message, boolean requireScreenshot) {
        log.error(message);
        assertCheck.append(false);
        reporter.showInExtentReport(Status.FAIL, message, requireScreenshot);
    }
}

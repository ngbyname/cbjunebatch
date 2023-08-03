package com.code.bull.commonutils.actions;

import com.code.bull.commonutils.commonlib.CommonLib;
import org.testng.Assert;

public class AssertActions {

    /**
     * Assertion - there two types of assertions
     * 1. Soft assert -
     * 2. Hard assert
     * <p>
     * Assert Example -
     * 1. boolean comparison
     * 2. String comparison
     * 3. integer comparison
     * 4. double comparison
     * 5. flot comparison
     * <p>
     * a=b --> pass
     * a!=b --> fail
     */
    public static Boolean assertFlag = null;

    /**
     * This method is used to assert two boolean values
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param pass     the pass description
     * @param fail     the fail description
     * @return boolean
     */
    public static Boolean assertEqualBoolean(boolean actual, boolean expected, String pass, String fail) {
        assertFlag = false;
        try {
            Assert.assertEquals(actual, expected, pass);
            assertFlag = true;
        } catch (Exception e) {
            CommonLib.error(fail + " " + e.getMessage());
        }
        return assertFlag;
    }

    /**
     * This method is used to assert two String values
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param pass     the pass description
     * @param fail     the fail description
     * @return boolean
     */
    public static Boolean assertEqualString(String actual, String expected, String pass, String fail) {
        assertFlag = false;
        try {
            Assert.assertEquals(actual, expected, pass);
            assertFlag = true;
        } catch (Exception e) {
            CommonLib.error(fail + " " + e.getMessage());
        }
        return assertFlag;
    }

    /**
     * This method is used to assert two Double values
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param pass     the pass description
     * @param fail     the fail description
     * @return boolean
     */
    public static Boolean assertEqualDouble(Double actual, Double expected, String pass, String fail) {
        assertFlag = false;
        try {
            Assert.assertEquals(actual, expected, pass);
            assertFlag = true;
        } catch (Exception e) {
            CommonLib.error(fail + " " + e.getMessage());
        }
        return assertFlag;
    }


}

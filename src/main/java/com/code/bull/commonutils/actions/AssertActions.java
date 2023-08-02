package com.code.bull.commonutils.actions;

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

    public static Boolean assertEqualBoolean(boolean actual, boolean expected, String pass, String fail) {
        assertFlag = false;
        try {
            Assert.assertEquals(actual, expected, pass);
            assertFlag = true;
        } catch (Exception e) {
            System.out.println(fail + " " + e.getMessage());
        }
        return assertFlag;
    }


}

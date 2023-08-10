package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.commonutils.applicationutils.constants.ApplicationConstants;
import com.code.bull.commonutils.commonlib.CommonLib;
import com.code.bull.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage extends Driver {
    static Wait<WebDriver> wait;

    /**
     * 3 types ke wait hote hai
     * 1. implicit wait --> 5 sec ke liye hamesha rukega
     * 2. explicit wait --> ek condition and max time
     * 3. fluent wait --> ek condition and max time  + pooling time
     */

    public BasePage(WebDriver driver) {
        Driver.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(constants.getValue(ApplicationConstants.GLOBAL_WAIT_TIME))));
    }


    /**
     * This method is used to click anywhere on the website
     *
     * @param elementLocation the web element location/address
     */
    public void click(By elementLocation) {
        if (Boolean.TRUE.equals(isDisplayed(elementLocation))) {
            CommonLib.info("Going to click on : " + elementLocation);
            driver.findElement(elementLocation).click();
        } else {
            CommonLib.error("Web element :-" + elementLocation + " is NOT displayed",true);
        }
    }

    /**
     * This method is used to check whether web element is displayed or not
     *
     * @param elementLocation the web element location
     * @return true/false
     */
    public static Boolean isDisplayed(By elementLocation) {
        CommonLib.info("Going to check if element is displayed or not");
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
        boolean displayed = driver.findElement(elementLocation).isDisplayed();
        CommonLib.info("if element visible ? " + displayed);
        return displayed;
    }

    /**
     * This method is used to enter text in any text box
     *
     * @param elementLocation the locator
     * @param textToEnter     the text
     */
    public static void enterText(By elementLocation, String textToEnter, String failMsg) {
        if (Boolean.TRUE.equals(isDisplayed(elementLocation))) {
            CommonLib.info("Going to enter the text in search box by using locator: " + elementLocation);
            driver.findElement(elementLocation).clear();
            driver.findElement(elementLocation).sendKeys(textToEnter);
        } else {
            CommonLib.error(failMsg,true);
        }
    }

    /**
     * This method is used to hard wait
     *
     * @param time the time
     */
    public void hardWait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method is used to get the current url
     */
    public String getCUrl() {
        return driver.getCurrentUrl();
    }
}

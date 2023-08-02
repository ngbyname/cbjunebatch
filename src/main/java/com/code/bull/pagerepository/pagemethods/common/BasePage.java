package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasePage extends Driver {

    public BasePage(WebDriver driver){
        Driver.driver=driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    /**
     * This method is used to click anywhere on the website
     *
     * @param elementLocation the web element location/address
     */
    public void click(By elementLocation) {
        if (Boolean.TRUE.equals(isDisplayed(elementLocation)))
            driver.findElement(elementLocation).click();
        else
            System.out.println("Web element is NOT displayed");
    }

    /**
     * This method is used to check whether web element is displayed or not
     *
     * @param elementLocation the web element location
     * @return true/false
     */
    public Boolean isDisplayed(By elementLocation) {
        return driver.findElement(elementLocation).isDisplayed();
    }

    /**
     * This method is used to enter text in any text box
     *
     * @param elementLocation the locator
     * @param textToEnter     the text
     */
    public void enterText(By elementLocation, String textToEnter, String failMsg) {
        if (Boolean.TRUE.equals(isDisplayed(elementLocation))) {
            driver.findElement(elementLocation).clear();
            driver.findElement(elementLocation).sendKeys(textToEnter);
        } else {
            System.out.println(failMsg);
        }
    }
}

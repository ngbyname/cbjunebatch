package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.driver.Driver;
import org.openqa.selenium.By;

public class BasePage extends Driver {


    /**
     * This method is used to click anywhere on the website
     *
     * @param elementLocation the web element location/address
     */
    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    /**
     * This method is used to check wheather web element is displayed or not
     *
     * @param elementLocation the web element location
     * @return true/false
     */
    public Boolean isDisplayed(By elementLocation) {
        return driver.findElement(elementLocation).isDisplayed();
    }
}

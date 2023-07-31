package com.code.bull.pagerepository.pagemethods.landingpage;

import com.code.bull.pagerepository.pagelocators.LandingPageElements;
import com.code.bull.pagerepository.pagemethods.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPageMethods extends BasePage {

    LandingPageElements pageElements;

    public LandingPageMethods(WebDriver driver) {
        //super(driver);
        pageElements = PageFactory.initElements(driver, LandingPageElements.class);
    }

    /**
     * This method is used to click on cookies modal
     */
    public void clickCookiesModal() {
        if (driver.findElement(pageElements.cookiesModal).isDisplayed()) {
//            driver.findElement(pageElements.cookiesModal).click();
            click(pageElements.cookiesModal);
        } else {
            System.out.println("cookies modal accept button is not visible");
        }
    }

    /**
     * This method is used to click on weather tab
     */
    public void clickWeatherTab() {
        if (driver.findElement(pageElements.weatherDataTab).isDisplayed()) {
            driver.findElement(pageElements.weatherDataTab).click();
        } else {
            System.out.println("weather data tab is not visible");
        }
    }
}

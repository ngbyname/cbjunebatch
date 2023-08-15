package com.code.bull.pagerepository.pagemethods.landingpage;

import com.code.bull.commonutils.commonlib.CommonLib;
import com.code.bull.pagerepository.pagelocators.LandingPageElements;
import com.code.bull.pagerepository.pagemethods.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPageMethods extends BasePage {

    LandingPageElements pageElements;

    public LandingPageMethods(WebDriver driver) {
        super(driver);
        pageElements = PageFactory.initElements(driver, LandingPageElements.class);
    }

    /**
     * This method is used to click on cookies modal
     */
    public void clickCookiesModal() {
        CommonLib.info("Going to click on cookies Modal");
        click(LandingPageElements.cookiesModal);
    }

    /**
     * This method is used to click on weather tab
     */
    public void clickWeatherTab() {
        CommonLib.info("Going to click on weather data tab");
        click(pageElements.weatherDataTab);
    }

    public String getUrl(){
        return getCUrl();
    }
}

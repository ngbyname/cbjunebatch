package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.pagerepository.pagemethods.landingpage.LandingPageMethods;
import com.code.bull.pagerepository.pagemethods.subtabs.WeatherDataTabPage;
import org.openqa.selenium.WebDriver;

public class PageCollections {

    private final WebDriver driver;

    public PageCollections(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPageMethods getLandingPage() {
        return new LandingPageMethods(driver);
    }

    public WeatherDataTabPage getWeatherDataPage() {
        return new WeatherDataTabPage(driver);
    }
}

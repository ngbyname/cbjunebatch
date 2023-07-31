package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.pagerepository.pagemethods.landingpage.LandingPageMethods;
import org.openqa.selenium.WebDriver;

public class PageCollections {

    private final WebDriver driver;

    public PageCollections(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPageMethods getLandingPage() {
        return new LandingPageMethods(driver);
    }
}

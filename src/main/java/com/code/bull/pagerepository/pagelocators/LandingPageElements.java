package com.code.bull.pagerepository.pagelocators;

import org.openqa.selenium.By;

/**
 * 1. open this url - https://www.visualcrossing.com/ --Done
 * 2. Go to Weather data tab --Done
 * 3. Search for your city
 * 4. and hit search icon
 * 5. and validate all the weather history for your city
 */

public class LandingPageElements {

    public static final By cookiesModal = By.xpath("//button[text()='Accept all cookies']");
    public static final By weatherDataTab = By.xpath("//div[@id='navbarNav']//a[text()='Weather Data']");

}

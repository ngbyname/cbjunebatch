package com.code.bull.pagerepository.pagelocators;

import org.openqa.selenium.By;

/**
 * 1. open this url - https://www.visualcrossing.com/ --Done
 * 2. accept cookies modal - Done
 * 3. Go to Weather data tab --Done
 * 4. Search for your city - Done
 * 4. and hit search icon  - Done
 * 5. and validate all the weather history for your city
 */

public class LandingPageElements {

    public static final By cookiesModal = By.xpath("//button[text()='Accept all cookies']");
    public static final By weatherTab = By.xpath("//div[@id='navbarNav']");
    public static final By weatherDataTab = By.xpath("//div[@id='navbarNav']//a[text()='Weather Data']");
    public static final By weatherApiTab = By.xpath("//*[@id='navbarNav']//*[@href = '/weather-api']");
    public static final By queryBuilderTab = By.xpath("//a[text()='Query Builder']");
    public static final By pricingTab = By.xpath("//*[text()='Pricing']");
    public static final By apiDocsTab = By.xpath("//*[text()='API Docs']");
    public static final By searchDocsBox = By.xpath("//*[@class='input-group input-group-sm flex-nowrap']");
    public static final By signInTab = By.xpath("//*[@href='#signinModal']");
    public static final By signUpTab = By.xpath("//*[@id='accountToolbar']//*[@href='/sign-up']");
    public static final By weatherDataAndApiHeader = By.xpath("//*[text()='Weather Data & API']");
    public static final By globalForecastAndHistoryDataHeader = By.xpath("//*[text()='Global Forecast & History Data']");
    public static final By downloadDataHeader = By.xpath("//*[text()='Download Data']");
    public static final By richWeatherHeader = By.xpath("//*[text()='Rich weather data']");
    public static final By enterLocationTextBox = By.xpath("//*[@id='wxlocation']");
    public static final By enterLocationSearchIcon = By.xpath("//button[text()='Search']");
    public static final By  dashBoardAndToolsHeader = By.xpath("//*[@href='#dashboards']");
}


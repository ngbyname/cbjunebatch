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

    public String getUrl() {
        return getCUrl();
    }

    /**
     * This method is used to check weather tab is visible or not
     *
     * @return
     */
    public boolean isWeatherTabVisible() {
        return isDisplayed(pageElements.weatherDataTab);
    }

    public void clickWeatherApiTab() {
        CommonLib.info("Going to click on weather Api table header");
        click(pageElements.weatherApiTab);
    }

    /**
     * This method is used to check weather Api tab is visible or not
     *
     * @return
     */
    public boolean isWeatherApiTabVisible() {
        return isDisplayed(pageElements.weatherApiTab);
    }

    public void clickQueryBuilderTab() {
        CommonLib.info("Going to click on query builder tab");
        click(pageElements.queryBuilderTab);
    }

    /**
     * This method is used to check query builder is visible or not
     */
    public boolean isQueryBuilderTabVisible() {
        return isDisplayed(pageElements.queryBuilderTab);
    }
    public void clickPricingTab(){
        CommonLib.info("Going to click on pricing tab");
        click(pageElements.pricingTab);
    }

    /**
     * This method is used to check pricing tab is visible
     * @return
     */
    public boolean isPricingTabVisible(){
        return isDisplayed(pageElements.pricingTab);
    }
    public void clickApiDocsTab(){
        CommonLib.info("Going to click on Api Docs tab");
        click(pageElements.apiDocsTab);
    }

    /**
     * This method is used to check Api docs tab is visible
     * @return
     */
    public boolean isApiDocsTabVisible(){
        return isDisplayed(pageElements.apiDocsTab);
    }

    /**
     * This method is used to check search docs box is visible
     */
    public void clickSearchDocsBox(){
        CommonLib.info("Going to click on Search docs box");
        click(pageElements.searchDocsBox);
    }
    public boolean isSearchDocsBoxVisible(){
        return isDisplayed(pageElements.searchDocsBox);
    }

    /**
     * This method is used to check sign in tab is visible
     */

    public void signInTab(){
        CommonLib.info("Going to click on sign in tab");
        click(pageElements.signInTab);
    }
    public boolean isSignInBtnVisible(){
        return isDisplayed(pageElements.signInTab);
    }

    /**
     * This method is used to check sign up tab is visible
     */
    public void signUpBtn(){
        CommonLib.info("Going to click on sign up tab");
        click(pageElements.signUpTab);
    }
    public boolean isSignUpBtnVisible(){
        return isDisplayed(pageElements.signUpTab);
    }

    /**
     * This method is used to check weather data and Api header is visible
     */
    public void weatherDataAndApiHeader(){
        CommonLib.info("Going to click on weather data and Api header");
        click(pageElements.weatherDataAndApiHeader);
    }
    public boolean isWeatherDataAndApiHeaderVisible(){
        return isDisplayed(pageElements.weatherDataAndApiHeader);
    }

    /**
     * This method is used to check global forecast and history data header is visible
     */
    public void globalForecastAndHistoryDataHeader(){
        CommonLib.info("Going to click on global forecast and history data header");
        click(pageElements.globalForecastAndHistoryDataHeader);
    }
    public boolean isGlobalForecastAndHistoryDataHeaderVisible(){
        return isDisplayed(pageElements.globalForecastAndHistoryDataHeader);
    }

    /**
     * This method is used to check download data header is visible
     */
    public void downloadDataHeader(){
        CommonLib.info("Going to click on download data header");
        click(pageElements.downloadDataHeader);
    }
    public boolean isDownloadDataHeaderVisible(){
        return isDisplayed(pageElements.downloadDataHeader);
    }

    /**
     * This method is used to check enter location text box is visible
     */
    public void enterLocationTextBox(){
        CommonLib.info("Going to click on enter location text box");
        click(pageElements.enterLocationTextBox);
    }
    public boolean isEnterLocationTextBoxVisible(){
        return isDisplayed(pageElements.enterLocationTextBox);
    }

    /**
     * This method is used to click on enter location search icon
     */
    public void enterLocationSearchIcon(){
        CommonLib.info("Going to click on search icon");
        click(pageElements.enterLocationSearchIcon);
    }
    public boolean isEnterLocationSearchIconVisible(){
        return isDisplayed(pageElements.enterLocationSearchIcon);
    }
    public void dashBoardAndToolsHeader(){
        CommonLib.info("Going to click on dashboard and tools header");
        click(pageElements.dashBoardAndToolsHeader);
    }
    public boolean isDashBoardAndToolsHeaderVisible(){
        return isDisplayed(pageElements.dashBoardAndToolsHeader);
    }


}





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
        Boolean displayed = isDisplayed(pageElements.weatherDataTab);
        return displayed;
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
        Boolean displayed = isDisplayed(pageElements.weatherApiTab);
        return displayed;
    }

    public void clickQueryBuilderTab() {
        CommonLib.info("Going to click on query builder tab");
        click(pageElements.queryBuilderTab);
    }

    /**
     * This method is used to check query builder is visible or not
     */
    public boolean isQueryBuilderTabVisible() {
        Boolean displayed = isDisplayed(pageElements.queryBuilderTab);
        return displayed;
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
        Boolean displayed = isDisplayed(pageElements.pricingTab);
        return displayed;
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
      Boolean displayed = isDisplayed(pageElements.apiDocsTab);
      return displayed;
    }

    /**
     * This method is used to check search docs box is visible
     */
    public void clickSearchDocsBox(){
        CommonLib.info("Going to click on Search docs box");
        click(pageElements.searchDocsBox);
    }
    public boolean isSearchDocsBoxVisible(){
        Boolean displayed = isDisplayed(pageElements.searchDocsBox);
        return displayed;
    }

    /**
     * This method is used to check sign in tab is visible
     */

    public void signInTab(){
        CommonLib.info("Going to click on sign in tab");
        click(pageElements.signInTab);
    }
    public boolean isSignInTabVisible(){
        Boolean displayed = isDisplayed(pageElements.signInTab);
        return displayed;
    }

    /**
     * This method is used to check sign up tab is visible
     */
    public void signUpTab(){
        CommonLib.info("Going to click on sign up tab");
        click(pageElements.signUpTab);
    }
    public boolean isSignUpTabVisible(){
        Boolean displayed = isDisplayed(pageElements.signUpTab);
        return displayed;
    }

    /**
     * This method is used to check weather data and Api header is visible
     */
    public void weatherDataAndApiHeader(){
        CommonLib.info("Going to click on weather data and Api header");
        click(pageElements.weatherDataAndApiHeader);
    }
    public boolean isWeatherDataAndApiHeaderVisible(){
        Boolean displayed = isDisplayed(pageElements.weatherDataAndApiHeader);
        return displayed;
    }

    /**
     * This method is used to check global forecast and history data header is visible
     */
    public void globalForecastAndHistoryDataHeader(){
        CommonLib.info("Going to click on global forecast and history data header");
        click(pageElements.globalForecastAndHistoryDataHeader);
    }
    public boolean isGlobalForecastAndHistoryDataHeaderVisible(){
        Boolean displayed = isDisplayed(pageElements.globalForecastAndHistoryDataHeader);
        return displayed;
    }

    /**
     * This method is used to check download data header is visible
     */
    public void downloadDataHeader(){
        CommonLib.info("Going to click on download data header");
        click(pageElements.downloadDataHeader);
    }
    public boolean isDownloadDataHeaderVisible(){
        Boolean displayed = isDisplayed(pageElements.downloadDataHeader);
        return displayed;
    }

    /**
     * This method is used to check enter location text box is visible
     */
    public void enterLocationTextBox(){
        CommonLib.info("Going to click on enter location text box");
        click(pageElements.enterLocationTextBox);
    }
    public boolean isEnterLocationTextBoxVisible(){
        Boolean displayed = isDisplayed(pageElements.enterLocationTextBox);
        return displayed;
    }

    /**
     * This method is used to click on enter location search icon
     */
    public void enterLocationSearchIcon(){
        CommonLib.info("Going to click on search icon");
        click(pageElements.enterLocationSearchIcon);
    }
    public boolean isEnterLocationSearchIconVisible(){
        Boolean displayed = isDisplayed(pageElements.enterLocationSearchIcon);
        return displayed;
    }
    public void dashBoardAndToolsHeader(){
        CommonLib.info("Going to click on dashboard and tools header");
        click(pageElements.dashBoardAndToolsHeader);
    }
    public boolean isDashBoardAndToolsHeaderVisible(){
        Boolean displayed = isDisplayed(pageElements.dashBoardAndToolsHeader);
        return displayed;
    }


}





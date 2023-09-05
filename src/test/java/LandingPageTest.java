import com.code.bull.commonutils.actions.AssertActions;
import com.code.bull.commonutils.commonlib.CommonLib;
import com.code.bull.driver.Driver;
import io.opentelemetry.sdk.trace.internal.data.ExceptionEventData;
import org.testng.annotations.Test;

public class LandingPageTest extends Driver {




    @Test(priority = 1, description = "To verify that weather data tab header is visible")
    public void testIsWeatherTabVisible(){
       try {
           boolean weatherTabVisible = pages.getLandingPage().isWeatherTabVisible();
           assertCheck.append(AssertActions.assertEqualBoolean(weatherTabVisible,true,"weather tab visible succesfully "));
           AssertActions.checkAllAssertCheck(assertCheck);
       }catch (Exception e){
           CommonLib.error(e.getMessage(),true);
       }
    }
    @Test(priority = 2, description = "To verify that weather Api Tab is visible")
    public void testIsWeatherApiTabVisible() {
        try {
            boolean weatherApiTabVisible = pages.getLandingPage().isWeatherApiTabVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(weatherApiTabVisible, true, "weather Api tab visible successfully, weather Api tab is not visible"));
            AssertActions.checkAllAssertCheck(assertCheck);
        } catch (Exception e) {
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 3, description = "To verify that query builder tab is visible")
    public void testIsQueryBuilderTabVisible(){
        try{
           boolean testIsQueryBuilderTabVisible= pages.getLandingPage().isQueryBuilderTabVisible();
           assertCheck.append(AssertActions.assertEqualBoolean(testIsQueryBuilderTabVisible,true,"query builder tab is visible successfully, query builder tab is not visible"));
           AssertActions.checkAllAssertCheck(assertCheck);
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 4, description = "To verify that pricing tab is visible")
    public void testIsPricingTabVisible() {
        try {
            boolean testIsPricingTabVisible = pages.getLandingPage().isPricingTabVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsPricingTabVisible, true, "pricing tab is visible successfully, pricing tab is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 5, description = "To verify that Api Docs tab is visible")
    public void testIsApiDocsTabVisible(){
        try {
            boolean testIsApiDocsTabVisible = pages.getLandingPage().isApiDocsTabVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsApiDocsTabVisible, true, "api docs tab is visible successfully, api docs tab is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 6, description = "To verify that search docs box is visible")
    public void testIsSearchDocsBoxVisible(){
        try {
            boolean testIsSearchDocsBoxVisible = pages.getLandingPage().isSearchDocsBoxVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsSearchDocsBoxVisible, true,"search docs box is visible successfully, search docs box is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(),true);
        }
    }
    @Test(priority = 7, description = "To verify that sign in tab is visible")
    public void testIsSignInTabVisible(){
        try{
            boolean testIsSignInTabVisible = pages.getLandingPage().isSignInTabVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsSignInTabVisible, true, "sign in tab is visible, sign in tab is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 8, description = "To verify sign up tab is visible")
    public void testIsSignUpTabVisible(){
        try{
            boolean testIsSignUpTabVisible = pages.getLandingPage().isSignUpTabVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsSignUpTabVisible, true, "sign up tab is visible successfully,sign up tab is  not visible "));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 9, description = "To verify weather data and Api header is visible")
    public void testIsWeatherDataAndApiHeaderVisible(){
        try{
            boolean testIsWeatherAndApiHeaderVisible = pages.getLandingPage().isWeatherDataAndApiHeaderVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsWeatherAndApiHeaderVisible, true, "weather data and api header is visible successfully, weather data and api header is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 10, description = "To verify global forecast and history data header is visible")
    public void testisGlobalForecastAndHistoryDataHeaderVisible(){
        try {
            boolean testisGlobalForecastAndHistoryDataHeaderVisible = pages.getLandingPage().isGlobalForecastAndHistoryDataHeaderVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testisGlobalForecastAndHistoryDataHeaderVisible, true, "global forecast and history data header is visible successfully, global forecast and history data header is not visible "));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 11, description = "To verify download data header is visible")
    public void testIsDownloadDataHeaderVisible(){
        try {
            boolean testIsDownloadDataHeaderVisible = pages.getLandingPage().isDownloadDataHeaderVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsDownloadDataHeaderVisible, true, "download data header is visible successfully, download data header is not visible "));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority = 12)
    public void testIsEnterLocationTextBoxVisible(){
        try{
            boolean testIsEnterLocationTextBoxVisible = pages.getLandingPage().isEnterLocationTextBoxVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsEnterLocationTextBoxVisible, true, "enter location text box is visible successfully, enter location text box is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }
    @Test(priority =  13)
    public void testIsEnterLocationSearchIconVisible(){
        try {
            boolean testIsEnterLocationSearchIconVisible = pages.getLandingPage().isEnterLocationSearchIconVisible();
            assertCheck.append(AssertActions.assertEqualBoolean(testIsEnterLocationSearchIconVisible, true, "search icon is visible successfully, searrch icon is not visible"));
        }catch (Exception e){
            CommonLib.error(e.getMessage(), true);
        }
    }








}


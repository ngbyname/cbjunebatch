import com.code.bull.commonutils.actions.AssertActions;
import com.code.bull.commonutils.applicationutils.constants.ApplicationConstants;
import com.code.bull.commonutils.commonlib.CommonLib;
import com.code.bull.driver.Driver;
import org.testng.annotations.Test;

public class LoginPageTest extends Driver {

    private static final String CITY_NAME = constants.getValue(ApplicationConstants.CITY_NAME);

    /**
     * 1. script is not working with headless -true mode
     * 2. console log - Done
     * 3. default report is not visible --> instead of this we will implement Extent Report
     * 4. Code walkthrough and definition
     *
     * Assignment - what is extent report
     */

    @Test(priority = 1, groups = {"RegressionTest"})
    public void testCityWeather() {
        try {
            pages.getLandingPage().clickCookiesModal();
            String currentUrl = pages.getLandingPage().getUrl();
            assertCheck.append(AssertActions.assertEqualString(currentUrl, "https://www.visualcrossing.com/", "Landing Page Opened Successfully", "Landing Page NOT Opened Successfully " + currentUrl));
            pages.getLandingPage().clickWeatherTab();
            String currentUrl1 = pages.getLandingPage().getUrl();
            assertCheck.append(AssertActions.assertEqualString(currentUrl1, "https://www.visualcrossing.com/weather-data", "Weather Tab Page Opened Successfully", "Weather Tab Page NOT Opened Successfully " + currentUrl1));
            pages.getWeatherDataPage().enterCityName(CITY_NAME);
            pages.getWeatherDataPage().clickSearchBtn();
            String currentUrl2 = pages.getLandingPage().getUrl();
            boolean isCityPresent = currentUrl2.contains(CITY_NAME);
            assertCheck.append(AssertActions.assertEqualBoolean(isCityPresent, true, "Your " + CITY_NAME + " City's weather data shown Successfully", "Your " + CITY_NAME + " City's weather data NOT shown Successfully " + currentUrl2));
            AssertActions.checkAllAssertCheck(assertCheck);
        } catch (Exception e) {
            CommonLib.error(e.getMessage());
        }
    }
}

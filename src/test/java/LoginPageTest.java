import com.code.bull.commonutils.actions.AssertActions;
import com.code.bull.commonutils.applicationutils.constants.ApplicationConstants;
import com.code.bull.commonutils.commonlib.CommonLib;
import com.code.bull.driver.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Driver {

    private static final String CITY_NAME = constants.getValue(ApplicationConstants.CITY_NAME);

    /**
     * 1. script is not working with headless -true mode - Done
     * 2. console log - Done
     * 3. default report is not visible --> instead of this we will implement Extent Report
     * 4. Code walkthrough and definition
     * 5. according to your suite type we need to define our xml and need to grouping as well
     * <p>
     * Assignment - what is extent report
     */


    @Test(priority = 1, groups = {"RegressionTest", "SanityTest", "SmokeTest"}, description = "To verify cookies modal is visible and removed after click")
    public void testCookiesModal() {
        try {
            pages.getLandingPage().clickCookiesModal();
            String currentUrl = pages.getLandingPage().getUrl();
            assertCheck.append(AssertActions.assertEqualStringType(currentUrl, "https://www.visualcrossing.com/", "Landing Page Opened Successfully", "Landing Page NOT Opened Successfully " + currentUrl));
        } catch (Exception e) {
            CommonLib.error("Error in testCookiesModal method" + e.getMessage(), true);
        }
        AssertActions.checkAllAssertCheck(assertCheck);
    }

    @Test(priority = 2, dependsOnMethods = "testCookiesModal", groups = {"RegressionTest", "SanityTest"})
    public void testWeatherTab() {
        try {
            pages.getLandingPage().clickWeatherTab();
            String currentUrl1 = pages.getLandingPage().getUrl();
            assertCheck.append(AssertActions.assertEqualStringType(currentUrl1, "https://www.visualcrossing.com/weather-data", "Weather Tab Page Opened Successfully", "Weather Tab Page NOT Opened Successfully " + currentUrl1));
        } catch (Exception e) {
            CommonLib.error("Error in testWeatherTab method" + e.getMessage(), true);
        }
        AssertActions.checkAllAssertCheck(assertCheck);
    }

    @Test(priority = 3, dependsOnMethods = "testWeatherTab", groups = {"RegressionTest"})
    public void testCityWeather() {
        try {
            pages.getWeatherDataPage().enterCityName(CITY_NAME);
            pages.getWeatherDataPage().clickSearchBtn();
            String currentUrl2 = pages.getLandingPage().getUrl();
            boolean isCityPresent = currentUrl2.contains(CITY_NAME);
            assertCheck.append(AssertActions.assertEqualBoolean(isCityPresent, true, "Your " + CITY_NAME + " City's weather data shown Successfully", "Your " + CITY_NAME + " City's weather data NOT shown Successfully " + currentUrl2));
        } catch (Exception e) {
            CommonLib.error("Error in testCityWeather method" + e.getMessage(), true);
        }
        AssertActions.checkAllAssertCheck(assertCheck);
    }
}

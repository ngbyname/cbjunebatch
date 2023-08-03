import com.code.bull.commonutils.actions.AssertActions;
import com.code.bull.commonutils.applicationutils.constants.ApplicationConstants;
import com.code.bull.commonutils.commonlib.CommonLib;
import com.code.bull.driver.Driver;
import org.testng.annotations.Test;

public class LoginPageTest extends Driver {

    private static final String CITY_NAME = constants.getValue(ApplicationConstants.CITY_NAME);

    @Test(priority = 1)
    public void test() {
        try {
            pages.getLandingPage().clickCookiesModal();
            /**
             * 1. To verify after click on cookies modal your url should be this --> https://www.visualcrossing.com/
             * Actual - Your url
             * Expected - https://www.visualcrossing.com/
             * actual == expected --> your test case got passed
             *
             * agar actual != expected --> apka test case fail
             *
             * apko assert kerna hai ki after click on cookie modal apka url (https://www.visualcrossing.com/) ye hai ya nhi?
             */
            String currentUrl = pages.getLandingPage().getUrl();
            assertCheck.append(AssertActions.assertEqualString(currentUrl, "https://www.visualcrossing.com/", "Landing Page Opened Successfully", "Landing Page NOT Opened Successfully " + currentUrl));
            pages.getLandingPage().clickWeatherTab();
            //Assert2
            pages.getWeatherDataPage().enterCityName(CITY_NAME);
            //Assert3
            pages.getWeatherDataPage().clickSearchBtn();
            //Assert4
            //Assert5
        } catch (Exception e) {
            CommonLib.error(e.getMessage());
        }
    }
}

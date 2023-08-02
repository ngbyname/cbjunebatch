import com.code.bull.driver.Driver;
import org.testng.annotations.Test;

public class LoginPageTest extends Driver {

    @Test(priority = 1)
    public void test() {
        try {
            pages.getLandingPage().clickCookiesModal();
            //Assert1
            pages.getLandingPage().clickWeatherTab();
            //Assert2
            pages.getWeatherDataPage().enterCityName("Gurgaon");
            //Assert3
            pages.getWeatherDataPage().clickSearchBtn();
            //Assert4
            //Assert5
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

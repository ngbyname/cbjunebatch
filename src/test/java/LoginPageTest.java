import com.code.bull.driver.Driver;
import org.testng.annotations.Test;

public class LoginPageTest extends Driver {

    @Test(priority = 1)
    public void test() {
        try {
            pages.getLandingPage().clickCookiesModal();
            pages.getLandingPage().clickWeatherTab();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

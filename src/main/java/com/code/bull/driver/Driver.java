package com.code.bull.driver;


import com.code.bull.commonutils.applicationutils.constants.ApplicationConstants;
import com.code.bull.commonutils.applicationutils.constants.ConstantUtils;
import com.code.bull.pagerepository.pagemethods.common.PageCollections;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Driver {

    /**
     * This is class variable
     */
    private static String browser = System.getProperty("browser");
    private static String env = System.getProperty("env");
    public static WebDriver driver;
    public static String BASE_URL;
    public static ConstantUtils constants = ConstantUtils.getInstance();
    public static PageCollections pages;
    public static StringBuilder assertCheck;


    @BeforeSuite(alwaysRun = true)
    public void setup() {
        envSetup();
        browser();
    }

    @BeforeClass
    public void pageSetup() {
        try {
            initializePage();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @BeforeMethod
    public void methodLevelSetup() {
        assertCheck = new StringBuilder();
    }

    @AfterSuite
    public void closeSetup() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }


    /**
     * This method is used to set the env
     */
    private void envSetup() {

        BASE_URL = constants.getValue(ApplicationConstants.BASE_URL);

        if (env.equalsIgnoreCase("sit")) {
            env = "SIT";
        } else if (env.equalsIgnoreCase("uat")) {
            env = "UAT";
        } else if (env.equalsIgnoreCase("prod")) {
            env = "PROD";
        } else {
            env = "SIT";
        }
    }

    private void browser() {
        try {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    browserCapabilities();
                    openBaseUrl(BASE_URL);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                default:
                    break;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void browserCapabilities() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("window-size=1792,1120");
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    /**
     * This method will initialize the page collection class
     */
    private void initializePage() {
        pages = new PageCollections(driver);
    }

    /**
     * This method will open your website
     *
     * @param baseUrl the website url
     */
    public void openBaseUrl(String baseUrl) {
        driver.get(baseUrl);
    }

}












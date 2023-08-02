package com.code.bull.pagerepository.pagemethods.subtabs;

import com.code.bull.pagerepository.pagelocators.WeatherDataTabElements;
import com.code.bull.pagerepository.pagemethods.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WeatherDataTabPage extends BasePage {

    WeatherDataTabElements tabElements;

    public WeatherDataTabPage(WebDriver driver) {
        //super(driver);
        tabElements = PageFactory.initElements(driver, WeatherDataTabElements.class);
    }


    public void enterCityName(String text) {
        enterText(tabElements.searchBox, text, "Not able to enter text in enterCityName method");
    }

    public void clickSearchBtn() {
        click(tabElements.searchBtn);
    }
}

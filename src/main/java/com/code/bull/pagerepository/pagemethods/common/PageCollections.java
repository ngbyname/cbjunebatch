package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.driver.Driver;
import org.openqa.selenium.WebDriver;

public class PageCollections extends Driver {

    private final WebDriver driver;

    public PageCollections(WebDriver driver){
        this.driver=driver;
    }
}

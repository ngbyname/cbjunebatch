package com.code.bull.pagerepository.pagelocators;

import org.openqa.selenium.By;

public class WeatherDataTabElements {
    public static final By searchBox = By.xpath("//input[@placeholder='Enter a location']");
    public static final By searchBtn = By.xpath("//button[text()='Search']");
    public static final By heading1 = By.xpath("//*[@class='page-wrapper']/section/h1");
    public static final By heading2City = By.xpath("//*[@id='locationDropdownMenuButton']");
    public static final By heading2 = By.xpath("//*[text()='Weather History for ']");
}

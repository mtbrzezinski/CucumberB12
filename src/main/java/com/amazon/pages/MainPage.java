package com.amazon.pages;

import Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    /*
    1-Navigate to the amazon website
    2-iphone 13 case
    3-validate the number is
    4-validate all header has "iPhone"
    */

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchBoxField;

    @FindBy(xpath = "//span[contains(text(), 'iPhone 13')]")
    List<WebElement> allProducts;

    @FindBy(xpath = "//span[contains(text(),'of over')]")
    WebElement results;

    @FindBy(xpath = "//h2//a")
    List<WebElement> allHeaders;

    public void setSearchBoxField(String searchFor) {
        searchBoxField.sendKeys(searchFor, Keys.ENTER);
    }

    public int resultOfSearch() {
        String[] result = results.getText().trim().split(" ");
        int lastResult = Integer.parseInt(result[3].replace(",", ""));
        return lastResult;
    }

    public void validateHeaders(String word) {
        for (WebElement header : allHeaders) {
            if (!BrowserUtils.getText(header).equals("")) {
                Assert.assertTrue(BrowserUtils.getText(header).contains(word));
            }
        }
    }
}
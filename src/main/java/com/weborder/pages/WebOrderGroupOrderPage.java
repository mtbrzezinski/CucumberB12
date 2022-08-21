package com.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderGroupOrderPage {
    public WebOrderGroupOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[contains(text(),'View Group Order')]")
    WebElement viewGroupOrderHeader;

    @FindBy(xpath = "//div[@class='row py-1'][4]//div[@class='col-sm-8']")
    WebElement totalParticipants;

    public String viewGroupOrder(){
        return viewGroupOrderHeader.getText();
    }
    public String getTotalParticipants(){
        return totalParticipants.getText();
    }
}

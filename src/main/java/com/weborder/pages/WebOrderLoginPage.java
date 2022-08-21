package com.weborder.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderLoginPage {
    public WebOrderLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign')]")
    WebElement signInBtn;

    @FindBy(xpath = "//div[contains(text(),'Failed')]")
    WebElement errorMessage;


    public void webOrderLogin(String email, String password){
        this.email.clear();
        this.email.sendKeys(email);
        this.password.clear();
        this.password.sendKeys(password);
        signInBtn.click();
    }
    public String getErrorMessage(){
        return BrowserUtils.getText(errorMessage);
    }
//correct username, wrong title
    //wrong username, correct password
    //nothing
    //validate error message


}

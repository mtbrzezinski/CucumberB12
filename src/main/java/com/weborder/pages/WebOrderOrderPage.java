package com.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebOrderOrderPage {
    public WebOrderOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'ORDER DETAILS')]")
    WebElement orderDetails;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    WebElement groupOrderCheckBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement nextButton;

    @FindBy(id = "ConfirmAddressID")
    WebElement myLocation;

    @FindBy(xpath = "//div[@id='addressPreview']")
    WebElement deliveryAddress;

    @FindBy(xpath = "//textarea[@id='InviteNote']")
    WebElement noteToInvitees;

    @FindBy(xpath = "//textarea[@id='InviteList']")
    WebElement inviteList;

    @FindBy(id="createGroupOrder")
    WebElement createOrderBtn;



    public String orderDetailsMessage(){
        return orderDetails.getText();
    }
    public void groupOrderBox(){
        groupOrderCheckBox.click();
        nextButton.click();
    }
    public void myLocation(String location){
        Select select = new Select(myLocation);
        select.selectByVisibleText(location);
    }
    public boolean myAddress(String address){
        return deliveryAddress.getText().contains(address);
    }
    public void sendNoteToInvitees(String sendNote){
        noteToInvitees.sendKeys(sendNote);
    }
    public void setInviteList(String email1, String email2){
        inviteList.sendKeys(email1, email2);
    }
    public void createOrder(){
        createOrderBtn.click();
    }



}


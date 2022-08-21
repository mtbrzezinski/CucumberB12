package com.weborder.stepdefinitions;

import Utils.ConfigReader;
import Utils.DriverHelper;
import com.weborder.pages.WebOrderGroupOrderPage;
import com.weborder.pages.WebOrderLoginPage;
import com.weborder.pages.WebOrderOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebOrderOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    WebOrderOrderPage webOrderOrderPage = new WebOrderOrderPage(driver);
    WebOrderGroupOrderPage groupOrderPage = new WebOrderGroupOrderPage(driver);

    @And("User selects Group Order and clicks Next Button")
    public void user_selects_group_order_and_clicks_next_button() {
        webOrderOrderPage.groupOrderBox();
    }

    @When("User validates the address {string} contains {string}")
    public void user_validates_the_address_contains(String location, String addressOfHouse) {
        webOrderOrderPage.myLocation(location);
        Assert.assertTrue(webOrderOrderPage.myAddress(addressOfHouse));

    }
    @Then("User sends {string} note for Note To Invitees")
    public void user_sends_note_for_note_to_invitees(String note) {
        webOrderOrderPage.sendNoteToInvitees(note);
    }
    @And("User sends {string} and {string} to Invite List")
    public void user_sends_and_to_invite_list(String email1, String email2) {
        webOrderOrderPage.setInviteList(email1, email2);

    }
    @Then("User clicks Create Group Order Button")
    public void user_clicks_create_group_order_button() {
        webOrderOrderPage.createOrder();
    }
    @And("User validates {string} header")
    public void user_validates_header(String expectedGroupOrderHeader) {
        Assert.assertEquals(expectedGroupOrderHeader, groupOrderPage.viewGroupOrder());

    }
    @Then("User validates {string} Total Participants number")
    public void user_validates_total_participants_number(String expectedParticipants) {
        Assert.assertEquals(expectedParticipants, groupOrderPage.getTotalParticipants());

driver.quit();
    }


}

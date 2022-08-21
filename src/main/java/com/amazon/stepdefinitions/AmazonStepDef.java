package com.amazon.stepdefinitions;

import com.amazon.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStepDef {
    WebDriver driver;
    MainPage mainPage;
    @Given("User navigates to Amazon")
    public void user_navigates_to_amazon() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.com/");
    }
    @When("User searches for iPhone {int} cases")
    public void user_searches_for_i_phone_cases(Integer int1) {
        mainPage = new MainPage(driver);
        mainPage.setSearchBoxField("iPhone 13 cases");
    }
    @Then("User gets {int} links on Amazon")
    public void user_gets_links_on_amazon(int expectedResult) {
    mainPage = new MainPage(driver);
    Assert.assertEquals(expectedResult, mainPage.resultOfSearch());
    }
    @Then("User validates all headers contains iPhone")
    public void user_validates_all_headers_contains_i_phone() {
    mainPage = new MainPage(driver);
    mainPage.validateHeaders("iPhone");
    }


}

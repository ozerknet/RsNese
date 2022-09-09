package com.rs.stepDefinitions;

import com.rs.pages.basePage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.ConfigurationReader;
import com.rs.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class endToEndTest1 {

    basePage basePage = new basePage();
    Actions actions = new Actions(Driver.getDriver());
    String actualNameOfFirstProduct;

    @When("user go to webpage")
    public void user_go_to_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("rsOnlineUrl"));
        basePage.bannerAcceptAllButton.click();
//        actions.moveToElement(basePage.bannerAcceptAllButton).click().perform();
    }

    @When("user click Contactors")
    public void user_click_contactors() {
        basePage.Contactors.click();

    }

    @When("user click to first product add to chart button")
    public void user_click_to_first_product_add_to_chart_button() {
        String FirstProductName = basePage.firstProductOnThePage.getText();
        actualNameOfFirstProduct = FirstProductName;
        basePage.firstProductOnThePageButton.click();

    }

    @Then("user click to cart button")
    public void user_click_to_cart_button() {
        BrowserUtils.waitFor(2);
        basePage.cart.click();

    }

    @Then("user check right product inside the chart")
    public void user_check_right_product_inside_the_chart() {
        basePage.noThanks.click();
        String inCartFirstProductName = basePage.inCartFirstProduct.getText();
        Assert.assertEquals(inCartFirstProductName, actualNameOfFirstProduct);
    }
}

package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class basePage {
    public basePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='ensCloseBanner']") // #ensCloseBanner
    public WebElement bannerAcceptAllButton;

    @FindBy(xpath = "//a[@title='Contactors']")
    public WebElement Contactors;

    @FindBy(xpath = "//div[@class='Box-sc-1a4tiu7-0 MiniBasket__CartCount-sc-5l8nlu-0 MiniBasket__DesktopCartCount-sc-5l8nlu-2 mjZqt']")
    public WebElement cart;


    //--------------------------- Contractors --------------------------//

    @FindBy(xpath = "(//div[@data-qa='product-tile-title'])[1]")
    public WebElement firstProductOnThePage;

    @FindBy(xpath = "(//button[@class='src__Component-sc-tb89nx-0 kFKHVW src__ButtonStyle-sc-1r3bpf8-0 eNNVSE'])[1]")
    public WebElement firstProductOnThePageButton;

    //--------------------------- Give Feed Back --------------------------//

    @FindBy(xpath = "//button[@class='fsrButton fsrButton__inviteDecline fsrDeclineButton']")
    public WebElement noThanks;


    //--------------------------- Inside Cart --------------------------//
    @FindBy(xpath = "//div[@data-testid='Product__description']")
    public WebElement inCartFirstProduct;

}

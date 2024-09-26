package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    //checkout page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement checkoutPageTitle;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //checkout page title getter
    public String getCheckoutPageTitle() {return checkoutPageTitle.getText();}

}

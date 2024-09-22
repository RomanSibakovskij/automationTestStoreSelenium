package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    //create account page title web element
    @FindBy(xpath = "//h1/span[@class='maintext']")
    private WebElement createAccountPageTitle;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    //create account page title getter
    public String getCreateAccountPageTitle() {return createAccountPageTitle.getText();}

    //create account page web element assert method
    public boolean isCreateAccountPageTitleIsDisplayed(){return createAccountPageTitle.isDisplayed();}
}

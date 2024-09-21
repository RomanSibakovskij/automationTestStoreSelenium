package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginRegisterPage extends BasePage{

    //account login title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement accountLoginPageTitle;


    public LoginRegisterPage(WebDriver driver) {
        super(driver);
    }


    //login/register page web element assert method
    public boolean isAccountLoginPageTitleDisplayed() {return accountLoginPageTitle.isDisplayed();}

    //account login title getter
    public String getAccountLoginPageTitleText() {return accountLoginPageTitle.getText();}

}

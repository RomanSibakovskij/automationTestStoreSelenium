package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginRegisterPage extends BasePage{

    //account login title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement accountLoginPageTitle;
    //account register button web element
    @FindBy(xpath = "//form[@id='accountFrm']//button[@type='submit']")
    private WebElement registerButton;


    public LoginRegisterPage(WebDriver driver) {
        super(driver);
    }

    //register button click method
    public void clickRegisterButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }

    //login/register page web element assert methods
    public boolean isAccountLoginPageTitleDisplayed() {return accountLoginPageTitle.isDisplayed();}
    public boolean isRegisterButtonDisplayed() {return registerButton.isDisplayed();}

    //account login title getter
    public String getAccountLoginPageTitleText() {return accountLoginPageTitle.getText();}

}

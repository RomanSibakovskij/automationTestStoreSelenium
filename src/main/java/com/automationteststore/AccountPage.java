package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AccountPage extends BasePage{

    //account dashboard hover menu web element
    @FindBy(xpath = "//ul[@id='customer_menu_top']/li[@class='dropdown']/a[@class='top menu_account']")
    private WebElement accountDashboardHoverMenu;
    //user logout link web element
    @FindBy(xpath = "//ul[@class='side_account_list']/li[10]/a")
    private WebElement logOutLink;
    //account logout confirmation web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement logOutConfirmationMessage;
    //'continue' button after logout confirmation web element
    @FindBy(xpath = "//a[@title='Continue']")
    private WebElement continueAfterLogOutButton;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    //logout link click method
    public void clickLogOutLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(logOutLink));
        logOutLink.click();
    }

    //'continue' button after logout confirmation click method
    public void clickContinueAfterLogOutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(continueAfterLogOutButton));
        continueAfterLogOutButton.click();
    }

    //account dashboard user first name getter
    public String getFirstNameFromDashboardText() {
        String dashboardText = accountDashboardHoverMenu.getText();
        String[] words = dashboardText.split(" ");
        String firstName = words[words.length - 1];
        return firstName;
    }
    //account logout confirmation message getter
    public String getAccountLogOutConfirmationMessage() {return logOutConfirmationMessage.getText();}

    //account page web element assert methods
    public boolean isAccountDashboardHoverMenuDisplayed() {return accountDashboardHoverMenu.isDisplayed();}
    public boolean isLogOutLinkDisplayed() {return logOutLink.isDisplayed();}
}

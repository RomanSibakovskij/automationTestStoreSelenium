package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    //homepage header logo web element
    @FindBy(xpath = "//img[@title='Automation Test Store']")
    private WebElement automationStoreHeaderLogo;
    //homepage header link web elements
    @FindBy(xpath = "//ul[@id='customer_menu_top']/li/a")
    private WebElement loginRegisterNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_specials']")
    private WebElement specialsNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_account']")
    private WebElement accountNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_cart']")
    private WebElement cartNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_checkout']")
    private WebElement checkoutNavLink;
    //homepage header search input field web element
    @FindBy(xpath = "//input[@id='filter_keyword']")
    private WebElement searchInputField;
    //search bar icon button web element
    @FindBy(xpath = "//div[@class='button-in-search']")
    private WebElement searchIconButton;
    @FindBy(xpath = "//ul[@class='nav language pull-left']/li[@class='dropdown hover']")
    private WebElement currencyHoverMenu;
    @FindBy(xpath = "//ul[@class='nav topcart pull-left']/li[@class='dropdown hover']")
    private WebElement cartHoverMenu;
    //social icon button web elements
    @FindBy(xpath = "//div[@class='header_block']/div[@class='social_icons']/a[@class='facebook']")
    private WebElement facebookIconButton;
    @FindBy(xpath = "//div[@class='header_block']/div[@class='social_icons']/a[@class='twitter']")
    private WebElement twitterIconButton;
    @FindBy(xpath = "//div[@class='header_block']/div[@class='social_icons']/a[@class='linkedin']")
    private WebElement linkedinIconButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //click login/register link method
    public void clickLoginRegisterLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(loginRegisterNavLink));
        loginRegisterNavLink.click();
    }

    //homepage web element asserts
    public boolean isAutomationStoreLogoDisplayed() {return automationStoreHeaderLogo.isDisplayed();}
    public boolean isLoginRegisterNavLinkDisplayed() {return loginRegisterNavLink.isDisplayed();}
    public boolean isSpecialsNavLinkDisplayed() {return specialsNavLink.isDisplayed();}
    public boolean isAccountNavLinkDisplayed() {return accountNavLink.isDisplayed();}
    public boolean isCartNavLinkDisplayed() {return cartNavLink.isDisplayed();}
    public boolean isCheckoutNavLinkDisplayed() {return checkoutNavLink.isDisplayed();}
    public boolean isSearchInputFieldDisplayed() {return searchInputField.isDisplayed();}
    public boolean isSearchIconButtonDisplayed() {return searchIconButton.isDisplayed();}
    public boolean isCurrencyHoverMenuDisplayed() {return currencyHoverMenu.isDisplayed();}
    public boolean isCartHoverMenuDisplayed() {return cartHoverMenu.isDisplayed();}
    public boolean isFacebookIconButtonDisplayed() {return facebookIconButton.isDisplayed();}
    public boolean isTwitterIconButtonDisplayed() {return twitterIconButton.isDisplayed();}
    public boolean isLinkedinIconButtonDisplayed() {return linkedinIconButton.isDisplayed();}

}

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
    //homepage navbar category web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[1]/a")
    private WebElement homeHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[2]/a")
    private WebElement apparelAccessoriesHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/a")
    private WebElement makeupHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/a")
    private WebElement skincareHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[5]/a")
    private WebElement fragranceHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[6]/a")
    private WebElement menHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[7]/a")
    private WebElement haircareHoverMenu;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[8]/a")
    private WebElement booksHoverMenu;
    //homepage banner slider web element
    @FindBy(xpath = "//div[@class='banner_container']")
    private WebElement bannerSlider;
    //homepage section web elements
    @FindBy(xpath = "//section[@class='row promo_section']/div[1]/div[2]")
    private WebElement fastShippingLabel;
    @FindBy(xpath = "//section[@class='row promo_section']/div[2]/div[2]")
    private WebElement easyPaymentLabel;
    @FindBy(xpath = "//section[@class='row promo_section']/div[3]/div[2]")
    private WebElement shippingOptionsLabel;
    @FindBy(xpath = "//section[@class='row promo_section']/div[4]/div[2]")
    private WebElement largeVarietyLabel;
    //homepage welcome section web element
    @FindBy(xpath = "//section[@class='contentpanel']/div/h4")
    private WebElement welcomeMessage;


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
    public boolean isHomeHoverMenuDisplayed(){return homeHoverMenu.isDisplayed();}
    public boolean isApparelAccessoriesHoverMenuDisplayed(){return apparelAccessoriesHoverMenu.isDisplayed();}
    public boolean isMakeupHoverMenuDisplayed(){return makeupHoverMenu.isDisplayed();}
    public boolean isSkincareHoverMenuDisplayed(){return skincareHoverMenu.isDisplayed();}
    public boolean isFragranceHoverMenuDisplayed(){return fragranceHoverMenu.isDisplayed();}
    public boolean isMenHoverMenuDisplayed(){return menHoverMenu.isDisplayed();}
    public boolean isHaircareHoverMenuDisplayed(){return haircareHoverMenu.isDisplayed();}
    public boolean isBooksHoverMenuDisplayed(){return booksHoverMenu.isDisplayed();}
    public boolean isBannerSliderDisplayed(){return bannerSlider.isDisplayed();}
    public boolean isFastShippingLabelDisplayed(){return fastShippingLabel.isDisplayed();}
    public boolean isEasyPaymentLabelDisplayed(){return easyPaymentLabel.isDisplayed();}
    public boolean isShippingOptionsLabelDisplayed(){return shippingOptionsLabel.isDisplayed();}
    public boolean isLargeVarietyLabelDisplayed(){return largeVarietyLabel.isDisplayed();}
    public boolean isWelcomeMessageSectionDisplayed(){return welcomeMessage.isDisplayed();}

}

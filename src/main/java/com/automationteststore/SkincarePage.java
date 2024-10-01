package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SkincarePage extends BasePage{

    //skincare category page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement categoryProductPageTitle;
    //skincare gift wrapping checkbox web element
    @FindBy(xpath = "//input[@id='option340']")
    private WebElement skincareGiftCheckbox;

    //skincare quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement skincareQuantityInputField;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public SkincarePage(WebDriver driver) {
        super(driver);
    }

    //skincare category page title getter
    public String getCategoryProductPageTitle() {return categoryProductPageTitle.getText();}

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //skincare page web element assert methods
    public boolean isSkincareGiftCheckboxDisplayed() {return skincareGiftCheckbox.isDisplayed();}
    public boolean isSkincareQuantityInputFieldDisplayed() {return skincareQuantityInputField.isDisplayed();}
    public boolean isAddToCartButtonDisplayed() {return addToCartButton.isDisplayed();}

}

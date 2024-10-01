package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BooksPage extends BasePage{

    //hair care quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement hairCareQuantityInputField;
    //hair care price web element
    @FindBy(xpath = "//label[@class='control-label']/span[@class='total-price']")
    private WebElement hairCareTotalPrice;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //books page web element assert methods
    public boolean isQuantityInputFieldDisplayed(){return hairCareQuantityInputField.isDisplayed();}
    public boolean isTotalPriceDisplayed(){return hairCareTotalPrice.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}
}

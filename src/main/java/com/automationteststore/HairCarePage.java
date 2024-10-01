package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HairCarePage extends BasePage{

    //hair care conditioner size dropdown menu web element (Seaweed Conditioner)
    @FindBy(xpath = "//select[@id='option317']")
    private WebElement seaweedConditionerSizeDropdownMenu;
    //hair care conditioner size dropdown menu web element (Pro-V Color Hair Solutions Color Preserve Shine Conditioner (Pro-V))
    @FindBy(xpath = "//select[@id='option329']")
    private WebElement shineConditionerSizeDropdownMenu;

    //hair care quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement hairCareQuantityInputField;
    //hair care price web element
    @FindBy(xpath = "//label[@class='control-label']/span[@class='total-price']")
    private WebElement hairCareTotalPrice;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public HairCarePage(WebDriver driver) {
        super(driver);
    }

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //hair care page web element assert methods
    public boolean isSeaweedConditionerSizeDropdownMenuDisplayed(){return seaweedConditionerSizeDropdownMenu.isDisplayed();}
    public boolean isShineConditionerSizeDropdownMenuDisplayed(){return shineConditionerSizeDropdownMenu.isDisplayed();}
    public boolean isQuantityInputFieldDisplayed(){return hairCareQuantityInputField.isDisplayed();}
    public boolean isTotalPriceDisplayed(){return hairCareTotalPrice.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}

}

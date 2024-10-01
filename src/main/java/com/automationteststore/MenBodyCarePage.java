package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MenBodyCarePage extends BasePage{

    //men fragrance size dropdown menu web element (ck IN2U Eau De Toilette Spray for Him (Cl0001))
    @FindBy(xpath = "//select[@id='option320']")
    private WebElement menFragranceSizeDropdownMenu;
    //men fragrance size dropdown menu web element (Obsession Night Perfume (CK0013))
    @FindBy(xpath = "//select[@id='option326']")
    private WebElement menFragranceNightPerfumeSizeDropdownMenu;


    //men body care quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement menBodyCareQuantityInputField;
    //men body care price web element
    @FindBy(xpath = "//label[@class='control-label']/span[@class='total-price']")
    private WebElement menBodyCareTotalPrice;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public MenBodyCarePage(WebDriver driver) {
        super(driver);
    }

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //men body care category page web element assert method
    public boolean isMenFragranceSizeDropdownMenuDisplayed(){return menFragranceSizeDropdownMenu.isDisplayed();}
    public boolean isMenFragranceNightPerfumeSizeDropdownMenuDisplayed(){return menFragranceNightPerfumeSizeDropdownMenu.isDisplayed();}
    public boolean isQuantityInputFieldDisplayed(){return menBodyCareQuantityInputField.isDisplayed();}
    public boolean isTotalPriceDisplayed(){return menBodyCareTotalPrice.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}

}

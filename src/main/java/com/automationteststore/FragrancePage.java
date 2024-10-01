package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class FragrancePage extends BasePage{

    //makeup category page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement categoryProductPageTitle;
    //men fragrance size dropdown menu web element
    @FindBy(xpath = "//select[@id='option316']")
    private WebElement menFragranceSizeDropdownMenu;
    //women fragrance star rating web element
    @FindBy(xpath = "//ul[@class='rate']")
    private WebElement womenFragranceStarRating;
    //women fragrance size dropdown menu web element
    @FindBy(xpath = "//select[@id='option330']")
    private WebElement womenFragranceSizeDropdownMenu;

    //fragrance quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement makeupQuantityInputField;
    //fragrance price web element
    @FindBy(xpath = "//label[@class='control-label']/span[@class='total-price']")
    private WebElement fragranceTotalPrice;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public FragrancePage(WebDriver driver) {
        super(driver);
    }

    //fragrance category page title getter
    public String getCategoryProductPageTitle() {return categoryProductPageTitle.getText();}

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //fragrance page web element assert methods
    public boolean isStarRatingDisplayed(){return womenFragranceStarRating.isDisplayed();}
    public boolean isMenFragranceSizeDropdownMenuDisplayed(){return menFragranceSizeDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeDropdownMenuDisplayed(){return womenFragranceSizeDropdownMenu.isDisplayed();}
    public boolean isQuantityInputFieldDisplayed(){return makeupQuantityInputField.isDisplayed();}
    public boolean isTotalPriceDisplayed(){return fragranceTotalPrice.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}

}

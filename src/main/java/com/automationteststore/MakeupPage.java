package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MakeupPage extends BasePage{

    //makeup category page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement categoryProductPageTitle;
    //makeup eyes color dropdown menu web element
    @FindBy(xpath = "//select[@id='option319']")
    private WebElement eyesMakeupColorDropdownMenu;
    //makeup face color dropdown menu web element
    @FindBy(xpath = "//select[@id='option304']")
    private WebElement faceMakeupColorDropdownMenu;
    //makeup lips color dropdown menu web element
    @FindBy(xpath = "//select[@id='option305']")
    private WebElement lipsMakeupColorDropdownMenu;
    //makeup rouge lips color dropdown menu web element
    @FindBy(xpath = "//select[@id='option306']")
    private WebElement rougeLipsMakeupColorDropdownMenu;
    //makeup nails lacquer color dropdown menu web element
    @FindBy(xpath = "//select[@id='option307']")
    private WebElement lacquerNailsMakeupColorDropdownMenu;
    //makeup nails fluid shine color dropdown menu web element
    @FindBy(xpath = "//select[@id='option327']")
    private WebElement fluidShineNailsMakeupColorDropdownMenu;
    //makeup color design set color dropdown menu web element
    @FindBy(xpath = "//select[@id='option308']")
    private WebElement colorDesignMakeupColorDropdownMenu;

    //makeup star rating list web element
    @FindBy(xpath = "//ul[@class='rate']")
    private WebElement starRating;

    //makeup quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement makeupQuantityInputField;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;


    public MakeupPage(WebDriver driver) {
        super(driver);
    }

    //makeup category page title getter
    public String getCategoryProductPageTitle() {return categoryProductPageTitle.getText();}

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //makeup page web element assert methods
    public boolean isStarRatingDisplayed(){return starRating.isDisplayed();}
    public boolean isQuantityInputFieldDisplayed(){return makeupQuantityInputField.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}
    public boolean isEyesMakeupColorDropdownMenuDisplayed(){return eyesMakeupColorDropdownMenu.isDisplayed();}
    public boolean isFaceMakeupColorDropdownMenuDisplayed(){return faceMakeupColorDropdownMenu.isDisplayed();}
    public boolean isLipsMakeupColorDropdownMenuDisplayed(){return lipsMakeupColorDropdownMenu.isDisplayed();}
    public boolean isRougeLipsMakeupColorDropdownMenuDisplayed(){return rougeLipsMakeupColorDropdownMenu.isDisplayed();}
    public boolean isLacquerNailsMakeupColorDropdownMenuDisplayed(){return lacquerNailsMakeupColorDropdownMenu.isDisplayed();}
    public boolean isFluidShineNailsMakeupColorDropdownMenuDisplayed(){return fluidShineNailsMakeupColorDropdownMenu.isDisplayed();}
    public boolean isColorDesignMakeupColorDropdownMenuDisplayed(){return colorDesignMakeupColorDropdownMenu.isDisplayed();}
    
}

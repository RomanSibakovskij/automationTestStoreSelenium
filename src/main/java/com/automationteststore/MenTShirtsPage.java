package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenTShirtsPage extends BasePage{

    //t-shirt colour dropdown menu web element
    @FindBy(xpath = "//select[@id='option350']")
    private WebElement tShirtColourDropdownMenu;
    @FindBy(xpath = "//select[@id='option351']")
    private WebElement tShirtSizeDropdownMenu;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    //t-shirt color and size dropdown menu web element
    @FindBy(xpath = "//select[@id='option353']")
    private WebElement tShirtColourAndSizeDropdownMenu;
    //t-shirt color and size dropdown menu option web elements
    @FindBy(xpath = "//option[@value='781']")
    private WebElement tShirtColourXXLRedOption;
    @FindBy(xpath = "//option[@value='782']")
    private WebElement tShirtColourXLRedOption;
    @FindBy(xpath = "//option[@value='783']")
    private WebElement tShirtColourSRedOption;
    @FindBy(xpath = "//option[@value='784']")
    private WebElement tShirtColourXXLBlueOption;
    @FindBy(xpath = "//option[@value='785']")
    private WebElement tShirtColourLBlueOption;
    @FindBy(xpath = "//option[@value='786']")
    private WebElement tShirtColourXXLYellowOption;

    public MenTShirtsPage(WebDriver driver) {
        super(driver);
    }

    //men t-shirts (colour&size) dropdown menu button click method
    public void clickTShirtColourAndSizeDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(tShirtColourAndSizeDropdownMenu));
        tShirtColourAndSizeDropdownMenu.click();
    }

    //select XXL sized red t-shirt option(from men t-shirts (colour&size)dropdown menu)
    public void clickTShirtColourXXLRedOption(){
        if(tShirtColourXXLRedOption.isEnabled()){
            tShirtColourXXLRedOption.click();
        }else{
            logger.info("The XXL sized red t-shirt option is disabled");
        }
    }
    //select XL sized red t-shirt option(from men t-shirts (colour&size)dropdown menu)
    public void clickTShirtColourXLRedOption(){
        if(tShirtColourXLRedOption.isEnabled()){
            tShirtColourXLRedOption.click();
        }else{
            logger.info("The XL sized red t-shirt option is disabled");
        }
    }
    //select S sized red t-shirt option(from men t-shirts (colour&size)dropdown menu)
    public void clickTShirtColourSRedOption(){
        if(tShirtColourSRedOption.isEnabled()){
            tShirtColourSRedOption.click();
        }else{
            logger.info("The S sized red t-shirt option is disabled");
        }
    }
    //select XXL sized blue t-shirt option(from men t-shirts (colour&size)dropdown menu)
    public void clickTShirtColourXXLBlueOption(){
        if(tShirtColourXXLBlueOption.isEnabled()){
            tShirtColourXXLBlueOption.click();
        }else{
            logger.info("The XXL sized blue t-shirt option is disabled");
        }
    }
    //select L sized blue t-shirt option(from men t-shirts (colour&size)dropdown menu)
    public void clickTShirtColourLBlueOption(){
        if(tShirtColourLBlueOption.isEnabled()){
            tShirtColourLBlueOption.click();
        }else{
            logger.info("The L sized blue t-shirt option is disabled");
        }
    }
    //select XXL sized yellow t-shirt option(from men t-shirts (colour&size)dropdown menu)
    public void clickTShirtColourXXLYellowOption(){
        if(tShirtColourXXLYellowOption.isEnabled()){
            tShirtColourXXLYellowOption.click();
        }else{
            logger.info("The XXL sized yellow t-shirt option is disabled");
        }
    }

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //men t-shirts page web element asserts
    public boolean isTShirtColourDropdownMenuDisplayed() {return tShirtColourDropdownMenu.isDisplayed();}
    public boolean isTShirtSizeDropdownMenuDisplayed() {return tShirtSizeDropdownMenu.isDisplayed();}
    public boolean isTShirtColourAndSizeDropdownMenuDisplayed(){return tShirtColourAndSizeDropdownMenu.isDisplayed();}
    public boolean isAddToCartButtonDisplayed() {return addToCartButton.isDisplayed();}


}

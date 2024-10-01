package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MakeupPage extends BasePage{

    //makeup category page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement categoryProductPageTitle;
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
    
}

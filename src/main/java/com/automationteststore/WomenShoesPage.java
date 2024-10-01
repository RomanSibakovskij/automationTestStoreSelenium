package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WomenShoesPage extends BasePage{

    //shoe size checkbox web elements
    @FindBy(xpath = "//input[@id='option344747']")
    private WebElement size3UKOption;
    @FindBy(xpath = "//input[@id='option344748']")
    private WebElement size4UKOption;
    @FindBy(xpath = "//input[@id='option344749']")
    private WebElement size5UKOption;
    @FindBy(xpath = "//input[@id='option344750']")
    private WebElement size6UKOption;
    @FindBy(xpath = "//input[@id='option344751']")
    private WebElement size7UKOption;
    //shoes color checkboxes selector
    @FindBy(xpath = "//input[@id='option347763']")
    private WebElement blackColorOption;
    @FindBy(xpath = "//input[@id='option347764']")
    private WebElement redColorOption;
    @FindBy(xpath = "//input[@id='option347765']")
    private WebElement greenColorOption;
    @FindBy(xpath = "//input[@id='option347766']")
    private WebElement blueColorOption;
    @FindBy(xpath = "//input[@id='option347767']")
    private WebElement whiteColorOption;
    //shoes size (euro) dropdown menu web element
    @FindBy(xpath = "//select[@id='option342']")
    private WebElement shoeSizeDropdownMenu;
    //shoes size (UK) and color dropdown menu web element
    @FindBy(xpath = "//select[@id='option346']")
    private WebElement shoeSizeAndColorDropdownMenu;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public WomenShoesPage(WebDriver driver) {
        super(driver);
    }

    //shoe size checkbox click methods
    public void clickSize3UKOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(size3UKOption));
        size3UKOption.click();
    }
    public void clickSize4UKOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(size4UKOption));
        size4UKOption.click();
    }
    public void clickSize5UKOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(size5UKOption));
        size5UKOption.click();
    }
    public void clickSize6UKOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(size6UKOption));
        size6UKOption.click();
    }
    public void clickSize7UKOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(size7UKOption));
        size7UKOption.click();
    }

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //shoe size checkbox web element assert methods (new ladies high wedge heel)
    public boolean isShoeSize3UKCheckboxDisplayed(){return size3UKOption.isDisplayed();}
    public boolean isShoeSize4UKCheckboxDisplayed(){return size4UKOption.isDisplayed();}
    public boolean isShoeSize5UKCheckboxDisplayed(){return size5UKOption.isDisplayed();}
    public boolean isShoeSize6UKCheckboxDisplayed(){return size6UKOption.isDisplayed();}
    public boolean isShoeSize7UKCheckboxDisplayed(){return size3UKOption.isDisplayed();}

    //shoe color checkbox web element assert methods(women's high heel stiletto)
    public boolean isShoeBlackColorCheckboxDisplayed(){return blackColorOption.isDisplayed();}
    public boolean isShoeRedColorCheckboxDisplayed(){return redColorOption.isDisplayed();}
    public boolean isShoeGreenColorCheckboxDisplayed(){return greenColorOption.isDisplayed();}
    public boolean isShoeBlueColorCheckboxDisplayed(){return blueColorOption.isDisplayed();}
    public boolean isShoeWhiteColorCheckboxDisplayed(){return whiteColorOption.isDisplayed();}

    //shoe size (euro) web element assert method(fiorella purple peep toes)
    public boolean isShoeEuroSizeDropdownMenuDisplayed(){return shoeSizeDropdownMenu.isDisplayed();}

    //shoe size (UK) and color web element assert method(ruby shoe women's jada)
    public boolean isShoeUKSizeAndColorDropdownMenuDisplayed(){return shoeSizeAndColorDropdownMenu.isDisplayed();}

    public boolean isAddToCartButtonDisplayed() {return addToCartButton.isDisplayed();}
}

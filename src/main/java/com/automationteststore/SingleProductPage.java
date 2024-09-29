package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class SingleProductPage extends BasePage{

    //single product page aside next category web element
    @FindBy(xpath = "//div[@class='column_left col-md-3 col-xs-12']")
    private List<WebElement> asideCategoryProductsListElement;

    //single product page product images web elements
    @FindBy(xpath = "//ul[@class='thumbnails mainimage smallimage']/li")
    private List<WebElement> productImagesListElement;
    @FindBy(css = "[class='col-md-6 text-center'] div:nth-child(2) > a")
    private WebElement mainProductImage;
    @FindBy(xpath = "//h1[@class='productname']")
    private WebElement productName;
    @FindBy(xpath = "//div[@class='productfilneprice']")
    private WebElement productPrice;
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement productQuantityInputField;
    @FindBy(xpath = "//span[@class='total-price']")
    private WebElement productTotalPrice;
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[@class='productprint btn btn-large']")
    private WebElement printLink;
    @FindBy(css = ".btn.btn-large.wishlist_add")
    private WebElement addToWishlistLink;
    //single product page description section web elements
    @FindBy(xpath = "//ul[@id='myTab']/li[1]")
    private WebElement descriptionSection;
    @FindBy(xpath = "//div[@id='description']/p")
    private WebElement productDescription;
    //t-shirt product description web element
    @FindBy(xpath = "//div[@id='description']")
    private WebElement tShirtProductDescription;
    @FindBy(xpath = "//ul[@id='myTab']/li[2]")
    private WebElement reviewsSection;
    @FindBy(xpath = "//ul[@class='productinfo']/li[1]")
    private WebElement productModel;
    @FindBy(xpath = "//ul[@class='productinfo']/li[2]/a/img")
    private WebElement productManufacturer;

    //separate single product web elements
    //fragrance checkbox option web elements (when present)
    @FindBy(xpath = "//input[@id='option335720']")
    private WebElement parfumeFragranceOption;
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

    public SingleProductPage(WebDriver driver) {
        super(driver);
    }

    //single product page aside next category product data getters
    public List<String> getAsideProductData() {
        List<String> asideProductData = new ArrayList<>();
        for (WebElement element : asideCategoryProductsListElement) {
            asideProductData.add(element.getText());
        }
        return asideProductData;
    }
    //single product page product data getters
    public List<String> getProductImagesList() {
        List<String> productImages = new ArrayList<>();
        for (WebElement element : productImagesListElement) {
            productImages.add(element.getAttribute("value"));
        }
        return productImages;
    }

    public String getMainProductImage() {return mainProductImage.getAttribute("value");}
    public String getProductName() {return productName.getText();}
    public String getProductPrice() {return productPrice.getText();}
    public String getProductQuantity() {return productQuantityInputField.getAttribute("value");}
    public String getProductTotalPrice() {return productTotalPrice.getText();}
    public String getProductDescription(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", productDescription);
        return productDescription.getText();}
    //for t-shirt product page
    public String getTShirtProductDescription(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", tShirtProductDescription);
        return tShirtProductDescription.getText();}
    public String getProductModel(){ return productModel.getText();}
    public String getProductManufacturer(){return productManufacturer.getAttribute("value");}

    //single product 'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //parfum fragrance checkbox click method
    public void clickParfumFragranceCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(parfumeFragranceOption));
        parfumeFragranceOption.click();
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

    //single product page web element assert methods
    public boolean isAsideProductDataDisplayed() {
        for (WebElement element : asideCategoryProductsListElement) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductImagesListDisplayed() {
        for (WebElement element : productImagesListElement) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isMainProductImageDisplayed() {return mainProductImage.isDisplayed();}
    public boolean isProductNameDisplayed() {return productName.isDisplayed();}
    public boolean isProductPriceDisplayed() {return productPrice.isDisplayed();}
    public boolean isProductQuantityInputFieldDisplayed() {return productQuantityInputField.isDisplayed();}
    public boolean isProductTotalPriceDisplayed() {return productTotalPrice.isDisplayed();}
    public boolean isAddToCartButtonDisplayed() {return addToCartButton.isDisplayed();}
    public boolean isPrintLinkDisplayed() {return printLink.isDisplayed();}
    public boolean isAddToWishlistLinkDisplayed() {return addToWishlistLink.isDisplayed();}
    public boolean isDescriptionListSectionDisplayed() {return descriptionSection.isDisplayed();}
    public boolean isProductDescriptionDisplayed() {return productDescription.isDisplayed();}
    public boolean isReviewsListSectionDisplayed() {return reviewsSection.isDisplayed();}
    public boolean isProductModelDisplayed() {return productModel.isDisplayed();}
    public boolean isProductManufacturerDisplayed() {return productManufacturer.isDisplayed();}

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

}

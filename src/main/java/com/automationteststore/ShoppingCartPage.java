package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class ShoppingCartPage extends BasePage{

    //shopping cart table web elements
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement shoppingCartPageTitle;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table/tbody/tr/td[1]")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table/tbody/tr/td[2]/a")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table/tbody/tr/td[3]")
    private List<WebElement> productModelElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table/tbody/tr/td[4]")
    private List<WebElement> productUnitPriceElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table/tbody/tr/td[5]/div/input")
    private List<WebElement> productQuantityInputFieldElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table/tbody/tr/td[6]")
    private List<WebElement> productTotalPriceElements;
    private List<WebElement> productRemoveButton = driver.findElements(By.xpath("//div[@class='contentpanel']/div[1]/table/tbody/tr/td[7]/a"));
    //shopping cart button web elements
    @FindBy(xpath = "//button[@id='cart_update']")
    private WebElement updateButton;
    @FindBy(xpath = "//a[@id='cart_checkout1']")
    private WebElement checkoutButton;
    @FindBy(xpath = "//a[@class='btn btn-default mr10  mb10']")
    private WebElement continueShoppingButton;
    @FindBy(xpath = "//a[@id='cart_checkout2']")
    private WebElement lowerContinueButton;
    //shopping cart coupon web elements
    @FindBy(xpath = "//input[@id='coupon_coupon']")
    private WebElement couponCodeInputField;
    @FindBy(xpath = "//button[@id='apply_coupon_btn']")
    private WebElement applyCouponButton;
    //shopping cart estimate shipping & taxes web elements
    @FindBy(xpath = "//select[@id='estimate_country']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//option[@value='223']")
    private WebElement usCountryOption;
    @FindBy(xpath = "//select[@id='estimate_country_zones']")
    private WebElement stateDropdownMenu;
    @FindBy(xpath = "//option[@value='3635']")
    private WebElement illinoisStateOption;
    @FindBy(xpath = "//input[@id='estimate_postcode']")
    private WebElement zipCodeInputField;
    @FindBy(xpath = "//button[@title='Estimate']")
    private WebElement estimateButton;
    @FindBy(xpath = "//select[@id='shippings']")
    private WebElement shipmentsRateDropdownMenu;
    //shipping cart price table section web elements
    @FindBy(xpath = "//table[@id='totals_table']//tr[1]/td[2]")
    private WebElement subTotalPrice;
    @FindBy(xpath = "//table[@id='totals_table']//tr[2]/td[2]")
    private WebElement flatShippingRate;
    @FindBy(xpath = "//table[@id='totals_table']//tr[3]/td[2]")
    private WebElement totalPrice;


    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    //shopping cart select country from dropdown menu methods
    public void clickCountryDropDownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }
    public void selectUSCountryOption(){usCountryOption.click();}

    //shopping cart select state from dropdown menu methods
    public void clickStateDropDownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdownMenu));
        stateDropdownMenu.click();
    }
    public void selectIllinoisOption(){illinoisStateOption.click();}

    //zip code input method
    public void inputZipCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys("64536");
    }
    //checkout button click method
    public void clickCheckoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        checkoutButton.click();
    }

    //shopping cart page title getter
    public String getShoppingCartPageTitle(){return shoppingCartPageTitle.getText();}

    //shopping cart product data getters
    public List<String> getShoppingCartProductName() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }
    public List<String> getShoppingCartProductModel() {
        List<String> productModel = new ArrayList<>();
        for (WebElement element : productModelElements) {
            productModel.add(element.getText());
        }
        return productModel;
    }
    public List<String> getShoppingCartProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }
    public List<String> getShoppingCartProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : productQuantityInputFieldElements) {
            productQuantity.add(element.getAttribute("value"));
        }
        return productQuantity;
    }
    //validate the product quantity is indeed one
    public void verifyProductQuantities() {
        for (String quantity : getShoppingCartProductQuantity()) {
            if (!quantity.equals("1")) {
                logger.error("One of the product quantities is greater than 1: " + quantity);
            }
        }
    }
    public List<String> getShoppingCartProductTotalPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : productTotalPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }
    public String getShoppingCartAllProductsSubTotalPrice() { return subTotalPrice.getText();}
    public String getShoppingCartAllProductsFlatShippingRate() { return flatShippingRate.getText();}
    public String getShoppingCartAllProductsTotalPrice() { return totalPrice.getText();}

    //shopping cart page web element assert methods
    public boolean isShoppingCartTitleDisplayed(){return shoppingCartPageTitle.isDisplayed();}
    public boolean isCartProductImageDisplayed() {
        for (WebElement element : productImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCartProductNameDisplayed() {
        for (WebElement element : productNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCartProductModelDisplayed() {
        for (WebElement element : productModelElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCartProductUnitPriceDisplayed() {
        for (WebElement element : productUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCartProductQuantityInputFieldDisplayed() {
        for (WebElement element : productQuantityInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCartProductTotalPriceDisplayed() {
        for (WebElement element : productTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCartProductRemoveButtonDisplayed() {
        for (WebElement element : productRemoveButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isUpdateButtonDisplayed() {return updateButton.isDisplayed();}
    public boolean isCheckoutButtonDisplayed() {return checkoutButton.isDisplayed();}
    public boolean isCouponCodeInputFieldDisplayed() {return couponCodeInputField.isDisplayed();}
    public boolean isApplyCouponButtonDisplayed() {return applyCouponButton.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed() {return countryDropdownMenu.isDisplayed();}
    public boolean isStateDropdownMenuDisplayed() {return stateDropdownMenu.isDisplayed();}
    public boolean isZipCodeInputFieldDisplayed() {return zipCodeInputField.isDisplayed();}
    public boolean isZipCodeEstimateOptionDisplayed() {return estimateButton.isDisplayed();}
    public boolean isShippingRateDropdownMenuDisplayed() {return shipmentsRateDropdownMenu.isDisplayed();}
    public boolean isSubTotalPriceDisplayed() {return subTotalPrice.isDisplayed();}
    public boolean isFlatShippingRateDisplayed() {return flatShippingRate.isDisplayed();}
    public boolean isTotalPriceDisplayed() {return totalPrice.isDisplayed();}
    public boolean isContinueShoppingButtonDisplayed() {return continueShoppingButton.isDisplayed();}
    public boolean isLowerContinueButtonDisplayed() {return lowerContinueButton.isDisplayed();}

}

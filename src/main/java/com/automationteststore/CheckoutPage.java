package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class CheckoutPage extends BasePage{

    //checkout page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement checkoutPageTitle;
    //checkout page order summary web elements
    @FindBy(xpath = "//td[@class='align_left valign_top']")
    private List<WebElement> productSummaryNameElements;
    @FindBy(xpath = "//td[@class='align_right valign_top']")
    private List<WebElement> productSummaryPriceElements;
    @FindBy(css = ".sidewidt table:nth-child(5) tr:nth-of-type(1) .align_right:nth-of-type(2)")
    private WebElement productSummarySubTotalPrice;
    @FindBy(css = ".sidewidt table:nth-child(5) tr:nth-of-type(2) .align_right:nth-of-type(2)")
    private WebElement productSummaryFlatShippingRate;
    @FindBy(css = ".sidewidt table:nth-child(5) tr:nth-of-type(3) .align_right:nth-of-type(2)")
    private WebElement productSummaryRetailPrice;
    @FindBy(css = ".sidewidt table:nth-child(5) tr:nth-of-type(3) .align_right:nth-of-type(2)")
    private WebElement productSummaryTotalPrice;
    @FindBy(css = ".sidewidt table:nth-child(5) tr:nth-of-type(4) .align_right:nth-of-type(2)")
    private WebElement productSummaryTotalPriceWithRetail;
    //checkout page shipping section web elements
    @FindBy(xpath = "//table[@class='table confirm_shippment_options']//td[1]")
    private WebElement clientShippingName;
    @FindBy(xpath = "//table[@class='table confirm_shippment_options']//td[2]")
    private WebElement clientShippingAddress;
    @FindBy(xpath = "//table[@class='table confirm_shippment_options']//td[3]")
    private WebElement clientShippingPaymentMethod;
    @FindBy(xpath = "//table[@class='table confirm_shippment_options']//td[4]/a")
    private WebElement clientShippingEditButton;
    //checkout page payment section web elements
    @FindBy(xpath = "//table[@class='table confirm_payment_options']//td[1]")
    private WebElement clientPaymentName;
    @FindBy(xpath = "//table[@class='table confirm_payment_options']//td[2]")
    private WebElement clientPaymentAddress;
    @FindBy(xpath = "//table[@class='table confirm_payment_options']//td[3]")
    private WebElement clientPaymentMethod;
    @FindBy(xpath = "//table[@class='table confirm_payment_options']//td[4]/a[1]")
    private WebElement clientPaymentEditPaymentButton;
    @FindBy(xpath = "//table[@class='table confirm_payment_options']//td[4]/a[2]")
    private WebElement clientPaymentEditCouponButton;
    @FindBy(xpath = "//div[@class='contentpanel']/h4[3]/a")
    private WebElement clientPaymentEditCartButton;
    //checkout page 'items in the cart' section web elements
    @FindBy(xpath = "//table[@class='table confirm_products']//td[1]/a/img")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//table[@class='table confirm_products']//td[2]/a")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//table[@class='table confirm_products']//td[3]")
    private List<WebElement> productUnitPriceElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table//input")
    private List<WebElement> productQuantityElements;
    //checkout page error web elements
    @FindBy(xpath = "//strong[.= 'Products marked with *** are not available in the desired quantity or out of stock!']")
    private WebElement productQuantityErrorMessage;
    @FindBy(xpath = "//table[@class='table confirm_products']//td[5]")
    private List<WebElement> productTotalPriceElements;
    //checkout page remove product button web elements
    private List<WebElement> productRemoveButtonElements = driver.findElements(By.xpath("//a[@class='btn btn-sm btn-default']"));

    @FindBy(css = "tr:nth-of-type(1) td:nth-of-type(2) .bold")
    private WebElement productSubTotalPrice;
    @FindBy(css = "tr:nth-of-type(2) td:nth-of-type(2) .bold")
    private WebElement productFlatShippingRate;
    @FindBy(css = "tr:nth-of-type(3) td:nth-of-type(2) .bold")
    private WebElement productRetailPrice;
    @FindBy(css = "tr:nth-of-type(3) td:nth-of-type(2) .bold")
    private WebElement productTotalPrice;
    @FindBy(css = "tr:nth-of-type(4) td:nth-of-type(2) .bold")
    private WebElement productTotalWithRetailPrice;
    //checkout page button web elements
    @FindBy(xpath = "//a[@title='Back']")
    private WebElement backButton;
    @FindBy(xpath = "//button[@id='checkout_btn']")
    private WebElement confirmButton;
    //checkout page lower checkout button web element
    @FindBy(xpath = "//a[@id='cart_checkout2']")
    private WebElement lowerCheckoutButton;
    //checkout confirmation success message
    @FindBy(css = ".maintext")
    private WebElement checkoutSuccessMessage;
    //invoice page link web element
    @FindBy(xpath = "//a[.='invoice page']")
    private WebElement invoicePageLink;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //checkout page title getter
    public String getCheckoutPageTitle() {return checkoutPageTitle.getText();}

    //checkout page order summary data getter
    public List<String> getProductSummaryName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productSummaryNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductSummaryPrice() {
        List<String> productPrice = new ArrayList<>();
        for (WebElement element : productSummaryPriceElements) {
            productPrice.add(element.getText());
        }
        return productPrice;
    }

    public String getProductSummarySubTotalPrice() {return productSummarySubTotalPrice.getText();}
    public String getProductSummaryFlatShippingRate() {return productSummaryFlatShippingRate.getText();}
    public String getProductSummaryRetailPrice(){return productSummaryRetailPrice.getText();}
    public String getProductSummaryTotalPrice() {return productSummaryTotalPrice.getText();}
    public String getProductSummaryTotalPriceWithRetail(){return productSummaryTotalPriceWithRetail.getText();}
    public String getClientShippingName() {return clientShippingName.getText();}
    public String getClientShippingAddress() {return clientShippingAddress.getText();}
    public String getClientShippingPaymentMethod() {return clientShippingPaymentMethod.getText();}

    public List<String> getProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : productQuantityElements) {
            productQuantity.add(element.getText());
        }
        return productQuantity;
    }
    //validate the product quantity is indeed one
    public void verifyProductQuantities() {
        for (String quantity : getProductQuantity()) {
            if (!quantity.equals("1")) {
                logger.error("One of the product quantities is greater than 1: " + quantity);
            }
        }
    }
    //change the product quantity to default ('1') if it's not in default setting method
    public void rectifyProductQuantity(){
        List<WebElement> productQuantities = productQuantityElements;
        List<String> quantities = getProductQuantity();
        for (int i = 0; i < quantities.size(); i++) {
            String quantity = quantities.get(i);
            if (!quantity.equals("1")) {
                WebElement quantityElement = productQuantities.get(i);
                quantityElement.clear();
                quantityElement.sendKeys("1");
            }
        }
    }
    public List<String> getProductPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : productTotalPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }

    //checkout page 'remove' button click index getter
    public void clickRemoveProductFromCheckoutButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productRemoveButtonElements.get(productIndex)));
        productRemoveButtonElements.get(productIndex).click();
    }
    public void clickRemoveProductFromCheckout1Button(){
        clickRemoveProductFromCheckoutButton(0);}

    public String getProductSubTotalPrice() {return productSubTotalPrice.getText();}
    public String getProductFlatShippingRate() {return productFlatShippingRate.getText();}
    public String getProductRetailPrice(){return productRetailPrice.getText();}
    public String getProductTotalPrice(){return productTotalPrice.getText();}
    public String getProductTotalPriceWithRetail(){return productTotalWithRetailPrice.getText();}

    //checkout success confirmation message getter
    public String getCheckoutSuccessMessage() {return checkoutSuccessMessage.getText();}

    //checkout page product quantity error message getters
    public String getProductQuantityErrorMessage(){return productQuantityErrorMessage.getText();}

    //'confirm checkout' button click method
    public void clickConfirmCheckoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
        confirmButton.click();}
    //'confirm checkout' button click method
    public void clickLowerConfirmCheckoutButton(){lowerCheckoutButton.click();}
    //invoice page link click method
    public void clickInvoicePageLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(invoicePageLink));
        invoicePageLink.click();
    }

    //checkout page web element assert methods
    public boolean isCheckoutPageTitleDisplayed() {return checkoutPageTitle.isDisplayed();}
    public boolean isProductSummaryNameDisplayed() {
        for (WebElement element : productSummaryNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductSummaryPriceDisplayed() {
        for (WebElement element : productSummaryPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isProductSummarySubTotalPriceDisplayed() {return productSummarySubTotalPrice.isDisplayed();}
    public boolean isProductSummaryFlatShippingRateDisplayed() {return productSummaryFlatShippingRate.isDisplayed();}
    public boolean isProductSummaryRetailPriceDisplayed() {return productSummaryRetailPrice.isDisplayed();}
    public boolean isProductSummaryTotalPriceDisplayed() {return productSummaryTotalPrice.isDisplayed();}
    public boolean isClientShippingNameDisplayed() {return clientShippingName.isDisplayed();}
    public boolean isClientShippingAddressDisplayed() {return clientShippingAddress.isDisplayed();}
    public boolean isClientShippingPaymentMethodDisplayed() {return clientShippingPaymentMethod.isDisplayed();}
    public boolean isClientShippingEditButtonDisplayed() {return clientShippingEditButton.isDisplayed();}
    public boolean isClientPaymentNameDisplayed(){return clientPaymentName.isDisplayed();}
    public boolean isClientPaymentAddressDisplayed(){return clientPaymentAddress.isDisplayed();}
    public boolean isClientPaymentMethodDisplayed(){return clientPaymentMethod.isDisplayed();}
    public boolean isClientPaymentEditPaymentButtonDisplayed(){return clientPaymentEditPaymentButton.isDisplayed();}
    public boolean isClientPaymentEditCouponButtonDisplayed(){return clientPaymentEditCouponButton.isDisplayed();}
    public boolean isClientPaymentEditCartButtonDisplayed(){return clientPaymentEditCartButton.isDisplayed();}

    public boolean isProductImageDisplayed() {
        for (WebElement element : productImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductNameDisplayed() {
        for (WebElement element : productNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductUnitPriceDisplayed() {
        for (WebElement element : productUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductQuantityDisplayed() {
        for (WebElement element : productQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductTotalPriceDisplayed() {
        for (WebElement element : productTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isProductSubTotalPriceDisplayed() {return productSubTotalPrice.isDisplayed();}
    public boolean isProductFlatShippingRateDisplayed() {return productFlatShippingRate.isDisplayed();}
    public boolean isProductRetailPriceDisplayed(){return productRetailPrice.isDisplayed();}
    public boolean isProductConfirmTotalPriceDisplayed(){return productTotalPrice.isDisplayed();}
    public boolean isBackButtonDisplayed() {return backButton.isDisplayed();}
    public boolean isConfirmButtonDisplayed() {return confirmButton.isDisplayed();}
}

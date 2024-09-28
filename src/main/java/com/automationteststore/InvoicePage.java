package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class InvoicePage extends BasePage{

    //order details title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement orderDetailsTitle;
    //order details table web elements
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table//td[1]")
    private WebElement orderIDColumnData;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table//td[2]")
    private WebElement shippingAddressColumnData;
    @FindBy(xpath = "//div[@class='contentpanel']/div[1]/table//td[3]")
    private WebElement paymentAddressColumnData;
    //product table web elements (lists)
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12']/table//td[1]")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12']/table//td[2]/a")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12']/table//td[3]")
    private List<WebElement> productModelElements;
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12']/table//td[4]")
    private List<WebElement> productQuantityElements;
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12']/table//td[5]")
    private List<WebElement> productUnitPriceElements;
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12']/table//td[6]")
    private List<WebElement> productTotalPriceElements;
    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-xs-8 pull-right']/table//tr[1]/td[2]")
    private WebElement orderSubTotalPrice;
    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-xs-8 pull-right']/table//tr[2]/td[2]")
    private WebElement orderFlatShippingRate;
    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-xs-8 pull-right']/table//tr[3]/td[2]")
    private WebElement orderRetailPrice;
    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-xs-8 pull-right']/table//tr[3]/td[2]")
    private WebElement orderTotalPrice;
    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-xs-8 pull-right']/table//tr[4]/td[2]")
    private WebElement orderTotalPriceWithRetail;
    //order history table web elements
    @FindBy(xpath = "//div[@class='container-fluid']/table//td[1]")
    private List<WebElement> orderDateElements;
    @FindBy(xpath = "//div[@class='container-fluid']/table//td[2]")
    private List<WebElement> orderStatusElements;
    @FindBy(xpath = "//div[@class='container-fluid']/table//td[3]")
    private List<WebElement> orderCommentsElements;


    public InvoicePage(WebDriver driver) {
        super(driver);
    }

    //order details title getter
    public String getOrderDetailsTitle() {return orderDetailsTitle.getText();}

    //order details table data getter
    public String getOrderIDColumnData() {return orderIDColumnData.getText();}
    public String getShippingAddressColumnData() {return shippingAddressColumnData.getText();}
    public String getPaymentAddressColumnData() {return paymentAddressColumnData.getText();}

    //product table data getters
    public List<String> getProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductModel() {
        List<String> productModel = new ArrayList<>();
        for (WebElement element : productModelElements) {
            productModel.add(element.getText());
        }
        return productModel;
    }
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : productQuantityElements) {
            productQuantity.add(element.getText());
        }
        return productQuantity;
    }
    public List<String> getProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }
    public List<String> getProductTotalPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : productTotalPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }

    public String getOrderSubTotalPrice() {return orderSubTotalPrice.getText();}
    public String getOrderFlatShippingRate() {return orderFlatShippingRate.getText();}
    public String getOrderRetailPrice() {return orderRetailPrice.getText();}
    public String getOrderTotalPrice() {return orderTotalPrice.getText();}
    public String getOrderTotalPriceWithRetail() {return orderTotalPriceWithRetail.getText();}

    public List<String> getOrderDate() {
        List<String> orderDate = new ArrayList<>();
        for (WebElement element : orderDateElements) {
            orderDate.add(element.getText());
        }
        return orderDate;
    }
    public List<String> getOrderStatus() {
        List<String> orderStatus = new ArrayList<>();
        for (WebElement element : orderStatusElements) {
            orderStatus.add(element.getText());
        }
        return orderStatus;
    }

    public List<String> getOrderComment() {
        List<String> orderComment = new ArrayList<>();
        if (isOrderCommentDisplayed()) {
            for (WebElement element : orderCommentsElements) {
                orderComment.add(element.getText());
            }
        }
        return orderComment;
    }

    //invoice page web element assert methods
    public boolean isOrderDetailsTitleDisplayed() {return orderDetailsTitle.isDisplayed();}
    public boolean isOrderIDColumnDisplayed() {return orderIDColumnData.isDisplayed();}
    public boolean isShippingAddressColumnDisplayed() {return shippingAddressColumnData.isDisplayed();}
    public boolean isPaymentAddressColumnDisplayed() {return paymentAddressColumnData.isDisplayed();}

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
    public boolean isProductModelDisplayed() {
        for (WebElement element : productModelElements) {
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
    public boolean isProductUnitPriceDisplayed() {
        for (WebElement element : productUnitPriceElements) {
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

    public boolean isOrderSubTotalPriceDisplayed() {return orderSubTotalPrice.isDisplayed();}
    public boolean isOrderFlatShippingRateDisplayed() {return orderFlatShippingRate.isDisplayed();}
    public boolean isOrderRetailPriceDisplayed() {return orderRetailPrice.isDisplayed();}
    public boolean isOrderTotalPriceDisplayed() {return orderTotalPrice.isDisplayed();}
    public boolean isOrderTotalPriceWithRetailDisplayed() {return orderTotalPriceWithRetail.isDisplayed();}

    public boolean isOrderDateDisplayed() {
        for (WebElement element : orderDateElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderStatusDisplayed() {
        for (WebElement element : orderStatusElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderCommentDisplayed() {
        for (WebElement element : orderCommentsElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

}

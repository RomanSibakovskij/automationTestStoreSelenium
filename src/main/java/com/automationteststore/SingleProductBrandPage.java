package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class SingleProductBrandPage extends BasePage{

    //single brand product page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement brandProductPageTitle;
    //single brand product page brand image web element
    @FindBy(xpath = "//span[@class='subtext']/img")
    private WebElement brandProductImageIcon;
    //single brand product page sort dropdown menu web element
    @FindBy(xpath = "//select[@id='sort']")
    private WebElement sortDropdownMenu;
    //dropdown menu options web elements
    @FindBy(xpath = "//select[@id='sort']/option[@value='date_modified-ASC']")
    private WebElement sortDateOldNewOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='pd.name-ASC']")
    private WebElement sortNameAToZOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='pd.name-DESC']")
    private WebElement sortNameZToAOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='p.price-ASC']")
    private WebElement sortPriceLowToHighOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='p.price-DESC']")
    private WebElement sortPriceHighToLowOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='rating-DESC']")
    private WebElement sortRatingHighestOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='rating-ASC']")
    private WebElement sortRatingLowestOption;
    @FindBy(xpath = "//select[@id='sort']/option[@value='date_modified-DESC']")
    private WebElement sortDateNewOldOption;
    //single brand product page view type web elements
    @FindBy(xpath = "//button[@id='list']")
    private WebElement viewListButton;
    @FindBy(xpath = "//button[@id='grid']")
    private WebElement viewGridButton;
    //single brand product page table web elements(as lists)
    @FindBy(xpath = "//div[@class='thumbnails list row']//div[@class='row']//a/img")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//div[@class='contentpanel']/div[2]//a[@class='prdocutname']")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//div[@class='thumbnails list row']//div[@class='row']//p")
    private List<WebElement> productDescriptionElements;
    @FindBy(xpath = "//div[@class='thumbnails list row']//div[@class='row']//div[@class='shortlinks']/a[1]")
    private List<WebElement> productViewLinkElements;
    @FindBy(xpath = "//div[@class='thumbnails list row']//div[@class='row']//div[@class='shortlinks']/a[2]")
    private List<WebElement> productReviewLinkElements;
    @FindBy(xpath = "//div[@class='thumbnails list row']//div[@class='price']")
    private List<WebElement> productUnitPriceElements;
    @FindBy(xpath = "//div[@class='thumbnails list row']//a[@title='Add to Cart']")
    private List<WebElement> productAddToCartButtonElements;
    //'call to order' button web element
    @FindBy(xpath = "//a[@title='Call To Order']")
    private WebElement callToOrderButton;
    //single brand product page view limit product web elements
    @FindBy(xpath = "//select[@id='limit']")
    private WebElement limitProductViewDropdownMenu;

    public SingleProductBrandPage(WebDriver driver) {
        super(driver);
    }

    //single brand product page title getter
    public String getBrandProductPageTitle() {return brandProductPageTitle.getText();}

    //single product brand product table data getters
    public List<String> getProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductDescription() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : productDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    public List<String> getProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }

    //single brand product page grid view click method
    public void clickPageGridViewButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(viewGridButton));
        viewGridButton.click();
    }
    //single brand product page list view click method
    public void clickPageListViewButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(viewListButton));
        viewListButton.click();
    }
    //single brand product page call to order button click method
    public void clickCallToOrderButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(callToOrderButton));
        callToOrderButton.click();
    }

    //single brand product sort dropdown menu click method
    public void clickProductSortDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(sortDropdownMenu));
        sortDropdownMenu.click();
    }

    //single brand product page 'add to cart' button click index getter
    public void clickAddBrandProductToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToCartButtonElements.get(productIndex)));
        productAddToCartButtonElements.get(productIndex).click();
    }
    //individual 'add to cart' button click methods
    public void clickAddBrandProductToCart1Button(){
        clickAddBrandProductToCartButton(0);}
    public void clickAddBrandProductToCart2Button(){
        clickAddBrandProductToCartButton(1);}
    public void clickAddBrandProductToCart3Button(){
        clickAddBrandProductToCartButton(2);}
    public void clickAddBrandProductToCart4Button(){
        clickAddBrandProductToCartButton(3);}
    public void clickAddBrandProductToCart5Button(){
        clickAddBrandProductToCartButton(4);}
    public void clickAddBrandProductToCart6Button(){
        clickAddBrandProductToCartButton(5);}
    public void clickAddBrandProductToCart7Button(){
        clickAddBrandProductToCartButton(6);}
    public void clickAddBrandProductToCart8Button(){
        clickAddBrandProductToCartButton(7);}
    public void clickAddBrandProductToCart9Button(){
        clickAddBrandProductToCartButton(8);}
    public void clickAddBrandProductToCart10Button(){
        clickAddBrandProductToCartButton(9);}

    //single brand product sort dropdown menu options select methods
    public void selectDateOldNewOption(){sortDateOldNewOption.click();}
    public void selectNameAToZOption(){sortNameAToZOption.click();}
    public void selectNameZToAOption(){sortNameZToAOption.click();}
    public void selectPriceLowToHighOption(){sortPriceLowToHighOption.click();}
    public void selectPriceHighToLowOption(){sortPriceHighToLowOption.click();}
    public void selectRatingHighestOption(){sortRatingHighestOption.click();}
    public void selectRatingLowestOption(){sortRatingLowestOption.click();}
    public void selectDateNewOldOption(){sortDateNewOldOption.click();}


    //single brand product web element assert methods
    public boolean isBrandProductPageTitleDisplayed() {return brandProductPageTitle.isDisplayed();}
    public boolean isBrandProductPageImageIconDisplayed() {return brandProductImageIcon.isDisplayed();}
    public boolean isSortDropdownMenuDisplayed() {return sortDropdownMenu.isDisplayed();}
    public boolean isViewListButtonDisplayed() {return viewListButton.isDisplayed();}
    public boolean isViewGridButtonDisplayed() {return viewGridButton.isDisplayed();}

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
    public boolean isProductDescriptionDisplayed() {
        for (WebElement element : productDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductViewLinkDisplayed() {
        for (WebElement element : productViewLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductReviewLinkDisplayed() {
        for (WebElement element : productReviewLinkElements) {
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
    public boolean isProductAddToCartButtonDisplayed() {
        for (WebElement element : productAddToCartButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isLimitProductViewDropdownMenuDisplayed() {return limitProductViewDropdownMenu.isDisplayed();}

}

package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class HomePage extends BasePage{

    //homepage header logo web element
    @FindBy(xpath = "//img[@title='Automation Test Store']")
    private WebElement automationStoreHeaderLogo;
    //homepage header link web elements
    @FindBy(xpath = "//ul[@id='customer_menu_top']/li/a")
    private WebElement loginRegisterNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_specials']")
    private WebElement specialsNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_account']")
    private WebElement accountNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_cart']")
    private WebElement cartNavLink;
    @FindBy(xpath = "//ul[@id='main_menu_top']/li[@data-id='menu_checkout']")
    private WebElement checkoutNavLink;
    //homepage header search input field web element
    @FindBy(xpath = "//input[@id='filter_keyword']")
    private WebElement searchInputField;
    //search bar icon button web element
    @FindBy(xpath = "//div[@class='button-in-search']")
    private WebElement searchIconButton;
    @FindBy(xpath = "//ul[@class='nav language pull-left']/li[@class='dropdown hover']")
    private WebElement currencyHoverMenu;
    @FindBy(xpath = "//ul[@class='nav topcart pull-left']/li[@class='dropdown hover']")
    private WebElement cartHoverMenu;
    //social icon button web elements
    @FindBy(xpath = "//div[@class='header_block']/div[@class='social_icons']/a[@class='facebook']")
    private WebElement facebookIconButton;
    @FindBy(xpath = "//div[@class='header_block']/div[@class='social_icons']/a[@class='twitter']")
    private WebElement twitterIconButton;
    @FindBy(xpath = "//div[@class='header_block']/div[@class='social_icons']/a[@class='linkedin']")
    private WebElement linkedinIconButton;
    //homepage navbar category web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[1]/a")
    private WebElement homeHoverMenu;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[2]")
    private WebElement apparelAccessoriesHoverMenu;
    //apparel and accessories hover menu option web elements
    @FindBy(xpath = "//div[@class='subcategories']/ul[1]//a[@href='https://automationteststore.com/index.php?rt=product/category&path=68_69']")
    private WebElement shoesCategoryProductLink;
    @FindBy(xpath = "//div[@class='subcategories']/ul[1]//a[@href='https://automationteststore.com/index.php?rt=product/category&path=68_70']")
    private WebElement tShirtsCategoryProductLink;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]")
    private WebElement makeupHoverMenu;
    //makeup hover menu option web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36_40']")
    private WebElement cheeksMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36_39']")
    private WebElement eyesMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36_38']")
    private WebElement faceMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36_41']")
    private WebElement lipsMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36_42']")
    private WebElement nailsMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[3]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36_37']")
    private WebElement valueSetsMenuLink;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/a")
    private WebElement skincareHoverMenu;
    //skincare hover menu option web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=43_47']")
    private WebElement eyesSkincareMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=43_46']")
    private WebElement faceSkincareMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=43_45']")
    private WebElement giftSetsSkincareMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=43_48']")
    private WebElement handsNailsSkincareMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[4]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=43_44']")
    private WebElement sunSkincareMenuLink;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[5]/a")
    private WebElement fragranceHoverMenu;
    //fragrance hover menu option web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[5]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=49_51']")
    private WebElement fragranceMenMenuLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[5]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=49_50']")
    private WebElement fragranceWomenMenuLink;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[6]/a")
    private WebElement menHoverMenu;
    //men body care hover menu option web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[6]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=58_63']")
    private WebElement menBodyShowerLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[6]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=58_59']")
    private WebElement menFragranceSetsLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[6]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=58_61']")
    private WebElement menShavingLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[6]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=58_60']")
    private WebElement menSkincareLink;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[7]/a")
    private WebElement haircareHoverMenu;
    //hair care hover menu option web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[7]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=52_54']")
    private WebElement hairConditionerLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[7]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=52_53']")
    private WebElement hairShampooLink;

    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[8]/a")
    private WebElement booksHoverMenu;
    //books hover menu option web elements
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[8]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=65_66']")
    private WebElement audioCDLink;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[8]/div/ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=65_67']")
    private WebElement paperbackLink;

    //homepage banner slider web element
    @FindBy(xpath = "//div[@class='banner_container']")
    private WebElement bannerSlider;
    //homepage section web elements
    @FindBy(xpath = "//section[@class='row promo_section']/div[1]/div[2]")
    private WebElement fastShippingLabel;
    @FindBy(xpath = "//section[@class='row promo_section']/div[2]/div[2]")
    private WebElement easyPaymentLabel;
    @FindBy(xpath = "//section[@class='row promo_section']/div[3]/div[2]")
    private WebElement shippingOptionsLabel;
    @FindBy(xpath = "//section[@class='row promo_section']/div[4]/div[2]")
    private WebElement largeVarietyLabel;
    //homepage welcome section web element
    @FindBy(xpath = "//section[@class='contentpanel']/div/h4")
    private WebElement welcomeMessage;
    //featured product list web elements(lists)
    @FindBy(xpath = "//section[@id='featured']//div[@id='block_frame_featured_1769']/div[@class='thumbnails list-inline']//div[@class='fixed']/a")
    private List<WebElement> featuredProductsNameElements;
    @FindBy(xpath = "//section[@id='featured']//div[@id='block_frame_featured_1769']/div[@class='thumbnails list-inline']//div[@class='oneprice']")
    private List<WebElement> featuredAvailableProductsPriceElements;
    private List<WebElement> featuredAvailableProductsAddToCartButton = driver.findElements(By.xpath("//section[@id='featured']//div[@id='block_frame_featured_1769']/div[@class='thumbnails list-inline']//div[@class='pricetag jumbotron']/a"));
    //latest products web elements(lists)
    @FindBy(xpath = "//section[@id='latest']//div[@id='block_frame_latest_1770']/div[@class='thumbnails list-inline']//div[@class='fixed']/a")
    private List<WebElement> latestProductsNameElements;
    @FindBy(xpath = "//section[@id='latest']//div[@id='block_frame_latest_1770']/div[@class='thumbnails list-inline']//div[@class='price']")
    private List<WebElement> latestAvailableProductsPriceElements;
    private List<WebElement> latestAvailableProductsAddToCartButton = driver.findElements(By.xpath("//section[@id='latest']//div[@class='pricetag jumbotron']/a"));
    //bestsellers products web elements(lists)
    @FindBy(xpath = "//section[@id='bestseller']//div[@id='block_frame_bestsellers_1771']/div[@class='thumbnails list-inline']//div[@class='fixed']/a")
    private List<WebElement> bestsellersProductsNameElements;
    @FindBy(xpath = "//section[@id='bestseller']//div[@id='block_frame_bestsellers_1771']/div[@class='thumbnails list-inline']//div[@class='price']")
    private List<WebElement> bestsellersAvailableProductsPriceElements;
    private List<WebElement> bestsellerAvailableProductsAddToCartButton = driver.findElements(By.xpath("//section[@id='bestseller']//div[@id='block_frame_bestsellers_1771']//div[@class='pricetag jumbotron']/a"));
    //specials products web elements(lists)
    @FindBy(xpath = "//section[@id='special']//div[@id='block_frame_special_1772']/div[@class='thumbnails list-inline']//div[@class='fixed']/a")
    private List<WebElement> specialsProductsNameElements;
    @FindBy(xpath = "//section[@id='special']//div[@id='block_frame_special_1772']/div[@class='thumbnails list-inline']//div[@class='pricetag jumbotron']/div")
    private List<WebElement> specialsAvailableProductsPriceElements;
    @FindBy(css = ".block_frame_special [title='Add to Cart']")
    private WebElement specialAvailableProductsAddToCartButton;;
    //brand scrolling products web element(list)
    @FindBy(xpath = "//div[@id='block_frame_listing_block_1774']//div[@class='caroufredsel_wrapper']/ul/li")
    private List<WebElement> brandScrollingProductsElements;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //click login/register link method
    public void clickLoginRegisterLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(loginRegisterNavLink));
        loginRegisterNavLink.click();
    }

    //click homepage link method
    public void clickHomePageLogo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(automationStoreHeaderLogo));
        automationStoreHeaderLogo.click();
    }

    //apparel and accessories hover menu method
    public void navigateToApparelAndAccessories(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(apparelAccessoriesHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(apparelAccessoriesHoverMenu).perform();
    }
    //click 'Shoes' category dropdown menu option method
    public void clickShoesCategoryLink(){shoesCategoryProductLink.click();}
    //click 'T-Shirts' category dropdown menu option method
    public void clickTShirtsCategoryLink(){tShirtsCategoryProductLink.click();}

    //makeup hover menu method
    public void navigateToMakeup(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(makeupHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(makeupHoverMenu).perform();
    }
    //click 'Cheeks' category dropdown menu option method
    public void clickCheeksCategoryLink(){cheeksMenuLink.click();}
    //click 'Eyes' category dropdown menu option method
    public void clickEyesCategoryLink(){eyesMenuLink.click();}
    //click 'Face' category dropdown menu option method
    public void clickFaceCategoryLink(){faceMenuLink.click();}
    //click 'Lips' category dropdown menu option method
    public void clickLipsCategoryLink(){lipsMenuLink.click();}
    //click 'Nails' category dropdown menu option method
    public void clickNailsCategoryLink(){nailsMenuLink.click();}
    //click 'Value Sets' category dropdown menu option method
    public void clickValueSetsCategoryLink(){valueSetsMenuLink.click();}

    //skincare hover menu method
    public void navigateToSkincare(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(skincareHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(skincareHoverMenu).perform();
    }
    //click 'Skincare Eyes' category dropdown menu option method
    public void clickEyesSkincareCategoryLink(){eyesSkincareMenuLink.click();}
    //click 'Skincare Face' category dropdown menu option method
    public void clickFaceSkincareCategoryLink(){faceSkincareMenuLink.click();}
    //click 'Skincare Gift Sets' category dropdown menu option method
    public void clickGiftSetsSkincareCategoryLink(){giftSetsSkincareMenuLink.click();}
    //click 'Skincare Hands and Nails' category dropdown menu option method
    public void clickHandsNailsSkincareCategoryLink(){handsNailsSkincareMenuLink.click();}
    //click 'Skincare Sun' category dropdown menu option method
    public void clickSunSkincareCategoryLink(){sunSkincareMenuLink.click();}

    //fragrance hover menu method
    public void navigateToFragrance(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(fragranceHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(fragranceHoverMenu).perform();
    }
    //click 'Fragrance Men' category dropdown menu option method
    public void clickMenFragranceCategoryLink(){fragranceMenMenuLink.click();}
    //click 'Fragrance Women' category dropdown menu option method
    public void clickWomenFragranceCategoryLink(){fragranceWomenMenuLink.click();}

    //men body care hover menu method
    public void navigateToMenCategory(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(menHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menHoverMenu).perform();
    }
    //click 'Men Body & Shower' category dropdown menu option method
    public void clickMenBodyShowerCategoryLink(){menBodyShowerLink.click();}
    //click 'Men Fragrance Sets' category dropdown menu option method
    public void clickMenFragranceSetsCategoryLink(){menFragranceSetsLink.click();}
    //click 'Men Pre-Shave & Shaving' category dropdown menu option method
    public void clickMenShavingCategoryLink(){menShavingLink.click();}
    //click 'Men Skincare' category dropdown menu option method
    public void clickMenSkincareCategoryLink(){menSkincareLink.click();}

    //hair care hover menu method
    public void navigateToHaircareCategory(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(haircareHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(haircareHoverMenu).perform();
    }
    //click 'Haircare Conditioner' category dropdown menu option method
    public void clickHaircareConditionerCategoryLink(){hairConditionerLink.click();}
    //click 'Haircare Shampoo' category dropdown menu option method
    public void clickHaircareShampooCategoryLink(){hairShampooLink.click();}

    //books hover menu method
    public void navigateToBooksCategory(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(booksHoverMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(booksHoverMenu).perform();
    }
    //click 'Books Audio CD' category dropdown menu option method
    public void clickBooksAudioCDCategoryLink(){audioCDLink.click();}
    //click 'Books Paperback' category dropdown menu option method
    public void clickBooksPaperbackCategoryLink(){paperbackLink.click();}

    //homepage products list data getter methods
    //featured product names getters
    public List<String> getFeaturedProductNames() {
        List<String> featuredProductName = new ArrayList<>();
        for (WebElement element : featuredProductsNameElements) {
            featuredProductName.add(element.getText());
        }
        return featuredProductName;
    }
    //featured product price getter
    public List<String> getFeaturedProductPrice() {
        List<String> featuredProductPrice = new ArrayList<>();
        for (WebElement element : featuredAvailableProductsPriceElements) {
            featuredProductPrice.add(element.getText());
        }
        return featuredProductPrice;
    }

    //latest product names getters
    public List<String> getLatestProductNames() {
        List<String> latestProductName = new ArrayList<>();
        for (WebElement element : latestProductsNameElements) {
            latestProductName.add(element.getText());
        }
        return latestProductName;
    }
    //latest product price getter
    public List<String> getLatestProductPrice() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        List<String> latestProductPrice = new ArrayList<>();
        for (WebElement element : latestAvailableProductsPriceElements) {
            js.executeScript("arguments[0].scrollIntoView(true);", element); //scroll each element into view
            latestProductPrice.add(element.getText());
        }
        return latestProductPrice;
    }

    //bestsellers product names getters
    public List<String> getBestsellersProductNames() {
        List<String> latestProductName = new ArrayList<>();
        for (WebElement element : bestsellersProductsNameElements) {
            latestProductName.add(element.getText());
        }

        return latestProductName;
    }
    //bestsellers product price getter
    public List<String> getBestsellersProductPrice() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        List<String> latestProductPrice = new ArrayList<>();
        for (WebElement element : bestsellersAvailableProductsPriceElements) {
            js.executeScript("arguments[0].scrollIntoView(true);", element); //scroll each element into view
            latestProductPrice.add(element.getText());
        }
        return latestProductPrice;
    }
    //special product names getters
    public List<String> getSpecialProductNames() {
        List<String> latestProductName = new ArrayList<>();
        for (WebElement element : specialsProductsNameElements) {
            latestProductName.add(element.getText());
        }

        return latestProductName;
    }
    //special product price getter
    public List<String> getSpecialProductPrice() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        List<String> latestProductPrice = new ArrayList<>();
        for (WebElement element : specialsAvailableProductsPriceElements) {
            js.executeScript("arguments[0].scrollIntoView(true);", element); //scroll each element into view
            latestProductPrice.add(element.getText());
        }
        return latestProductPrice;
    }

    //homepage featured products 'add to cart' button click index getter
    public void clickAddFeaturedToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(featuredAvailableProductsAddToCartButton.get(productIndex)));
        featuredAvailableProductsAddToCartButton.get(productIndex).click();
    }
    //individual 'add to cart' button click methods
    public void clickAddFeaturedToCart1Button(){
        clickAddFeaturedToCartButton(0);}
    public void clickAddFeaturedToCart2Button(){
        clickAddFeaturedToCartButton(1);}
    public void clickAddFeaturedToCart3Button(){
        clickAddFeaturedToCartButton(2);}

    //homepage latest products 'add to cart' button click index getter
    public void clickAddLatestToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(latestAvailableProductsAddToCartButton.get(productIndex)));
        latestAvailableProductsAddToCartButton.get(productIndex).click();
    }
    //individual 'add to cart' button click methods
    public void clickAddLatestToCart1Button(){
        clickAddLatestToCartButton(0);}
    public void clickAddLatestToCart2Button(){
        clickAddLatestToCartButton(1);}

    //homepage bestseller products 'add to cart' button click index getter
    public void clickAddBestsellerToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(bestsellerAvailableProductsAddToCartButton.get(productIndex)));
        bestsellerAvailableProductsAddToCartButton.get(productIndex).click();
    }
    //individual 'add to cart' button click methods
    public void clickAddBestsellerToCart1Button(){
        clickAddBestsellerToCartButton(0);}
    public void clickAddBestsellerToCart2Button(){
        clickAddBestsellerToCartButton(1);}
    public void clickAddBestsellerToCart3Button(){
        clickAddBestsellerToCartButton(2);}
    public void clickAddBestsellerToCart4Button(){
        clickAddBestsellerToCartButton(3);}

    //homepage special products 'add to cart' button click method (since only one product is available)
    public void clickAddSpecialToCartButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", specialAvailableProductsAddToCartButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(specialAvailableProductsAddToCartButton));
        specialAvailableProductsAddToCartButton.click();
    }

    //cart page nav link click method
    public void clickCartNavLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(cartNavLink));
        cartNavLink.click();
    }

    //homepage benefit (single brand) products 'add to cart' button click index getter
    public void clickSingleBrandProductToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(brandScrollingProductsElements.get(productIndex)));
        brandScrollingProductsElements.get(productIndex).click();
    }
    //individual 'add to cart' button click methods
    public void clickSingleBrandProductToCart1Button(){
        clickSingleBrandProductToCartButton(0);}
    public void clickSingleBrandProductToCart2Button(){
        clickSingleBrandProductToCartButton(1);}
    public void clickSingleBrandProductToCart3Button(){
        clickSingleBrandProductToCartButton(2);}
    public void clickSingleBrandProductToCart4Button(){
        clickSingleBrandProductToCartButton(3);}
    public void clickSingleBrandProductToCart5Button(){
        clickSingleBrandProductToCartButton(4);}
    public void clickSingleBrandProductToCart6Button(){
        clickSingleBrandProductToCartButton(5);}
    public void clickSingleBrandProductToCart7Button(){
        clickSingleBrandProductToCartButton(6);}
    public void clickSingleBrandProductToCart8Button(){
        clickSingleBrandProductToCartButton(7);}
    public void clickSingleBrandProductToCart9Button(){
        clickSingleBrandProductToCartButton(8);}
    public void clickSingleBrandProductToCart10Button(){
        clickSingleBrandProductToCartButton(9);}

    //login/register page link name getter
    public String getLoginRegisterLinkText(){return loginRegisterNavLink.getText();}

    //homepage web element asserts
    public boolean isAutomationStoreLogoDisplayed() {return automationStoreHeaderLogo.isDisplayed();}
    public boolean isLoginRegisterNavLinkDisplayed() {return loginRegisterNavLink.isDisplayed();}
    public boolean isSpecialsNavLinkDisplayed() {return specialsNavLink.isDisplayed();}
    public boolean isAccountNavLinkDisplayed() {return accountNavLink.isDisplayed();}
    public boolean isCartNavLinkDisplayed() {return cartNavLink.isDisplayed();}
    public boolean isCheckoutNavLinkDisplayed() {return checkoutNavLink.isDisplayed();}
    public boolean isSearchInputFieldDisplayed() {return searchInputField.isDisplayed();}
    public boolean isSearchIconButtonDisplayed() {return searchIconButton.isDisplayed();}
    public boolean isCurrencyHoverMenuDisplayed() {return currencyHoverMenu.isDisplayed();}
    public boolean isCartHoverMenuDisplayed() {return cartHoverMenu.isDisplayed();}
    public boolean isFacebookIconButtonDisplayed() {return facebookIconButton.isDisplayed();}
    public boolean isTwitterIconButtonDisplayed() {return twitterIconButton.isDisplayed();}
    public boolean isLinkedinIconButtonDisplayed() {return linkedinIconButton.isDisplayed();}
    public boolean isHomeHoverMenuDisplayed(){return homeHoverMenu.isDisplayed();}
    public boolean isApparelAccessoriesHoverMenuDisplayed(){return apparelAccessoriesHoverMenu.isDisplayed();}
    public boolean isMakeupHoverMenuDisplayed(){return makeupHoverMenu.isDisplayed();}
    public boolean isSkincareHoverMenuDisplayed(){return skincareHoverMenu.isDisplayed();}
    public boolean isFragranceHoverMenuDisplayed(){return fragranceHoverMenu.isDisplayed();}
    public boolean isMenHoverMenuDisplayed(){return menHoverMenu.isDisplayed();}
    public boolean isHaircareHoverMenuDisplayed(){return haircareHoverMenu.isDisplayed();}
    public boolean isBooksHoverMenuDisplayed(){return booksHoverMenu.isDisplayed();}
    public boolean isBannerSliderDisplayed(){return bannerSlider.isDisplayed();}
    public boolean isFastShippingLabelDisplayed(){return fastShippingLabel.isDisplayed();}
    public boolean isEasyPaymentLabelDisplayed(){return easyPaymentLabel.isDisplayed();}
    public boolean isShippingOptionsLabelDisplayed(){return shippingOptionsLabel.isDisplayed();}
    public boolean isLargeVarietyLabelDisplayed(){return largeVarietyLabel.isDisplayed();}
    public boolean isWelcomeMessageSectionDisplayed(){return welcomeMessage.isDisplayed();}

    //homepage product page web element assert methods
    public boolean isFeaturedProductNameDisplayed() {
        for (WebElement element : featuredProductsNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isFeaturedAvailableProductsPriceDisplayed() {
        for (WebElement element : featuredAvailableProductsPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isFeaturedAvailableProductsAddToCartButtonDisplayed() {
        for (WebElement element : featuredAvailableProductsAddToCartButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isLatestProductNameDisplayed() {
        for (WebElement element : latestProductsNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isLatestAvailableProductsPriceDisplayed() {
        for (WebElement element : latestAvailableProductsPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isLatestAvailableProductsAddToCartButtonDisplayed() {
        for (WebElement element : latestAvailableProductsAddToCartButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellersProductNameDisplayed() {
        for (WebElement element : bestsellersProductsNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellersAvailableProductsPriceDisplayed() {
        for (WebElement element : bestsellersAvailableProductsPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellersAvailableProductsAddToCartButtonDisplayed() {
        for (WebElement element : bestsellerAvailableProductsAddToCartButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSpecialsProductNameDisplayed() {
        for (WebElement element : specialsProductsNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSpecialsAvailableProductsPriceDisplayed() {
        for (WebElement element : specialsAvailableProductsPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSpecialsAvailableProductsAddToCartButtonDisplayed() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", specialAvailableProductsAddToCartButton);
        return specialAvailableProductsAddToCartButton.isDisplayed();
    }
    public boolean isBrandScrollingProductsDisplayed() {
        for (WebElement element : brandScrollingProductsElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

}

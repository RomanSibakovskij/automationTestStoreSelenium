package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class FragrancePage extends BasePage{

    //men fragrance size dropdown menu web element
    @FindBy(xpath = "//select[@id='option316']")
    private WebElement menFragranceSizeDropdownMenu;
    //women fragrance star rating web element (Gucci Guilty)
    @FindBy(xpath = "//ul[@class='rate']")
    private WebElement womenFragranceStarRating;
    //women fragrance size dropdown menu web element (Gucci Guilty)
    @FindBy(xpath = "//select[@id='option330']")
    private WebElement womenFragranceSizeDropdownMenu;
    //women fragrance scent dropdown menu web element(OMNIA EAU DE TOILETTE 65ML)
    @FindBy(xpath = "//select[@id='option338']")
    private WebElement womenFragranceScentDropdownMenu;
    //women fragrance gift wrapping checkbox web element(OMNIA EAU DE TOILETTE 65ML)
    @FindBy(xpath = "//select[@id='option339']")
    private WebElement womenFragranceGiftCheckbox;
    //women fragrance cologne type checkbox web element(BVLGARI AQUA)
    @FindBy(xpath = "//input[@id='option335722']")
    private WebElement womenFragranceTypeCologneCheckbox;
    //women fragrance toilette type checkbox web element(BVLGARI AQUA)
    @FindBy(xpath = "//input[@id='option335721']")
    private WebElement womenFragranceTypeToiletteCheckbox;
    //women fragrance parfum type checkbox web element(BVLGARI AQUA)
    @FindBy(xpath = "//input[@id='option335720']")
    private WebElement womenFragranceTypeParfumCheckbox;
    //women fragrance size dropdown menu web element(BVLGARI AQUA)
    @FindBy(xpath = "//input[@id='option337']")
    private WebElement womenFragranceBulgariSizeDropdownMenu;
    //women fragrance gift checkbox web element(BVLGARI AQUA)
    @FindBy(xpath = "//input[@id='option336']")
    private WebElement womenFragranceBulgariGiftCheckbox;
    //women fragrance size dropdown menu web element(Beauty Eau de Parfum)
    @FindBy(xpath = "//select[@id='option314']")
    private WebElement womenFragranceSizeBeautyEauDropdownMenu;
    //women fragrance size dropdown menu web element(Forbidden euphoria Eau de Parfum Spray (Ck0010))
    @FindBy(xpath = "//select[@id='option323']")
    private WebElement womenFragranceSizeEuphoriaDropdownMenu;
    //women fragrance size dropdown menu web element(Secret Obsession Perfume (CK0012))
    @FindBy(xpath = "//select[@id='option324']")
    private WebElement womenFragranceSizeObsessionDropdownMenu;
    //women fragrance size dropdown menu web element(Secret Obsession Perfume (CK0012))
    @FindBy(xpath = "//select[@id='option331']")
    private WebElement womenFragranceSizeCKObsessionDropdownMenu;
    //women fragrance gift checkbox web element(Secret Obsession Perfume (CK0012))
    @FindBy(xpath = "//input[@id='option332']")
    private WebElement womenFragranceSizeCKObsessionGiftCheckbox;
    //women fragrance size dropdown menu web element(Armani Code Pour Femme (GRM005))
    @FindBy(xpath = "//select[@id='option322']")
    private WebElement womenFragranceSizeArmaniCodeDropdownMenu;
    //women fragrance size dropdown menu web element(Obsession Night Perfume (CK0013))
    @FindBy(xpath = "//select[@id='option326']")
    private WebElement womenFragranceSizeNightDropdownMenu;

    //fragrance quantity input field web element
    @FindBy(xpath = "//input[@id='product_quantity']")
    private WebElement makeupQuantityInputField;
    //fragrance price web element
    @FindBy(xpath = "//label[@class='control-label']/span[@class='total-price']")
    private WebElement fragranceTotalPrice;
    //'add to cart' button web element
    @FindBy(xpath = "//ul[@class='productpagecart']/li/a")
    private WebElement addToCartButton;

    public FragrancePage(WebDriver driver) {
        super(driver);
    }

    //bulgari aqua 'eau de parfum' checkbox click method
    public void selectBulgariEauDeParfum(){womenFragranceTypeParfumCheckbox.click();}

    //'add to cart' button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    //fragrance page web element assert methods
    public boolean isStarRatingDisplayed(){return womenFragranceStarRating.isDisplayed();}
    public boolean isMenFragranceSizeDropdownMenuDisplayed(){return menFragranceSizeDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeDropdownMenuDisplayed(){return womenFragranceSizeDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceScentDropdownMenuDisplayed(){return womenFragranceScentDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceGiftCheckboxDisplayed(){return womenFragranceGiftCheckbox.isDisplayed();}
    public boolean isWomenFragranceTypeCologneCheckboxDisplayed(){return womenFragranceTypeCologneCheckbox.isDisplayed();}
    public boolean isWomenFragranceTypeToiletteCheckboxDisplayed(){return womenFragranceTypeToiletteCheckbox.isDisplayed();}
    public boolean isWomenFragranceTypeParfumCheckboxDisplayed(){return womenFragranceTypeParfumCheckbox.isDisplayed();}
    public boolean isWomenFragranceBulgariSizeDropdownMenuDisplayed(){return womenFragranceBulgariSizeDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeBeautyEauDropdownMenuDisplayed(){return womenFragranceSizeBeautyEauDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeEuphoriaDropdownMenuDisplayed(){return womenFragranceSizeEuphoriaDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeObsessionDropdownMenuDisplayed(){return womenFragranceSizeObsessionDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeCKObsessionDropdownMenuDisplayed(){return womenFragranceSizeCKObsessionDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeArmaniCodeDropdownMenuDisplayed(){return womenFragranceSizeArmaniCodeDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceSizeNightDropdownMenuDisplayed(){return womenFragranceSizeNightDropdownMenu.isDisplayed();}
    public boolean isWomenFragranceBulgariGiftCheckboxDisplayed(){return womenFragranceBulgariGiftCheckbox.isDisplayed();}
    public boolean isWomenFragranceBulgariCKObsessionGiftCheckboxDisplayed(){return womenFragranceSizeCKObsessionGiftCheckbox.isDisplayed();}
    public boolean isQuantityInputFieldDisplayed(){return makeupQuantityInputField.isDisplayed();}
    public boolean isTotalPriceDisplayed(){return fragranceTotalPrice.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}

}

package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class GuestAccountPage extends BasePage{

    //guest account page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement guestAccountPageTitle;
    //order summary section list web elements
    @FindBy(xpath = "//table[@style='width: 100%; border-spacing: 2px;']//tr//td[@class='align_left valign_top']")
    private List <WebElement> productSummaryNameElements;
    @FindBy(xpath = "//table[@style='width: 100%; border-spacing: 2px;']//tr//td[@class='align_right valign_top']")
    private List <WebElement> productSummaryUnitPriceElements;
    @FindBy(xpath = "(//table[@style='width: 100%; border-spacing: 0; padding: 0;']//tr/td/span[@class='cart_block_total'])[1]")
    private WebElement productSummarySubTotalPrice;
    @FindBy(xpath = "(//table[@style='width: 100%; border-spacing: 0; padding: 0;']//tr/td/span[@class='cart_block_total'])[3]")
    private WebElement productSummaryTotalPrice;
    //guest account input field web elements
    @FindBy(xpath = "//input[@id='guestFrm_firstname']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='guestFrm_lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='guestFrm_email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//input[@id='guestFrm_telephone']")
    private WebElement phoneNumberInputField;
    @FindBy(xpath = "//input[@id='guestFrm_fax']")
    private WebElement faxInputField;
    @FindBy(xpath = "//input[@id='guestFrm_company']")
    private WebElement companyInputField;
    @FindBy(xpath = "//input[@id='guestFrm_address_1']")
    private WebElement address1InputField;
    @FindBy(xpath = "//input[@id='guestFrm_address_2']")
    private WebElement address2InputField;
    @FindBy(xpath = "//input[@id='guestFrm_city']")
    private WebElement cityInputField;
    @FindBy(xpath = "//input[@id='guestFrm_postcode']")
    private WebElement zipCodeInputField;
    @FindBy(xpath = "//select[@id='guestFrm_country_id']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//select[@id='guestFrm_zone_id']/option[@value='223']")
    private WebElement usOption;
    //please select option web element (for invalid tests)
    @FindBy(xpath = "//select[@id='guestFrm_zone_id']/option[@value='FALSE']")
    private WebElement pleaseSelectOption;
    @FindBy(xpath = "//select[@id='guestFrm_zone_id']")
    private WebElement stateDropdownMenu;
    @FindBy(xpath = "//select[@id='guestFrm_zone_id']/option[@value='3635']")
    private WebElement illinoisOption;
    //guest account checkbox web element
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement separateShippingAddressCheckbox;
    //guest account button web elements
    @FindBy(xpath = "//a[@title='Back']")
    private WebElement backButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueButton;


    public GuestAccountPage(WebDriver driver) {
        super(driver);
    }

    //guest account page title getter
    public String getGuestAccountPageTitle(){return guestAccountPageTitle.getText();}

    //guest account page web element assert methods
    public boolean isGuestAccountPageTitleDisplayed() {return guestAccountPageTitle.isDisplayed();}
    public boolean isProductNameDisplayed() {
        for (WebElement element : productSummaryNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductSummaryUnitPriceDisplayed() {
        for (WebElement element : productSummaryUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductSummarySubTotalPriceDisplayed() {return productSummarySubTotalPrice.isDisplayed();}
    public boolean isProductSummaryTotalPriceDisplayed() {return productSummaryTotalPrice.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isEmailAddressInputFieldDisplayed() {return emailAddressInputField.isDisplayed();}
    public boolean isPhoneNumberInputFieldDisplayed() {return phoneNumberInputField.isDisplayed();}
    public boolean isFaxInputFieldDisplayed() {return faxInputField.isDisplayed();}
    public boolean isCompanyInputFieldDisplayed() {return companyInputField.isDisplayed();}
    public boolean isAddress1InputFieldDisplayed() {return address1InputField.isDisplayed();}
    public boolean isAddress2InputFieldDisplayed() {return address2InputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed() {return cityInputField.isDisplayed();}
    public boolean isZipCodeInputFieldDisplayed() {return zipCodeInputField.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed() {return countryDropdownMenu.isDisplayed();}
    public boolean isPleaseSelectOptionDisplayed() {return pleaseSelectOption.isDisplayed();}
    public boolean isStateDropdownMenuDisplayed() {return stateDropdownMenu.isDisplayed();}
    public boolean isSeparateShippingAddressCheckboxDisplayed() {return separateShippingAddressCheckbox.isDisplayed();}
    public boolean isBackButtonDisplayed() {return backButton.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}
}

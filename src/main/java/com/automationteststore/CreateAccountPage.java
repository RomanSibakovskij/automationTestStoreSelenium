package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    //create account page title web element
    @FindBy(xpath = "//h1/span[@class='maintext']")
    private WebElement createAccountPageTitle;
    //create account page input field web elements
    @FindBy(xpath = "//input[@id='AccountFrm_firstname']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_telephone']")
    private WebElement phoneNumberInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_fax']")
    private WebElement faxInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_company']")
    private WebElement companyInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_address_1']")
    private WebElement address1InputField;
    @FindBy(xpath = "//input[@id='AccountFrm_address_2']")
    private WebElement address2InputField;
    @FindBy(xpath = "//input[@id='AccountFrm_city']")
    private WebElement cityInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_postcode']")
    private WebElement zipCodeInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_loginname']")
    private WebElement loginUsernameInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//input[@id='AccountFrm_confirm']")
    private WebElement confirmPasswordInputField;
    //newsletter subscribe checkbox web elements
    @FindBy(xpath = "//input[@id='AccountFrm_newsletter1']")
    private WebElement subscribeToNewsletterCheckbox;
    @FindBy(xpath = "//input[@id='AccountFrm_newsletter0']")
    private WebElement doNotSubscribeToNewsletterCheckbox;
    //agree to privacy policy checkbox web element
    @FindBy(xpath = "//input[@id='AccountFrm_agree']")
    private WebElement agreeToTermsCheckbox;
    //dropdown menu web elements
    @FindBy(xpath = "//select[@id='AccountFrm_zone_id']")
    private WebElement stateDropdownMenu;
    //Illinois state option web element
    @FindBy(xpath = "//select[@id='AccountFrm_zone_id']/option[.='Illinois']")
    private WebElement illinoisStateOption;
    @FindBy(xpath = "//select[@id='AccountFrm_country_id']")
    private WebElement countryDropdownMenu;
    //United States country option web element
    @FindBy(xpath = "//select[@id='AccountFrm_country_id']/option[.='United States']")
    private WebElement usCountryOption;
    //continue button web element
    @FindBy(xpath = "//div[@class='col-md-2 mt20 mb40']/button[@type='submit']")
    private WebElement continueButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    //create account page title getter
    public String getCreateAccountPageTitle() {return createAccountPageTitle.getText();}

    //create account page web element assert methods
    public boolean isCreateAccountPageTitleDisplayed(){return createAccountPageTitle.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed(){return emailInputField.isDisplayed();}
    public boolean isPhoneNumberInputFieldDisplayed(){return phoneNumberInputField.isDisplayed();}
    public boolean isFaxInputFieldDisplayed(){return faxInputField.isDisplayed();}
    public boolean isCompanyInputFieldDisplayed(){return companyInputField.isDisplayed();}
    public boolean isAddress1InputFieldDisplayed(){return address1InputField.isDisplayed();}
    public boolean isAddress2InputFieldDisplayed(){return address2InputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed(){return cityInputField.isDisplayed();}
    public boolean isZipCodeInputFieldDisplayed(){return zipCodeInputField.isDisplayed();}
    public boolean isLoginUsernameInputFieldDisplayed(){return loginUsernameInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isConfirmPasswordInputFieldDisplayed(){return confirmPasswordInputField.isDisplayed();}
    public boolean isSubscribeToNewsletterCheckboxDisplayed(){return subscribeToNewsletterCheckbox.isDisplayed();}
    public boolean isDoNotSubscribeToNewsletterCheckboxDisplayed() {return doNotSubscribeToNewsletterCheckbox.isDisplayed();}
    public boolean isAgreeToTermsCheckboxDisplayed() {return agreeToTermsCheckbox.isDisplayed();}
    public boolean isStateDropdownMenuDisplayed() {return stateDropdownMenu.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed() {return countryDropdownMenu.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}

}

package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

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
    //account creation success message web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement accountCreationSuccessMessage;
    //invalid user data input message web elements
    @FindBy(xpath = "//span[.='First Name must be between 1 and 32 characters!']")
    private WebElement invalidFirstNameLengthMessage;
    @FindBy(xpath = "//span[.='Last Name must be between 1 and 32 characters!']")
    private WebElement invalidLastNameLengthMessage;
    @FindBy(xpath = "//span[.='Email Address does not appear to be valid!']")
    private WebElement invalidEmailAddressMessage;
    @FindBy(xpath = "//span[.='Address 1 must be between 3 and 128 characters!']")
    private WebElement invalidAddress1LengthMessage;
    @FindBy(xpath = "//span[.='City must be between 3 and 128 characters!']")
    private WebElement invalidCityNameLengthMessage;
    @FindBy(xpath = "//span[.='Zip/postal code must be between 3 and 10 characters!']")
    private WebElement invalidZipCodeLengthMessage;
    @FindBy(xpath = "//span[.='Login name must be alphanumeric only and between 5 and 64 characters!']")
    private WebElement invalidLoginUsernameLengthMessage;
    @FindBy(xpath = "//span[.='Password must be between 4 and 20 characters!']")
    private WebElement invalidPasswordLengthMessage;
    @FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
    private WebElement clickAgreeToTermsErrorMessage;

    //valid user input data
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address1;
    private String city;
    private int zipCode;
    private String loginUsername;
    private String password;

    //invalid (no singular input) user data
    private String noFirstName;
    private String noLastName;
    private String noEmailAddress;
    private String noAddress1;
    private String noCity;
    private int noZipCode;
    private String noLoginUsername;
    private String noPassword;
    private String noConfirmPassword;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    //create account page title getter
    public String getCreateAccountPageTitle() {return createAccountPageTitle.getText();}

    //valid user data getter method
    public void getValidUserInputData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //valid data input methods
    public void inputFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }
    public void inputLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }
    public void inputEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(emailAddress);
    }
    public void inputAddress1(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", address1InputField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(address1);
    }
    public void inputCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }
    //click state dropdown menu method
    public void clickStateDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdownMenu));
        stateDropdownMenu.click();
    }
    //select Illinois state method
    public void selectIllinoisOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(illinoisStateOption));
        illinoisStateOption.click();
    }
    //click country dropdown menu
    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }
    //select United Stated method
    public void selectUSOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(usCountryOption));
        usCountryOption.click();
    }
    public void inputZipCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(String.valueOf(zipCode));
    }
    public void inputLoginUsername(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginUsernameInputField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginUsernameInputField));
        loginUsernameInputField.sendKeys(loginUsername);
    }
    public void inputPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }
    public void inputConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(password);
    }
    //click subscribe to newsletter checkbox method
    public void clickSubscribeToNewsletterCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeToNewsletterCheckbox));
        subscribeToNewsletterCheckbox.click();
    }
    //click 'agree to terms' checkbox method
    public void clickAgreeToTermsCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(agreeToTermsCheckbox));
        agreeToTermsCheckbox.click();
    }

    //click 'Continue' button method
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    //invalid user data getter method (no first name)
    public void getUserInputDataNoFirstName(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("No first name: " + noFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - no first name
    public void inputNoFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }

    //invalid user data getter method (no lastname)
    public void getUserInputDataNoLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("No last name: " + noLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - no last name
    public void inputNoLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }

    //invalid user data getter method (no email address)
    public void getUserInputDataNoEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noEmailAddress = "";
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("No email address: " + noEmailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - no email address
    public void inputNoEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(noEmailAddress);
    }

    //invalid user data getter method (no address1)
    public void getUserInputDataNoAddress1(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        noAddress1 = "";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("No address: " + noAddress1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - no user address
    public void inputNoAddress1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(noAddress1);
    }

    //invalid user data getter method (no user city)
    public void getUserInputDataNoCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        noCity = "";
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("No city: " + noCity);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - no user city
    public void inputNoCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(noCity);
    }

    //account creation success message getter
    public String getAccountCreationSuccessMessage(){return accountCreationSuccessMessage.getText();}

    //login page invalid input message getters
    public String getInvalidFirstNameLengthMessage(){return invalidFirstNameLengthMessage.getText();}
    public String getInvalidLastNameLengthMessage(){return invalidLastNameLengthMessage.getText();}
    public String getInvalidEmailAddressMessage(){return invalidEmailAddressMessage.getText();}
    public String getInvalidAddress1Message(){return invalidAddress1LengthMessage.getText();}
    public String getInvalidCityNameLengthMessage(){return invalidCityNameLengthMessage.getText();}

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

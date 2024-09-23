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
    @FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
    private WebElement existingEmailAddressMessage;
    @FindBy(xpath = "//span[.='Address 1 must be between 3 and 128 characters!']")
    private WebElement invalidAddress1LengthMessage;
    @FindBy(xpath = "//span[.='City must be between 3 and 128 characters!']")
    private WebElement invalidCityNameLengthMessage;
    @FindBy(xpath = "//span[.='Please select a region / state!']")
    private WebElement selectStateMessage;
    @FindBy(xpath = "//span[.='Please select a country!']")
    private WebElement selectCountryMessage;
    @FindBy(xpath = "//span[.='Zip/postal code must be between 3 and 10 characters!']")
    private WebElement invalidZipCodeLengthMessage;
    @FindBy(xpath = "//span[.='Login name must be alphanumeric only and between 5 and 64 characters!']")
    private WebElement invalidLoginUsernameLengthMessage;
    @FindBy(xpath = "//span[.='This login name is not available. Try different login name!']")
    private WebElement existingUsernameMessage;
    @FindBy(xpath = "//span[.='Password must be between 4 and 20 characters!']")
    private WebElement invalidPasswordLengthMessage;
    @FindBy(xpath = "//span[.='Password confirmation does not match password!']")
    private WebElement mismatchingPasswordMessage;
    @FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
    private WebElement clickAgreeToTermsErrorMessage;
    //please select country option web element (since default is UK)
    @FindBy(xpath = "//select[@id='AccountFrm_country_id']/option[@value='FALSE']")
    private WebElement pleaseSelectOption;
    //'continue' button after confirmation
    @FindBy(xpath = "//a[@title='Continue']")
    private WebElement continueAfterConfirmationButton;
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
    private String noLoginUsername;
    private String noPassword;

    //invalid singular input
    private String tooLongFirstName;
    private String tooLongLastName;
    private String invalidEmailAddressFormat;
    private String tooShortEmailAddress;
    private String tooLongEmailAddress;
    private String existingEmailAddress;
    private String tooShortAddress1;
    private String tooLongAddress1;
    private String tooShortCity;
    private String tooLongCity;
    private int tooShortZipCode;
    private String tooLongZipCode; //the output gets converted to octal literal so String is used here for validity instead of int
    private String tooShortUsername;
    private String tooLongUsername;
    private String existingUsername;
    private String tooShortPassword;
    private String tooLongPassword;

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
    //select United States method
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

    //click 'Continue' after confirmation button method
    public void clickContinueAfterConfirmationButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(continueAfterConfirmationButton));
        continueAfterConfirmationButton.click();
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
    //select 'Please select' method
    public void selectPleaseSelectOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(pleaseSelectOption));
        pleaseSelectOption.click();
    }

    //invalid user data getter method (no login username)
    public void getUserInputDataNoUsername(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        noLoginUsername = "";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("No login username: " + noLoginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - no user login username
    public void inputNoUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginUsernameInputField));
        loginUsernameInputField.sendKeys(noLoginUsername);
    }

    //invalid user data getter method (no password)
    public void getUserInputDataNoPassword(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        noPassword = "";

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("No password: " + noPassword);
    }
    //invalid data input methods - no password
    public void inputNoPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }

    //invalid user data getter method (too long first name)
    public void getUserInputDataTooLongFirstName(){
        tooLongFirstName = "AkgggtsdsaddsasdqqwqwqwqtyhASSDss";
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("Too long first name: " + tooLongFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input methods - too long first name
    public void inputTooLongFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooLongFirstName);
    }

    //invalid user data getter method (too long last name)
    public void getUserInputDataTooLongLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "AkgggtsdsaddsasdqqwqwqwqtyhASSDss";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Too long last name: " + tooLongLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too long last name
    public void inputTooLongLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooLongLastName);
    }

    //invalid user data getter method (invalid email address format)
    public void getUserInputDataInvalidEmailFormat(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        invalidEmailAddressFormat = "m2@com";
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Invalid email address format: " + invalidEmailAddressFormat);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - invalid email address format
    public void inputInvalidEmailFormat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(invalidEmailAddressFormat);
    }

    //invalid user data getter method (too short email address)
    public void getUserInputDataTooShortEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooShortEmailAddress = TestDataGenerator.generateRandomEmailAddress(1);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Too short email address: " + tooShortEmailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too short email address
    public void inputTooShortEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(tooShortEmailAddress);
    }

    //invalid user data getter method (too long email address)
    public void getUserInputDataTooLongEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooLongEmailAddress = TestDataGenerator.generateRandomEmailAddress(110);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Too long email address: " + tooLongEmailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too long email address
    public void inputTooLongEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(tooLongEmailAddress);
    }

    //invalid user data getter method (already existing email address)
    public void getUserInputDataExistingEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        existingEmailAddress = "m10@mail.com";
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Existing email address(in database): " + existingEmailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too long email address
    public void inputExistingEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(existingEmailAddress);
    }

    //invalid user data getter method (too short address1)
    public void getUserInputDataTooShortAddress1(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooShortAddress1 = "Ag";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Too short address: " + tooShortAddress1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too short user address
    public void inputTooShortAddress1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooShortAddress1);
    }

    //invalid user data getter method (too long address1)
    public void getUserInputDataTooLongAddress1(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooLongAddress1 = "Akg721sdsaddsasdqqwqwqwq123ASSDssafdsfgfdfhgdfQWEsssdssadasdwewe1Adsdasdsadsdsdsadccczsadfgfghgfhcxcxzvxvfdfdhfjjjjttgrgerrerdsda";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Too long address: " + tooLongAddress1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too short user address
    public void inputTooLongAddress1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooLongAddress1);
    }

    //invalid user data getter method (too short user city)
    public void getUserInputDataTooShortCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        tooShortCity = "DC";
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("Too short city: " + tooShortCity);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too short user city
    public void inputTooShortCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooShortCity);
    }

    //invalid user data getter method (too long user city)
    public void getUserInputDataTooLongCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        tooLongCity = "Akg721sdsaddsasdqqwqwqwq123ASSDssafdsfgfdfhgdfQWEsssdssadasdwewe1Adsdasdsadsdsdsadccczsadfgfghgfhcxcxzvxvfdfdhfjjjjttgrgerrerdsda";
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("Too long city: " + tooLongCity);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too long user city
    public void inputTooLongCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooLongCity);
    }

    //invalid user data getter method (too short zip code)
    public void getUserInputDataTooShortZipCode(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        tooShortZipCode = 01;
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Too short zip code: " + tooShortZipCode);
        logger.info("Login username: " + noLoginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too short zip code
    public void inputTooShortZipCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(String.valueOf(tooShortZipCode));
    }

    //invalid user data getter method (no zip code)
    public void getUserInputDataNoZipCode(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Login username: " + noLoginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }

    //invalid user data getter method (too long zip code)
    public void getUserInputDataTooLongZipCode(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        tooLongZipCode = "18910939523"; //11 chars
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Too long zip code: " + tooLongZipCode);
        logger.info("Login username: " + noLoginUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too long zip code
    public void inputTooLongZipCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(tooLongZipCode);
    }

    //invalid user data getter method (too short username)
    public void getUserInputDataTooShortUsername(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        tooShortUsername = TestDataGenerator.generateRandomUsername(4);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Too short login username: " + tooShortUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too short user login username
    public void inputTooShortUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginUsernameInputField));
        loginUsernameInputField.sendKeys(tooShortUsername);
    }

    //invalid user data getter method (too long username)
    public void getUserInputDataTooLongUsername(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        tooLongUsername = TestDataGenerator.generateRandomUsername(65);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Too long login username: " + tooLongUsername);
        logger.info("Password: " + password);
        logger.info("Matching confirm password: " + password);
    }
    //invalid data input method - too long user login username
    public void inputTooLongUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginUsernameInputField));
        loginUsernameInputField.sendKeys(tooLongUsername);
    }

    //invalid user data getter method (too short password)
    public void getUserInputDataTooShortPassword(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        tooShortPassword = "Ark";

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Too short password: " + tooShortPassword);
    }
    //invalid data input methods - too short password
    public void inputTooShortPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooShortPassword);
    }

    //invalid user data getter method (too long password)
    public void getUserInputDataTooLongPassword(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        loginUsername = TestDataGenerator.generateRandomUsername(5);
        tooLongPassword = "Akg721sdsaddsasdqqsda";

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Login username: " + loginUsername);
        logger.info("Too long password: " + tooLongPassword);
    }
    //invalid data input methods - too long password
    public void inputTooLongPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooLongPassword);
    }

    //invalid user data getter method (existing username)
    public void getUserInputDataExistingUsername(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();
        existingUsername = "LoggerThomas";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
        logger.info("Existing username username: " + existingUsername);
        logger.info("Password: " + password);
    }
    //invalid data input methods - existing username
    public void inputExistingUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginUsernameInputField));
        loginUsernameInputField.sendKeys(existingUsername);
    }

    //account creation success message getter
    public String getAccountCreationSuccessMessage(){return accountCreationSuccessMessage.getText();}

    //first name getter
    public String getFirstName(){return firstName;}

    //valid username, password getters
    public String getUsername(){return loginUsername;}
    public String getPassword(){return password;}

    //login page invalid input message getters
    public String getInvalidFirstNameLengthMessage(){return invalidFirstNameLengthMessage.getText();}
    public String getInvalidLastNameLengthMessage(){return invalidLastNameLengthMessage.getText();}
    public String getInvalidEmailAddressMessage(){return invalidEmailAddressMessage.getText();}
    public String getExistingEmailAddressMessage(){return existingEmailAddressMessage.getText();}
    public String getInvalidAddress1Message(){return invalidAddress1LengthMessage.getText();}
    public String getInvalidCityNameLengthMessage(){return invalidCityNameLengthMessage.getText();}
    public String getSelectStateMessage(){return selectStateMessage.getText();}
    public String getInvalidZipCodeMessage(){return invalidZipCodeLengthMessage.getText();}
    public String getSelectCountryMessage(){return selectCountryMessage.getText();}
    public String getInvalidLoginUserNameLengthMessage(){return invalidLoginUsernameLengthMessage.getText();}
    public String getExistingUsernameMessage(){return existingUsernameMessage.getText();}
    public String getInvalidPasswordLengthMessage(){return invalidPasswordLengthMessage.getText();}
    public String getMismatchingPasswordMessage(){return mismatchingPasswordMessage.getText();}
    public String getAgreeToTermsCheckboxError(){return clickAgreeToTermsErrorMessage.getText();}

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

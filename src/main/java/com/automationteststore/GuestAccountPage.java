package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
    @FindBy(xpath = "(//table[@style='width: 100%; border-spacing: 0; padding: 0;']//tr/td/span[@class='cart_block_total'])[2]")
    private WebElement productSummarySubTotalPrice;
    @FindBy(xpath = "(//table[@style='width: 100%; border-spacing: 0; padding: 0;']//tr/td/span[@class='cart_block_total'])[4]")
    private WebElement productSummaryTotalPrice;
    @FindBy(xpath = "(//table[@style='width: 100%; border-spacing: 0; padding: 0;']//tr/td/span[@class='cart_block_total'])[4]")
    private WebElement productSpecialRetailPrice;
    @FindBy(xpath = "(//table[@style='width: 100%; border-spacing: 0; padding: 0;']//tr/td/span[@class='cart_block_total'])[6]")
    private WebElement productSpecialTotalPrice;
    //guest account input field web elements
    @FindBy(xpath = "//input[@id='guestFrm_firstname']")
    private WebElement firstNameInputField;
    //error message web elements
    @FindBy(xpath = "//span[@class='help-block']")
    private WebElement errorFirstNameLengthMessage;
    @FindBy(xpath = "//fieldset/div[2]/span[@class='help-block']")
    private WebElement errorLastNameLengthMessage;
    @FindBy(xpath = "//span[.='E-Mail Address does not appear to be valid!']")
    private WebElement errorEmailMessage;
    @FindBy(xpath = "//span[.='Address 1 must be greater than 3 and less than 128 characters!']")
    private WebElement errorAddress1Message;
    @FindBy(xpath = "//span[.='City must be greater than 3 and less than 128 characters!']")
    private WebElement errorCityMessage;
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
    @FindBy(css = "#guestFrm_country_id [value='223']")
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

    //valid user input data
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address1;
    private String city;
    private int zipCode;

    //invalid (no singular input) user data
    private String noFirstName;
    private String noLastName;
    private String noEmailAddress;
    private String noAddress1;
    private String noCity;

    //invalid singular input
    private String tooShortFirstName;
    private String tooLongFirstName;
    private String tooShortLastName;
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
    private String tooLongZipCode; //the output gets converted to octal literal so String is used here for validity instead of int;


    public GuestAccountPage(WebDriver driver) {
        super(driver);
    }

    //valid guest account input data getter method
    public void getValidGuestInputData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for user account creation: " + "\n");
        logger.info("Guest first name: " + firstName);
        logger.info("Guest last name: " + lastName);
        logger.info("Guest email address: " + emailAddress);
        logger.info("Guest address: " + address1);
        logger.info("Guest city: " + city);
        logger.info("Guest zip code: " + zipCode);
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
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(emailAddress);
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
    public void selectIllinoisOption(){illinoisOption.click();}

    //click country dropdown menu
    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }
    //select United States method
    public void selectUSOption(){usOption.click();}

    public void inputZipCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(zipCodeInputField));
        zipCodeInputField.sendKeys(String.valueOf(zipCode));
    }
    //click 'continue' button method
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    //invalid guest data getter method (no first name)
    public void getGuestInputDataNoFirstName(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("No first name: " + noFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - no first name
    public void inputNoFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }

    //invalid guest data getter method (too short first name)
    public void getGuestInputDataTooShortFirstName(){
        tooShortFirstName = "Ag";
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("Too short first name: " + tooShortFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too short first name
    public void inputTooShortFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooShortFirstName);
    }

    //invalid guest data getter method (too long first name)
    public void getGuestInputDataTooLongFirstName(){
        tooLongFirstName = "Akgdfgsdsaddsasdqqsdaasaasafsdfds";
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("Too long first name: " + tooLongFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too long first name
    public void inputTooLongFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooLongFirstName);
    }

    //invalid guest data getter method (no last name)
    public void getGuestInputDataNoLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("No last name: " + noLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - no last name
    public void inputNoLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }

    //invalid guest data getter method (too short last name)
    public void getGuestInputDataTooShortLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "Kd";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Too short last name: " + tooShortLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too short last name
    public void inputTooShortLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooShortLastName);
    }

    //invalid guest data getter method (too long last name)
    public void getGuestInputDataTooLongLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "Kdgdfgsdsaddsasdqqsdaasaasafsdfds";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Too long last name: " + tooLongLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too long last name
    public void inputTooLongLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooLongLastName);
    }

    //invalid guest data getter method (no email address)
    public void getGuestInputDataNoEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noEmailAddress = "";
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("No email address: " + noEmailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - no email address
    public void inputNoEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(noEmailAddress);
    }

    //invalid guest data getter method (invalid email address format)
    public void getGuestInputDataInvalidEmailFormat(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        invalidEmailAddressFormat = "m2@com";
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Invalid email address format: " + invalidEmailAddressFormat);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - invalid email address format
    public void inputInvalidEmailFormat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(invalidEmailAddressFormat);
    }

    //invalid guest data getter method (already existing email address)
    public void getGuestInputDataExistingEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        existingEmailAddress = "m10@mail.com";
        address1 = TestDataGenerator.generateRandomAddress(7);
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Existing email address(in database): " + existingEmailAddress);
        logger.info("Address: " + address1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too long email address
    public void inputExistingEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(existingEmailAddress);
    }

    //invalid guest data getter method (no address1)
    public void getGuestInputDataNoAddress1(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        noAddress1 = "";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("No address: " + noAddress1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too short guest address
    public void inputNoAddress1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(noAddress1);
    }

    //invalid guest data getter method (too short address1)
    public void getGuestInputDataTooShortAddress1(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooShortAddress1 = "Ag";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Too short address: " + tooShortAddress1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too short guest address
    public void inputTooShortAddress1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooShortAddress1);
    }

    //invalid guest data getter method (too long address1)
    public void getGuestInputDataTooLongAddress1(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooLongAddress1 = "Akg721sdsaddsasdqqwqwqwq123ASSDssafdsfgfdfhgdfQWEsssdssadasdwewe1Adsdasdsadsdsdsadccczsadfgfghgfhcxcxzvxvfdfdhfjjjjttgrgerrerdsda";
        city = TestDataGenerator.getRandomCity();
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Too long address: " + tooLongAddress1);
        logger.info("City: " + city);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - too long guest address
    public void inputTooLongAddress1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooLongAddress1);
    }

    //invalid user data getter method (no guest city)
    public void getGuestInputDataNoCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        address1 = TestDataGenerator.generateRandomAddress(7);
        noCity = "";
        zipCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid data for guest account creation: " + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Address: " + address1);
        logger.info("No city: " + noCity);
        logger.info("Zip code: " + zipCode);
    }
    //invalid data input method - no guest city
    public void inputNoCity(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", cityInputField);
        cityInputField.sendKeys(noCity);
    }

    //guest account page title getter
    public String getGuestAccountPageTitle(){return guestAccountPageTitle.getText();}

    //guest account product summary data getters
    public List<String> getSummaryProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productSummaryNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getSummaryProductUnitPrice() {
        List<String> productPrice = new ArrayList<>();
        for (WebElement element : productSummaryUnitPriceElements) {
            productPrice.add(element.getText());
        }
        return productPrice;
    }
    public String getSummaryProductSubTotalPrice(){return productSummarySubTotalPrice.getText();}
    public String getSummarySpecialRetailPrice(){return productSpecialRetailPrice.getText();}
    public String getSummaryProductTotalPrice(){return productSummaryTotalPrice.getText();}
    public String getSummarySpecialTotalPrice(){return productSpecialTotalPrice.getText();}

    //guest account error message getters
    public String getErrorFirstNameLengthMessage(){return errorFirstNameLengthMessage.getText();}
    public String getErrorLastNameLengthMessage(){return errorLastNameLengthMessage.getText();}
    public String getEmailErrorMessage(){return errorEmailMessage.getText();}
    public String getAddress1ErrorMessage(){return errorAddress1Message.getText();}
    public String getCityErrorMessage(){return errorCityMessage.getText();}

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
    public boolean isProductSummarySpecialRetailPriceDisplayed(){return productSpecialRetailPrice.isDisplayed();}
    public boolean isProductSummaryTotalPriceDisplayed() {return productSummaryTotalPrice.isDisplayed();}
    public boolean isProductSummarySpecialTotalPriceDisplayed(){return productSpecialTotalPrice.isDisplayed();}
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
    public boolean isStateDropdownMenuDisplayed() {return stateDropdownMenu.isDisplayed();}
    public boolean isSeparateShippingAddressCheckboxDisplayed() {return separateShippingAddressCheckbox.isDisplayed();}
    public boolean isBackButtonDisplayed() {return backButton.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}
}

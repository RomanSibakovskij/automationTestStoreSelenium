package com.automationteststore;

import org.slf4j.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //go to login/register page from homepage test method
    protected void goToLoginRegisterPageTest(HomePage homePage){
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //click login/register link
        homePage.clickLoginRegisterLink();
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //assert the user got navigated to login/register page
        assertEquals("ACCOUNT LOGIN", loginRegisterPage.getAccountLoginPageTitleText(), "The login/register page title isn't as expected or user is on the wrong page");
    }

    //valid user account registration test method
    protected void validUserAccountCreationTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter
        createAccountPage.getValidUserInputData();
        //valid user data input methods
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the account has been created
        assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", createAccountPage.getAccountCreationSuccessMessage(), "The success message doesn't match expectations or the account hasn't been created successfully");
    }

    //invalid user account registration test method (no first name)
    protected void userAccountCreationNoFirstNameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without user first name
        createAccountPage.getUserInputDataNoFirstName();
        //valid user data input methods (omit first name)
        createAccountPage.inputNoFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("First Name must be between 1 and 32 characters!", createAccountPage.getInvalidFirstNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too long first name)
    protected void userAccountCreationTooLongFirstNameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with roo long first name
        createAccountPage.getUserInputDataTooLongFirstName();
        //valid user data input methods (too long first name)
        createAccountPage.inputTooLongFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("First Name must be between 1 and 32 characters!", createAccountPage.getInvalidFirstNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no last name)
    protected void userAccountCreationNoLastNameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without user last name
        createAccountPage.getUserInputDataNoLastName();
        //valid user data input methods (omit last name)
        createAccountPage.inputFirstName();
        createAccountPage.inputNoLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Last Name must be between 1 and 32 characters!", createAccountPage.getInvalidLastNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no last name)
    protected void userAccountCreationTooLongLastNameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long user last name
        createAccountPage.getUserInputDataTooLongLastName();
        //valid user data input methods (too long last name)
        createAccountPage.inputFirstName();
        createAccountPage.inputTooLongLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Last Name must be between 1 and 32 characters!", createAccountPage.getInvalidLastNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no email address)
    protected void userAccountCreationNoEmailTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without user email address
        createAccountPage.getUserInputDataNoEmail();
        //valid user data input methods (omit email address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputNoEmail();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Email Address does not appear to be valid!", createAccountPage.getInvalidEmailAddressMessage(), "The expected error didn't appear"); //it seems to be a general error message
    }

    //invalid user account registration test method (invalid email address format)
    protected void userAccountCreationInvalidEmailFormatTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with invalid user email address format
        createAccountPage.getUserInputDataInvalidEmailFormat();
        //valid user data input methods (invalid email address format)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputInvalidEmailFormat();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Email Address does not appear to be valid!", createAccountPage.getInvalidEmailAddressMessage(), "The expected error didn't appear"); //it seems to be a general error message
    }

    //invalid user account registration test method (too short email address)
    protected void userAccountCreationTooShortEmailTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too short user email address
        createAccountPage.getUserInputDataTooShortEmail();
        //valid user data input methods (too short email address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputTooShortEmail();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //log the issue if the account gets created with too short email address
        if(createAccountPage.getAccountCreationSuccessMessage().equals("YOUR ACCOUNT HAS BEEN CREATED!")) {
            logger.error("The user account got created with too short email address");
        }else{
            assertEquals("Email Address does not appear to be valid!", createAccountPage.getInvalidEmailAddressMessage(), "The expected error didn't appear"); //it seems to be a general error message
        }
    }

    //invalid user account registration test method (too long email address)
    protected void userAccountCreationTooLongEmailTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long user email address
        createAccountPage.getUserInputDataTooLongEmail();
        //valid user data input methods (too long email address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputTooLongEmail();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //log the issue if the account gets created with too long email address
        if(createAccountPage.getAccountCreationSuccessMessage().equals("YOUR ACCOUNT HAS BEEN CREATED!")) {
            logger.error("The user account got created with too long email address");
        }else{
            assertEquals("Email Address does not appear to be valid!", createAccountPage.getInvalidEmailAddressMessage(), "The expected error didn't appear"); //it seems to be a general error message
        }
    }

    //invalid user account registration test method (already existing email address (in database))
    protected void userAccountCreationExistingEmailTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with existing user email address
        createAccountPage.getUserInputDataExistingEmail();
        //valid user data input methods (existing email address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputExistingEmail();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //log the issue if the account gets created with existing email address
        if(createAccountPage.getAccountCreationSuccessMessage().equals("YOUR ACCOUNT HAS BEEN CREATED!")) {
            logger.error("The user account got created with existing email address");
        }else{
            assertEquals("×\n" + "Error: E-Mail Address is already registered!", createAccountPage.getExistingEmailAddressMessage(), "The expected error didn't appear"); //it seems to be a general error message
        }
    }

    //invalid user account registration test method (no user address (address 1))
    protected void userAccountCreationNoAddress1Test(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without user address
        createAccountPage.getUserInputDataNoAddress1();
        //valid user data input methods (omit user address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputNoAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Address 1 must be between 3 and 128 characters!", createAccountPage.getInvalidAddress1Message(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too short user address (address 1))
    protected void userAccountCreationTooShortAddress1Test(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too short user address
        createAccountPage.getUserInputDataTooShortAddress1();
        //valid user data input methods (too short user address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputTooShortAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Address 1 must be between 3 and 128 characters!", createAccountPage.getInvalidAddress1Message(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too long user address (address 1))
    protected void userAccountCreationTooLongAddress1Test(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long user address
        createAccountPage.getUserInputDataTooLongAddress1();
        //valid user data input methods (too long user address)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputTooLongAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Address 1 must be between 3 and 128 characters!", createAccountPage.getInvalidAddress1Message(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no user city)
    protected void userAccountCreationNoCityTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without user city
        createAccountPage.getUserInputDataNoCity();
        //valid user data input methods  (omit user city)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputNoCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("City must be between 3 and 128 characters!", createAccountPage.getInvalidCityNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too short user city)
    protected void userAccountCreationTooShortCityTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too short user city
        createAccountPage.getUserInputDataTooShortCity();
        //valid user data input methods  (too short user city)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputTooShortCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("City must be between 3 and 128 characters!", createAccountPage.getInvalidCityNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too long user city)
    protected void userAccountCreationTooLongCityTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long user city
        createAccountPage.getUserInputDataTooLongCity();
        //valid user data input methods  (too long user city)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputTooLongCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("City must be between 3 and 128 characters!", createAccountPage.getInvalidCityNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no user state selection)
    protected void userAccountCreationNoStateTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter
        createAccountPage.getValidUserInputData();
        //valid user data input methods  (omit user city)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //omit clicking state dropdown menu
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Please select a region / state!", createAccountPage.getSelectStateMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no user country selection)
    protected void userAccountCreationNoCountryTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter
        createAccountPage.getValidUserInputData();
        //valid user data input methods  (omit user city)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //omit clicking state dropdown menu
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'Please select' option since default is United Kingdom
        createAccountPage.selectPleaseSelectOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Please select a country!", createAccountPage.getSelectCountryMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no login username)
    protected void userAccountCreationNoUsernameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without login username
        createAccountPage.getUserInputDataNoUsername();
        //valid user data input methods  (omit login username)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data (omit login username)
        createAccountPage.inputNoUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Login name must be alphanumeric only and between 5 and 64 characters!", createAccountPage.getInvalidLoginUserNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no user password)
    protected void userAccountCreationNoPasswordTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - without login password
        createAccountPage.getUserInputDataNoPassword();
        //valid user data input methods  (omit user password)
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data (omit user password)
        createAccountPage.inputLoginUsername();
        createAccountPage.inputNoPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Password must be between 4 and 20 characters!", createAccountPage.getInvalidPasswordLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no confirm password)
    protected void userAccountCreationNoConfirmPasswordTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter
        createAccountPage.getValidUserInputData();
        //valid user data input methods
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Password confirmation does not match password!", createAccountPage.getMismatchingPasswordMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (no login username)
    protected void userAccountCreationNoAgreeToTermsTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter
        createAccountPage.getValidUserInputData();
        //valid user data input methods
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmailAddress();
        createAccountPage.inputAddress1();
        createAccountPage.inputCity();
        //click country dropdown menu
        createAccountPage.clickCountryDropdownMenu();
        //select 'United States' option
        createAccountPage.selectUSOption();
        //click state dropdown menu
        createAccountPage.clickStateDropdownMenu();
        //click 'Illinois' option
        createAccountPage.selectIllinoisOption();
        createAccountPage.inputZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //omit clicking 'Agree to Terms' checkbox
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("×\n" + "Error: You must agree to the Privacy Policy!", createAccountPage.getAgreeToTermsCheckboxError(), "The expected error didn't appear");
    }

    //homepage web element assert
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert the automation store logo is visible
        assertTrue(homePage.isAutomationStoreLogoDisplayed(), "The Automation Store Logo is not displayed");
        //assert login/register navbar link is displayed
        assertTrue(homePage.isLoginRegisterNavLinkDisplayed(), "The login/register nav link is not displayed");
        //assert specials nav link is displayed
        assertTrue(homePage.isSpecialsNavLinkDisplayed(), "The specials nav link is not displayed");
        //assert account navbar link is displayed
        assertTrue(homePage.isAccountNavLinkDisplayed(), "The account nav link is not displayed");
        //assert cart nav link is displayed
        assertTrue(homePage.isCartNavLinkDisplayed(), "The cart nav link is not displayed");
        //assert checkout nav link is displayed
        assertTrue(homePage.isCheckoutNavLinkDisplayed(), "The checkout nav link is not displayed");
        //assert search input field is displayed
        assertTrue(homePage.isSearchInputFieldDisplayed(), "The search input field is not displayed");
        //assert search icon button is displayed
        assertTrue(homePage.isSearchIconButtonDisplayed(), "The search icon button is not displayed");
        //assert currency hover menu is displayed
        assertTrue(homePage.isCurrencyHoverMenuDisplayed(), "The currency hover menu is not displayed");
        //assert cart hover menu is displayed
        assertTrue(homePage.isCartHoverMenuDisplayed(), "The cart hover menu is not displayed");
        //assert 'facebook' icon button is displayed
        assertTrue(homePage.isFacebookIconButtonDisplayed(), "The facebook icon button is not displayed");
        //assert 'twitter' icon button is displayed
        assertTrue(homePage.isTwitterIconButtonDisplayed(), "The twitter icon button is not displayed");
        //assert 'linked in' icon button is displayed
        assertTrue(homePage.isLinkedinIconButtonDisplayed(), "The linkedin icon button is not displayed");
        //assert home hover menu is displayed
        assertTrue(homePage.isHomeHoverMenuDisplayed(), "The home hover menu is not displayed");
        //assert apparel & accessories hover menu is displayed
        assertTrue(homePage.isApparelAccessoriesHoverMenuDisplayed(), "The apparel & accessories hover menu is not displayed");
        //assert makeup hover menu is displayed
        assertTrue(homePage.isMakeupHoverMenuDisplayed(), "The makeup hover menu is not displayed");
        //assert skincare hover menu is displayed
        assertTrue(homePage.isSkincareHoverMenuDisplayed(), "The skincare hover menu is not displayed");
        //assert fragrance hover menu is displayed
        assertTrue(homePage.isFragranceHoverMenuDisplayed(), "The fragrance hover menu is not displayed");
        //assert men hover menu is displayed
        assertTrue(homePage.isMenHoverMenuDisplayed(), "The men hover menu is not displayed");
        //assert haircare hover menu is displayed
        assertTrue(homePage.isHaircareHoverMenuDisplayed(), "The haircare hover menu is not displayed");
        //assert books hover menu is displayed
        assertTrue(homePage.isBooksHoverMenuDisplayed(), "The books hover menu is not displayed");
        //assert banner slider is displayed
        assertTrue(homePage.isBannerSliderDisplayed(), "The banner slider is not displayed");
        //assert fast shipping label is displayed
        assertTrue(homePage.isFastShippingLabelDisplayed(), "The fast shipping label is not displayed");
        //assert easy payments label is displayed
        assertTrue(homePage.isEasyPaymentLabelDisplayed(), "The easy payment label is not displayed");
        //assert shipping options label is displayed
        assertTrue(homePage.isShippingOptionsLabelDisplayed(), "The shipping options label is not displayed");
        //assert large variety label is displayed
        assertTrue(homePage.isLargeVarietyLabelDisplayed(), "The large variety label is not displayed");
        //assert homepage welcome section is displayed
        assertTrue(homePage.isWelcomeMessageSectionDisplayed(), "The welcome message section is not displayed");
    }

    //login/register page web element assert
    protected void isLoginRegisterPageWebElementDisplayed(LoginRegisterPage loginRegisterPage){
        //assert the login/register login section title is displayed
        assertTrue(loginRegisterPage.isAccountLoginPageTitleDisplayed(), "The account login page title is not displayed");
        //assert the register button is displayed
        assertTrue(loginRegisterPage.isRegisterButtonDisplayed(), "The register button is not displayed");
    }

    //create page web element assert
    protected void isCreateAccountPageWebElementDisplayed(CreateAccountPage createAccountPage){
        //assert the create account page title is displayed
        assertTrue(createAccountPage.isCreateAccountPageTitleDisplayed(), "The create account page title is not displayed");
        //assert the first name input field is displayed
        assertTrue(createAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field is not displayed");
        //assert the last name input field is displayed
        assertTrue(createAccountPage.isLastNameInputFieldDisplayed(), "The last name input field is not displayed");
        //assert email input field is displayed
        assertTrue(createAccountPage.isEmailInputFieldDisplayed(), "The email input field is not displayed");
        //assert phone number input field is displayed
        assertTrue(createAccountPage.isPhoneNumberInputFieldDisplayed(), "The password input field is not displayed");
        //assert fax input field is displayed
        assertTrue(createAccountPage.isFaxInputFieldDisplayed(), "The fax input field is not displayed");
        //assert company input field is displayed
        assertTrue(createAccountPage.isCompanyInputFieldDisplayed(), "The company input field is not displayed");
        //assert address1 input field is displayed
        assertTrue(createAccountPage.isAddress1InputFieldDisplayed(), "The address1 input field is not displayed");
        //assert address2 input field is displayed
        assertTrue(createAccountPage.isAddress2InputFieldDisplayed(), "The address2 input field is not displayed");
        //assert city input field is displayed
        assertTrue(createAccountPage.isCityInputFieldDisplayed(), "The city input field is not displayed");
        //assert state dropdown menu is displayed
        assertTrue(createAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu is not displayed");
        //assert zip code input field is displayed
        assertTrue(createAccountPage.isZipCodeInputFieldDisplayed(), "The zip code input field is not displayed");
        //assert country dropdown menu is displayed
        assertTrue(createAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu is not displayed");
        //assert login username input field is displayed
        assertTrue(createAccountPage.isLoginUsernameInputFieldDisplayed(), "The login username input field is not displayed");
        //assert password input field is displayed
        assertTrue(createAccountPage.isPasswordInputFieldDisplayed(), "The password input is not displayed");
        //assert confirm password input field is displayed
        assertTrue(createAccountPage.isConfirmPasswordInputFieldDisplayed(), "The confirm password input field is not displayed");
        //assert subscribe to newsletter checkbox is displayed
        assertTrue(createAccountPage.isSubscribeToNewsletterCheckboxDisplayed(), "The 'subscribe' checkbox is not displayed");
        //assert don't subscribe to newsletter checkbox is displayed
        assertTrue(createAccountPage.isDoNotSubscribeToNewsletterCheckboxDisplayed(), "The 'do not subscribe' checkbox is not displayed");
        //assert agree to terms checkbox is displayed
        assertTrue(createAccountPage.isAgreeToTermsCheckboxDisplayed(), "The 'agree to terms' checkbox is not displayed");
        //assert continue button is displayed
        assertTrue(createAccountPage.isContinueButtonDisplayed(), "The continue button is not displayed");

    }


}

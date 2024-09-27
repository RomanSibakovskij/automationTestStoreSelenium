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
        //click 'continue' button after confirmation
        createAccountPage.clickContinueAfterConfirmationButton();
        AccountPage accountPage = new AccountPage(driver);
        //assert the correct user is being displayed in the account dashboard
        assertEquals(createAccountPage.getFirstName(), accountPage.getFirstNameFromDashboardText(), "The first names don't match expectations");
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

    //invalid user account registration test method (no zip code)
    protected void userAccountCreationNoZipCodeTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with no zip code
        createAccountPage.getUserInputDataNoZipCode();
        //valid user data input methods  (no zip code)
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
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Zip/postal code must be between 3 and 10 characters!", createAccountPage.getInvalidZipCodeMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too short zip code)
    protected void userAccountCreationTooShortZipCodeTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too short zip code
        createAccountPage.getUserInputDataTooShortZipCode();
        //valid user data input methods  (too short zip code)
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
        createAccountPage.inputTooShortZipCode();
        //input valid login data
        createAccountPage.inputLoginUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Zip/postal code must be between 3 and 10 characters!", createAccountPage.getInvalidZipCodeMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too long zip code)
    protected void userAccountCreationTooLongZipCodeTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long zip code
        createAccountPage.getUserInputDataTooLongZipCode();
        //valid user data input methods  (too long zip code)
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
        createAccountPage.inputTooLongZipCode();
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
            logger.error("The user account got created with too long zip code");
        }else {
            assertEquals("Zip/postal code must be between 3 and 10 characters!", createAccountPage.getInvalidZipCodeMessage(), "The expected error didn't appear");
        }
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

    //invalid user account registration test method (too short username)
    protected void userAccountCreationTooShortUsernameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too short username
        createAccountPage.getUserInputDataTooShortUsername();
        //valid user data input methods  (too short login username)
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
        //input valid login data (too short login username)
        createAccountPage.inputTooShortUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Login name must be alphanumeric only and between 5 and 64 characters!", createAccountPage.getInvalidLoginUserNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too long username)
    protected void userAccountCreationTooLongUsernameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long username
        createAccountPage.getUserInputDataTooLongUsername();
        //valid user data input methods  (too long login username)
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
        //input valid login data (too long login username)
        createAccountPage.inputTooLongUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Login name must be alphanumeric only and between 5 and 64 characters!", createAccountPage.getInvalidLoginUserNameLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (existing username)
    protected void userAccountCreationExistingUsernameTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with existing username
        createAccountPage.getUserInputDataExistingUsername();
        //valid user data input methods  (existing login username)
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
        //input valid login data (existing login username)
        createAccountPage.inputExistingUsername();
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("This login name is not available. Try different login name!", createAccountPage.getExistingUsernameMessage(), "The expected error didn't appear");
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

    //invalid user account registration test method (too short user password)
    protected void userAccountCreationTooShortPasswordTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too short login password
        createAccountPage.getUserInputDataTooShortPassword();
        //valid user data input methods  (too short user password)
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
        //input valid login data (too short user password)
        createAccountPage.inputLoginUsername();
        createAccountPage.inputTooShortPassword();
        //click 'Agree to terms' checkbox
        createAccountPage.clickAgreeToTermsCheckbox();
        //click 'Continue' button
        createAccountPage.clickContinueButton();
        //assert the expected error message is displayed
        assertEquals("Password must be between 4 and 20 characters!", createAccountPage.getInvalidPasswordLengthMessage(), "The expected error didn't appear");
    }

    //invalid user account registration test method (too long user password)
    protected void userAccountCreationTooLongPasswordTest(CreateAccountPage createAccountPage){
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //login/register page web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //register button click method
        loginRegisterPage.clickRegisterButton();
        //create page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //assert the create account page title is as expected(whether the user got on the right page)
        assertEquals("CREATE ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title isn't as expected or user is on the wrong page");
        //valid user data getter - with too long login password
        createAccountPage.getUserInputDataTooLongPassword();
        //valid user data input methods  (too long user password)
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
        //input valid login data (too long user password)
        createAccountPage.inputLoginUsername();
        createAccountPage.inputTooLongPassword();
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

    //user account logout test method
    protected void userAccountLogOutTest(AccountPage accountPage){
        //click logout link
        accountPage.clickLogOutLink();
        //assert the user has logged out from the account
        assertEquals("ACCOUNT LOGOUT", accountPage.getAccountLogOutConfirmationMessage(), "The expected message confirmation isn't displayed");
        //click 'continue' button after logout confirmation
        accountPage.clickContinueAfterLogOutButton();
        HomePage homePage = new HomePage(driver);
        //assert the user got back onto homepage
        assertEquals("Login or register", homePage.getLoginRegisterLinkText(), "The expected text didn't match the output");
    }

    //valid user account login test method
    protected void validUserAccountLoginTest(CreateAccountPage createAccountPage){
        HomePage homePage = new HomePage(driver);
        //click login/register page header link
        homePage.clickLoginRegisterLink();
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //valid user input data getter
        loginRegisterPage.getValidUserLoginData(createAccountPage);
        //valid user input
        loginRegisterPage.inputUsername(createAccountPage.getUsername());
        logger.info("Username used for login: " + createAccountPage.getUsername());
        loginRegisterPage.inputPassword(createAccountPage.getPassword());
        logger.info("Password used for login: " + createAccountPage.getPassword());
        //click 'login' button
        loginRegisterPage.clickLoginButton();
        //assert that the user has logged in
        assertEquals(createAccountPage.getFirstName(), loginRegisterPage.getFirstNameFromDashboardText(), "The first names don't match expectations");
    }

    //invalid user account login test method - no username
    protected void invalidUserAccountLoginNoUsernameTest(CreateAccountPage createAccountPage){
        HomePage homePage = new HomePage(driver);
        //click login/register page header link
        homePage.clickLoginRegisterLink();
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //valid user input data getter
        loginRegisterPage.getInvalidUserLoginDataNoUsername(createAccountPage);
        //valid user input
        loginRegisterPage.inputNoUsername();
        loginRegisterPage.inputPassword(createAccountPage.getPassword());
        logger.info("Password used for login: " + createAccountPage.getPassword());
        //click 'login' button
        loginRegisterPage.clickLoginButton();
        //assert that expected error is displayed
        assertEquals("×\n" + "Error: Incorrect login or password provided.", loginRegisterPage.getIncorrectCredentialsErrorMessage(), "The credentials error don't match expectations");
    }

    //invalid user account login test method - no password
    protected void invalidUserAccountLoginNoPasswordTest(CreateAccountPage createAccountPage){
        HomePage homePage = new HomePage(driver);
        //click login/register page header link
        homePage.clickLoginRegisterLink();
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //valid user input data getter
        loginRegisterPage.getInvalidUserLoginDataNoPassword(createAccountPage);
        //valid user input
        loginRegisterPage.inputUsername(createAccountPage.getUsername());
        logger.info("Username used for login: " + createAccountPage.getUsername());
        loginRegisterPage.inputNoPassword();
        //click 'login' button
        loginRegisterPage.clickLoginButton();
        //assert that expected error is displayed
        assertEquals("×\n" + "Error: Incorrect login or password provided.", loginRegisterPage.getIncorrectCredentialsErrorMessage(), "The credentials error don't match expectations");
    }

    //invalid user account login test method - invalid username
    protected void invalidUserAccountLoginInvalidUsernameTest(CreateAccountPage createAccountPage){
        HomePage homePage = new HomePage(driver);
        //click login/register page header link
        homePage.clickLoginRegisterLink();
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //valid user input data getter
        loginRegisterPage.getInvalidUserLoginDataInvalidUsername(createAccountPage);
        //valid user input
        loginRegisterPage.inputInvalidUsername();
        loginRegisterPage.inputPassword(createAccountPage.getPassword());
        logger.info("Password used for login: " + createAccountPage.getPassword());
        //click 'login' button
        loginRegisterPage.clickLoginButton();
        //assert that expected error is displayed
        assertEquals("×\n" + "Error: Incorrect login or password provided.", loginRegisterPage.getIncorrectCredentialsErrorMessage(), "The credentials error don't match expectations");
    }

    //invalid user account login test method - invalid password
    protected void invalidUserAccountLoginInvalidPasswordTest(CreateAccountPage createAccountPage){
        HomePage homePage = new HomePage(driver);
        //click login/register page header link
        homePage.clickLoginRegisterLink();
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        //web element assert
        isLoginRegisterPageWebElementDisplayed(loginRegisterPage);
        //valid user input data getter
        loginRegisterPage.getInvalidUserLoginDataInvalidPassword(createAccountPage);
        //valid user input
        loginRegisterPage.inputUsername(createAccountPage.getUsername());
        logger.info("Username used for login: " + createAccountPage.getUsername());
        loginRegisterPage.inputInvalidPassword();
        //click 'login' button
        loginRegisterPage.clickLoginButton();
        //assert that expected error is displayed
        assertEquals("×\n" + "Error: Incorrect login or password provided.", loginRegisterPage.getIncorrectCredentialsErrorMessage(), "The credentials error don't match expectations");
    }

    //non-registered user test methods

    //homepage product test methods
    //featured 'add to cart' products test method
    protected void addFeaturedProductsToCartTest(HomePage homePage){
        //web element assert
        isHomePageWebElementDisplayed(homePage);
        //featured products logger
        logger.info("Featured product names in the list: " + "\n" + homePage.getFeaturedProductNames());
        //featured available product prices logger
        logger.info("Featured product prices in the list (product current price/old price(if present)) (if available): " + "\n" + homePage.getFeaturedProductPrice());
        //add available featured product to cart click
        homePage.clickAddFeaturedToCart1Button();
        homePage.clickAddFeaturedToCart2Button();
        homePage.clickAddFeaturedToCart3Button(); //drops to individual product page
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //product data logger
        logSingleProductData(singleProductPage);
        //click 'add to cart' button
        singleProductPage.clickAddToCartButton();
    }
    //latest 'add to cart' products test method
    protected void addLatestProductsToCartTest(HomePage homePage){
        //web element assert
        isHomePageWebElementDisplayed(homePage);
        //latest products logger
        logger.info("Latest product names in the list: " + "\n" + homePage.getLatestProductNames());
        //latest available product prices logger
        logger.info("Latest product prices in the list (product current price/old price(if present)) (if available): " + "\n" + homePage.getLatestProductPrice());
        //add available latest product to cart click
        homePage.clickAddLatestToCart1Button();
        homePage.clickAddLatestToCart2Button();
        //click 'shopping cart' page nav link
        homePage.clickCartNavLink();
    }
    //bestseller 'add to cart' products test method
    protected void addBestsellersProductsToCartTest(HomePage homePage){
        //web element assert
        isHomePageWebElementDisplayed(homePage);
        //bestseller products logger
        logger.info("Bestsellers product names in the list: " + "\n" + homePage.getBestsellersProductNames());
        //bestseller available product prices logger
        logger.info("Bestsellers product prices in the list (product current price/old price(if present)) (if available): " + "\n" + homePage.getBestsellersProductPrice());
        //add available bestsellers product to cart click
        homePage.clickAddBestsellerToCart1Button();
        homePage.clickAddBestsellerToCart4Button();
        homePage.clickAddBestsellerToCart2Button();// individual product page
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //product data logger
        logTShirtProductData(singleProductPage);
        //click 'add to cart' button
        singleProductPage.clickAddToCartButton();
    }
    //special 'add to cart' products test method
    protected void addSpecialProductsToCartTest(HomePage homePage){
        //web element assert
        isHomePageWebElementDisplayed(homePage);
        //special products logger
        logger.info("Special product names in the list: " + "\n" + homePage.getSpecialProductNames());
        //special available product prices logger
        logger.info("Special product prices in the list (product current price/old price(if present)) (if available): " + "\n" + homePage.getSpecialProductPrice());
        //add available special product to cart click
        homePage.clickAddSpecialToCartButton();
        //click 'shopping cart' page nav link
        homePage.clickCartNavLink();
    }

    //add products from shopping cart to checkout page test method
    protected void addSelectedProductsToCheckoutTest(ShoppingCartPage shoppingCartPage){
        //assert the user gets on shopping cart page
        assertEquals("SHOPPING CART", shoppingCartPage.getShoppingCartPageTitle(), "The shopping cart page title doesn't match expectations or user is on the wrong page");
        //web element assert
        isShoppingCartWebElementDisplayed(shoppingCartPage);
        //display added to cart product data
        logShoppingCartData(shoppingCartPage);
        //log the error if any of the product quantities is greater than 1 (by default it should be 1)
        shoppingCartPage.verifyProductQuantities();
        //click country dropdown menu
        shoppingCartPage.clickCountryDropDownMenu();
        //select US option
        shoppingCartPage.selectUSCountryOption();
        //click state dropdown menu
        shoppingCartPage.clickStateDropDownMenu();
        //select Illinois option
        shoppingCartPage.selectIllinoisOption();
        //input zip code
        shoppingCartPage.inputZipCode();
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //click guest checkbox to resume checkout
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(driver);
        loginRegisterPage.clickGuestCheckoutCheckbox();
        //click 'continue' button
        loginRegisterPage.clickContinueButton();
    }

    //valid guest account creation test method
    protected void validGuestAccountCreationTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter
        guestAccountPage.getValidGuestInputData();
        //guest account valid data input
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
    }
    //invalid guest account creation test method - no first name
    protected void invalidGuestCreationNoFirstNameTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (omit first name)
        guestAccountPage.getGuestInputDataNoFirstName();
        //guest account valid data input (without first name)
        guestAccountPage.inputNoFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("First Name must be greater than 3 and less than 32 characters!", guestAccountPage.getErrorFirstNameLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too short first name
    protected void invalidGuestCreationTooShortFirstNameTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too short first name)
        guestAccountPage.getGuestInputDataTooShortFirstName();
        //guest account valid data input (with too short first name)
        guestAccountPage.inputTooShortFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("First Name must be greater than 3 and less than 32 characters!", guestAccountPage.getErrorFirstNameLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too long first name
    protected void invalidGuestCreationTooLongFirstNameTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too long first name)
        guestAccountPage.getGuestInputDataTooLongFirstName();
        //guest account valid data input (with too long first name)
        guestAccountPage.inputTooLongFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("First Name must be greater than 3 and less than 32 characters!", guestAccountPage.getErrorFirstNameLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - no last name
    protected void invalidGuestCreationNoLastNameTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (omit last name)
        guestAccountPage.getGuestInputDataNoLastName();
        //guest account valid data input (without last name)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputNoLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Last Name must be greater than 3 and less than 32 characters!", guestAccountPage.getErrorLastNameLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too short last name
    protected void invalidGuestCreationTooShortLastNameTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too short last name)
        guestAccountPage.getGuestInputDataTooShortLastName();
        //guest account valid data input (with too short last name)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputTooShortLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Last Name must be greater than 3 and less than 32 characters!", guestAccountPage.getErrorLastNameLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too long last name
    protected void invalidGuestCreationTooLongLastNameTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too long last name)
        guestAccountPage.getGuestInputDataTooLongLastName();
        //guest account valid data input (with too long last name)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputTooLongLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Last Name must be greater than 3 and less than 32 characters!", guestAccountPage.getErrorLastNameLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - no email address
    protected void invalidGuestCreationNoEmailTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (omit email address)
        guestAccountPage.getGuestInputDataNoEmail();
        //guest account valid data input (without email address)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputNoEmail();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //log the issue if the checkout process isn't aborted
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        if(checkoutPage.getCheckoutPageTitle().equals("CHECKOUT CONFIRMATION")){
            logger.error("The guest can complete checkout with preexisting email in the database");
        }else {
            assertEquals("E-Mail Address does not appear to be valid!", guestAccountPage.getEmailErrorMessage(), "The expected error message did not appear");
        }
    }

    //invalid guest account creation test method - invalid email address format
    protected void invalidGuestCreationInvalidEmailFormatTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (invalid email address format)
        guestAccountPage.getGuestInputDataInvalidEmailFormat();
        //guest account valid data input (with invalid email address format)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputInvalidEmailFormat();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //log the issue if the checkout process isn't aborted
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        if(checkoutPage.getCheckoutPageTitle().equals("CHECKOUT CONFIRMATION")){
            logger.error("The guest can complete checkout with preexisting email in the database");
        }else {
            assertEquals("E-Mail Address does not appear to be valid!", guestAccountPage.getEmailErrorMessage(), "The expected error message did not appear");
        }
    }

    //invalid guest account creation test method - existing email address
    protected void invalidGuestCreationExistingEmailTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (existing email address)
        guestAccountPage.getGuestInputDataExistingEmail();
        //guest account valid data input (with existing email address)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputExistingEmail();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //log the issue if the checkout process isn't aborted
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        if(checkoutPage.getCheckoutPageTitle().equals("CHECKOUT CONFIRMATION")){
            logger.error("The guest can complete checkout with preexisting email in the database");
        }else {
            assertEquals("E-Mail Address does not appear to be valid!", guestAccountPage.getEmailErrorMessage(), "The expected error message did not appear");
        }

    }

    //invalid guest account creation test method - no address1
    protected void invalidGuestCreationNoAddress1Test(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (omit address1)
        guestAccountPage.getGuestInputDataNoAddress1();
        //guest account valid data input (without guest address)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputNoAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Address 1 must be greater than 3 and less than 128 characters!", guestAccountPage.getAddress1ErrorMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too short address1
    protected void invalidGuestCreationTooShortAddress1Test(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too short address1)
        guestAccountPage.getGuestInputDataTooShortAddress1();
        //guest account valid data input (with too short guest address)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputTooShortAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Address 1 must be greater than 3 and less than 128 characters!", guestAccountPage.getAddress1ErrorMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too long address1
    protected void invalidGuestCreationTooLongAddress1Test(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too long address1)
        guestAccountPage.getGuestInputDataTooLongAddress1();
        //guest account valid data input (with too long guest address)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputTooLongAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Address 1 must be greater than 3 and less than 128 characters!", guestAccountPage.getAddress1ErrorMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - no guest city
    protected void invalidGuestCreationNoCityTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (omit city)
        guestAccountPage.getGuestInputDataNoCity();
        //guest account valid data input (without guest city)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputNoCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("City must be greater than 3 and less than 128 characters!", guestAccountPage.getCityErrorMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too short guest city
    protected void invalidGuestCreationTooShortCityTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too short guest city)
        guestAccountPage.getGuestInputDataTooShortCity();
        //guest account valid data input (too short guest city)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputTooShortCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("City must be greater than 3 and less than 128 characters!", guestAccountPage.getCityErrorMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too long guest city
    protected void invalidGuestCreationTooLongCityTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too long guest city)
        guestAccountPage.getGuestInputDataTooLongCity();
        //guest account valid data input (too long guest city)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputTooLongCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("City must be greater than 3 and less than 128 characters!", guestAccountPage.getCityErrorMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - no zip code
    protected void invalidGuestCreationNoZipCodeTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (omit zip code)
        guestAccountPage.getValidGuestInputDataNoZipCode();
        //guest account valid data input (without zip code)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Zip/postal code must be between 3 and 10 characters!", guestAccountPage.getZipCodeErrorLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too short zip code
    protected void invalidGuestCreationTooShortZipCodeTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too short zip code)
        guestAccountPage.getValidGuestInputDataTooShortZipCode();
        //guest account valid data input (with too short zip code)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputTooShortZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Zip/postal code must be between 3 and 10 characters!", guestAccountPage.getZipCodeErrorLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - too long zip code
    protected void invalidGuestCreationTooLongZipCodeTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter (too long zip code)
        guestAccountPage.getValidGuestInputDataTooLongZipCode();
        //guest account valid data input (with too long zip code)
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select United States
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select Illinois option
        guestAccountPage.selectIllinoisOption();
        guestAccountPage.inputTooLongZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Zip/postal code must be between 3 and 10 characters!", guestAccountPage.getZipCodeErrorLengthMessage(), "The expected error message did not appear");
    }

    //invalid guest account creation test method - no country selection
    protected void invalidGuestCreationNoCountryTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter
        guestAccountPage.getValidGuestInputData();
        //guest account valid data input
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select 'Please select' (since default is UK)
        guestAccountPage.selectPleaseSelectOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        if(guestAccountPage.isPleaseSelectOptionDisplayed()) {
            assertEquals("Please select a country!", guestAccountPage.getCountryErrorMessage(), "The expected error message did not appear");
        }else{
            logger.error("The expected error message did not appear");
        }
    }

    //invalid guest account creation test method - no state selection
    protected void invalidGuestCreationNoStateTest(GuestAccountPage guestAccountPage){
        //assert the user is on guest account page
        assertEquals("GUEST CHECKOUT - STEP 1", guestAccountPage.getGuestAccountPageTitle(), "The guest account page title doesn't match expectation or user is on the wrong page");
        //product summary data logger
        logGuestAccountProductData(guestAccountPage);
        //web element assert
        isGuestAccountPageWebElementDisplayed(guestAccountPage);
        //valid guest account input data getter
        guestAccountPage.getValidGuestInputData();
        //guest account valid data input
        guestAccountPage.inputFirstName();
        guestAccountPage.inputLastName();
        guestAccountPage.inputEmailAddress();
        guestAccountPage.inputAddress1();
        guestAccountPage.inputCity();
        //click country dropdown menu
        guestAccountPage.clickCountryDropdownMenu();
        //select 'United States'
        guestAccountPage.selectUSOption();
        //click state dropdown menu
        guestAccountPage.clickStateDropdownMenu();
        //select 'Please select' option
        guestAccountPage.selectPleaseSelectStateOption();
        guestAccountPage.inputZipCode();
        //click 'continue' button
        guestAccountPage.clickContinueButton();
        //assert the expected error appears
        assertEquals("Please select a region / state!", guestAccountPage.getStateErrorMessage(), "The expected error message did not appear");
    }

    //checkout (confirmation) page test method
    protected void productCheckoutConfirmationTest(CheckoutPage checkoutPage){
        //web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //log displayed product data
        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmCheckoutButton();
        //assert the checkout has been confirmed
        assertEquals("CHECKOUT CONFIRMATION", checkoutPage.getCheckoutSuccessMessage(), "The checkout confirmation message isn't displayed or the checkout hasn't been confirmed"); //different than 'YOUR ORDER HAS BEEN PROCESSED!' is being found by the CORRECT locator
        //click invoice page for confirmation
        checkoutPage.clickInvoicePageLink();
    }

    //single product data loggers
    protected void logAsideProductData(SingleProductPage singleProductPage){
        System.out.println("Aside product list data: " + "\n");
        logger.info("Aside product list displayed data: " + singleProductPage.getAsideProductData() + "\n");
    }
    protected void logSingleProductData(SingleProductPage singleProductPage){
        System.out.println("Product displayed in single product page data: " + "\n");
        logger.info("Product images link list: " + singleProductPage.getProductImagesList()); // displays as null even though innerText has the links present
        logger.info("Main product image link: " + singleProductPage.getMainProductImage()); // displays as null even though innerText has the links present
        logger.info("Product name: " + singleProductPage.getProductName());
        logger.info("Product price: " + singleProductPage.getProductPrice());
        logger.info("Product quantity: " + singleProductPage.getProductQuantity());
        logger.info("Product total price: " + singleProductPage.getProductTotalPrice());
        logger.info("Product description: " + singleProductPage.getProductDescription());
        logger.info("Product model: " + singleProductPage.getProductModel());
        logger.info("Product manufacturer: " + singleProductPage.getProductManufacturer()); // displays as null even though innerText has the links present
    }
    //for t-shirt product page
    protected void logTShirtProductData(SingleProductPage singleProductPage){
        System.out.println("Product displayed in single product page data: " + "\n");
        logger.info("Product images link list: " + singleProductPage.getProductImagesList()); // displays as null even though innerText has the links present
        logger.info("Main product image link: " + singleProductPage.getMainProductImage()); // displays as null even though innerText has the links present
        logger.info("Product name: " + singleProductPage.getProductName());
        logger.info("Product price: " + singleProductPage.getProductPrice());
        logger.info("Product quantity: " + singleProductPage.getProductQuantity());
        logger.info("Product total price: " + singleProductPage.getProductTotalPrice());
        logger.info("Product description: " + singleProductPage.getTShirtProductDescription());
    }
    //shopping cart page data logger
    protected void logShoppingCartData(ShoppingCartPage shoppingCartPage){
        System.out.println("Added products displayed in the shopping cart page: " + "\n");
        logger.info("Shopping cart product name(s): " + shoppingCartPage.getShoppingCartProductName());
        logger.info("Shopping cart product model(s): " + shoppingCartPage.getShoppingCartProductModel());
        logger.info("Shopping cart product unit price(s): " + shoppingCartPage.getShoppingCartProductUnitPrice());
        logger.info("Shopping cart product quantity(ies): " + shoppingCartPage.getShoppingCartProductQuantity());
        logger.info("Shopping cart product total price(s): " + shoppingCartPage.getShoppingCartProductTotalPrice());
        logger.info("Shopping cart all products sub total price: " + shoppingCartPage.getShoppingCartAllProductsSubTotalPrice());
        logger.info("Shopping cart all products flat shipping rate: " + shoppingCartPage.getShoppingCartAllProductsFlatShippingRate());
        logger.info("Shopping cart all products total price: " + shoppingCartPage.getShoppingCartAllProductsTotalPrice());
    }
    //guest account product data logger
    protected void logGuestAccountProductData(GuestAccountPage guestAccountPage){
        System.out.println("Added product summary data: " + "\n");
        logger.info("Product name(s): " + guestAccountPage.getSummaryProductName());
        logger.info("Product unit price(s): " + guestAccountPage.getSummaryProductUnitPrice());
        logger.info("Product sub total price: " + guestAccountPage.getSummaryProductSubTotalPrice());
        if(guestAccountPage.isProductSummarySpecialRetailPriceDisplayed()){
            logger.info("Product retail price: " + guestAccountPage.getSummarySpecialRetailPrice());
        }
        if(guestAccountPage.isProductSummarySpecialTotalPriceDisplayed()){
            logger.info("Product total price(with retail): " + guestAccountPage.getSummarySpecialTotalPrice());
        }else{
            logger.info("Product total price: " + guestAccountPage.getSummaryProductTotalPrice());
        }
    }
    //checkout page product data logger
    protected void logCheckoutProductData(CheckoutPage checkoutPage){
        System.out.println("Checkout page displayed product data: " + "\n");
        logger.info("Product summary name: " + checkoutPage.getProductSummaryName());
        logger.info("Product summary price: " + checkoutPage.getProductSummaryPrice());
        logger.info("Product summary sub total price: " + checkoutPage.getProductSummarySubTotalPrice());
        logger.info("Product summary flat shipping rate: " + checkoutPage.getProductSummaryFlatShippingRate());
        if(checkoutPage.isProductSummaryRetailPriceDisplayed()){
            logger.info("Product retail price: " + checkoutPage.getProductSummaryRetailPrice());
            logger.info("Product total price with retail: " + checkoutPage.getProductSummaryTotalPriceWithRetail());
        }else {
            logger.info("Product summary total price: " + checkoutPage.getProductSummaryTotalPrice());
        }
        logger.info("Client shipping name: " + checkoutPage.getClientShippingName());
        logger.info("Client shipping address: " + checkoutPage.getClientShippingAddress());
        logger.info("Client shipping payment method: " + checkoutPage.getClientShippingPaymentMethod());
        logger.info("Checkout product name: " + checkoutPage.getProductName());
        logger.info("Checkout product unit price: " + checkoutPage.getProductUnitPrice());
        logger.info("Checkout product quantity: " + checkoutPage.getProductQuantity());
        //verify product quantity is indeed one (no addition was performed beforehand)
        checkoutPage.verifyProductQuantities();
        logger.info("Checkout product price: " + checkoutPage.getProductPrice());
        logger.info("Checkout product sub total price: " + checkoutPage.getProductSubTotalPrice());
        logger.info("Checkout product flat shipping rate: " + checkoutPage.getProductFlatShippingRate());
        if(checkoutPage.isProductRetailPriceDisplayed()){
            logger.info("Checkout product retail price: " + checkoutPage.getProductRetailPrice());
            logger.info("Checkout product total price with retail: " + checkoutPage.getProductTotalPriceWithRetail());
        }else{
            logger.info("Checkout product total price: " + checkoutPage.getProductTotalPrice());
        }
    }

    //web page element assert methods
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
        //assert featured products section is displayed
        assertTrue(homePage.isFeaturedProductNameDisplayed(), "The featured products section is not displayed");
        //assert featured available products price section is displayed
        assertTrue(homePage.isFeaturedAvailableProductsPriceDisplayed(), "The featured available products price section is not displayed");
        //assert featured available products 'add to cart' button is displayed (block)
        assertTrue(homePage.isFeaturedAvailableProductsAddToCartButtonDisplayed(), "The featured available products 'add to cart' button is not displayed");
        //assert latest products section is displayed
        assertTrue(homePage.isLatestProductNameDisplayed(), "The latest products section is not displayed");
        //assert latest available products price section is displayed
        assertTrue(homePage.isLatestAvailableProductsPriceDisplayed(), "The latest available products price section is not displayed");
        //assert latest available products 'add to cart' button is displayed (block)
        assertTrue(homePage.isLatestAvailableProductsAddToCartButtonDisplayed(), "The latest available products 'add to cart' button is not displayed");
        //assert bestsellers products section is displayed
        assertTrue(homePage.isBestsellersProductNameDisplayed(), "The bestsellers products section is not displayed");
        //assert bestsellers available products price section is displayed
        assertTrue(homePage.isBestsellersAvailableProductsPriceDisplayed(), "The bestsellers available products price section is not displayed");
        //assert bestsellers available products 'add to cart' button is displayed (block)
        assertTrue(homePage.isBestsellersAvailableProductsAddToCartButtonDisplayed(), "The bestsellers available products 'add to cart' button is not displayed");
        //assert specials products section is displayed
        assertTrue(homePage.isSpecialsProductNameDisplayed(), "The specials products section is not displayed");
        //assert specials available products price section is displayed
        assertTrue(homePage.isSpecialsAvailableProductsPriceDisplayed(), "The specials available products price section is not displayed");
        //assert specials available products 'add to cart' button is displayed (block)
        assertTrue(homePage.isSpecialsAvailableProductsAddToCartButtonDisplayed(), "The specials available products 'add to cart' button is not displayed");
        //assert brand scrolling products scroll list is displayed
        assertTrue(homePage.isBrandScrollingProductsDisplayed(), "The brand scrolling products scroll list is not displayed");
    }

    //login/register page web element assert
    protected void isLoginRegisterPageWebElementDisplayed(LoginRegisterPage loginRegisterPage){
        //assert the login/register login section title is displayed
        assertTrue(loginRegisterPage.isAccountLoginPageTitleDisplayed(), "The account login page title is not displayed");
        //assert the register button is displayed
        assertTrue(loginRegisterPage.isRegisterButtonDisplayed(), "The register button is not displayed");
        //assert the username input field is displayed
        assertTrue(loginRegisterPage.isUsernameInputFieldDisplayed(), "The username input field is not displayed");
        //assert the password input field is displayed
        assertTrue(loginRegisterPage.isPasswordInputFieldDisplayed(), "The password input field is not displayed");
        //assert login button is displayed
        assertTrue(loginRegisterPage.isLoginButtonDisplayed(), "The login button is not displayed");
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

    //user account page web element assert
    protected void isUserAccountPageWebElementDisplayed(AccountPage accountPage){
        //assert account hover dropdown menu is displayed
        assertTrue(accountPage.isAccountDashboardHoverMenuDisplayed(), "The account dashboard hover menu isn't displayed");
        //assert logout link is displayed
        assertTrue(accountPage.isLogOutLinkDisplayed(), "The log out link isn't displayed");
    }

    //single product page web element assert
    protected void isSingleProductPageWebElementDisplayed(SingleProductPage singleProductPage){
        //assert aside product list section is displayed
        assertTrue(singleProductPage.isAsideProductDataDisplayed(), "The aside product list isn't displayed");
        //images are commented out since they throw StaleElementReferenceException even though they're consistently present
//        //assert product images list is displayed
//        assertTrue(singleProductPage.isProductImagesListDisplayed(), "The product images list isn't displayed");
//        //assert main product image is displayed
//        assertTrue(singleProductPage.isMainProductImageDisplayed(), "The main product image isn't displayed");
        //assert product name is displayed
        assertTrue(singleProductPage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert product price is displayed
        assertTrue(singleProductPage.isProductPriceDisplayed(), "The product price isn't displayed");
        //assert product quantity input field is displayed
        assertTrue(singleProductPage.isProductQuantityInputFieldDisplayed(), "The product quantity input field isn't displayed");
        //assert product total price is displayed
        assertTrue(singleProductPage.isProductTotalPriceDisplayed(), "The product total price isn't displayed");
        //assert 'add to cart' button isn't displayed
        assertTrue(singleProductPage.isAddToCartButtonDisplayed(), "The 'add to cart' button isn't displayed");
        //assert product print link is displayed
        assertTrue(singleProductPage.isPrintLinkDisplayed(), "The product print link isn't displayed");
//        //assert 'add to wishlist' link is displayed //sometimes it's not displayed
//        assertTrue(singleProductPage.isAddToWishlistLinkDisplayed(), "The 'add to wishlist' link isn't displayed");
        //assert product description list section tab is displayed
        assertTrue(singleProductPage.isDescriptionListSectionDisplayed(), "The description list section tab isn't displayed");
        //assert product review list section tab is displayed
        assertTrue(singleProductPage.isReviewsListSectionDisplayed(), "The review list section tab isn't displayed");
        //assert product description is displayed
        assertTrue(singleProductPage.isProductDescriptionDisplayed(), "The product description isn't displayed");
        //assert product model is displayed
        assertTrue(singleProductPage.isProductModelDisplayed(), "The product model isn't displayed");
        //assert product manufacturer is displayed
        assertTrue(singleProductPage.isProductManufacturerDisplayed(), "The product manufacturer isn't displayed");
    }

    //shopping cart page web element assert
    protected void isShoppingCartWebElementDisplayed(ShoppingCartPage shoppingCartPage){
        //assert shopping cart page title is displayed
        assertTrue(shoppingCartPage.isShoppingCartTitleDisplayed(), "The shopping cart page title isn't displayed");
        //assert product image is displayed
        assertTrue(shoppingCartPage.isCartProductImageDisplayed(), "The shopping cart product image isn't displayed");
        //assert product name is displayed
        assertTrue(shoppingCartPage.isCartProductNameDisplayed(), "The shopping cart product name isn't displayed");
        //assert product model is displayed
        assertTrue(shoppingCartPage.isCartProductModelDisplayed(), "The shopping cart product model isn't displayed");
        //assert product unit price is displayed
        assertTrue(shoppingCartPage.isCartProductUnitPriceDisplayed(), "The shopping cart product unit price isn't displayed");
        //assert product quantity input field is displayed
        assertTrue(shoppingCartPage.isCartProductQuantityInputFieldDisplayed(), "The shopping cart product quantity input field isn't displayed");
        //assert product total price is displayed
        assertTrue(shoppingCartPage.isCartProductTotalPriceDisplayed(), "The shopping cart product total price isn't displayed");
        //assert product remove button is displayed
        assertTrue(shoppingCartPage.isCartProductRemoveButtonDisplayed(), "The shopping cart product remove button isn't displayed");
        //assert product update data is displayed
        assertTrue(shoppingCartPage.isUpdateButtonDisplayed(), "The shopping cart update data button isn't displayed");
        //assert product checkout button is displayed
        assertTrue(shoppingCartPage.isCheckoutButtonDisplayed(), "The shopping cart checkout button isn't displayed");
        //assert product coupon code input field is displayed
        assertTrue(shoppingCartPage.isCouponCodeInputFieldDisplayed(), "The shopping cart coupon code input field isn't displayed");
        //assert product 'apply coupon' button is displayed
        assertTrue(shoppingCartPage.isApplyCouponButtonDisplayed(), "The shopping cart 'apply coupon' button isn't displayed");
        //assert product country dropdown menu is displayed
        assertTrue(shoppingCartPage.isCountryDropdownMenuDisplayed(), "The shopping cart country dropdown menu isn't displayed");
        //assert product state dropdown menu is displayed
        assertTrue(shoppingCartPage.isStateDropdownMenuDisplayed(), "The shopping cart state dropdown menu isn't displayed");
        //assert product zip code input field is displayed
        assertTrue(shoppingCartPage.isZipCodeInputFieldDisplayed(), "The shopping cart zip code input field isn't displayed");
        //assert product zip code 'estimate' button is displayed
        assertTrue(shoppingCartPage.isZipCodeEstimateOptionDisplayed(), "The shopping cart 'estimate' button isn't displayed");
        //assert product shipping rate dropdown menu is displayed
        assertTrue(shoppingCartPage.isShippingRateDropdownMenuDisplayed(), "The shopping cart shipping rate dropdown menu isn't displayed");
        //assert all product sub total price is displayed
        assertTrue(shoppingCartPage.isSubTotalPriceDisplayed(), "The shopping cart all products sub price isn't displayed");
        //assert all product flat shipping rate is displayed
        assertTrue(shoppingCartPage.isFlatShippingRateDisplayed(), "The shopping cart all products flat shipping rate isn't displayed");
        //assert all product total price is displayed
        assertTrue(shoppingCartPage.isTotalPriceDisplayed(), "The shopping cart all products total price isn't displayed");
        //assert 'continue shopping' button is displayed
        assertTrue(shoppingCartPage.isContinueShoppingButtonDisplayed(), "The shopping cart 'continue shopping' button isn't displayed");
        //assert lower continue button is displayed
        assertTrue(shoppingCartPage.isLowerContinueButtonDisplayed(), "The shopping cart lower continue button isn't displayed");
    }

    //guest account page web element assert
    protected void isGuestAccountPageWebElementDisplayed(GuestAccountPage guestAccountPage){
        //assert guest account page title is displayed
        assertTrue(guestAccountPage.isGuestAccountPageTitleDisplayed(), "The guest account page title isn't displayed");
        //assert product name in summary is displayed
        assertTrue(guestAccountPage.isProductNameDisplayed(), "The product name in summary isn't displayed");
        //assert product summary unit price is displayed
        assertTrue(guestAccountPage.isProductSummaryUnitPriceDisplayed(), "The product unit price in summary isn't displayed");
        //assert product summary sub total price is displayed
        assertTrue(guestAccountPage.isProductSummarySubTotalPriceDisplayed(), "The product sub total price summary isn't displayed");
        //assert product summary total price is displayed
        assertTrue(guestAccountPage.isProductSummaryTotalPriceDisplayed(), "The product total price summary isn't displayed");
        //assert guest first name input field is displayed
        assertTrue(guestAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert guest last name input field is displayed
        assertTrue(guestAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert guest email input field is displayed
        assertTrue(guestAccountPage.isEmailAddressInputFieldDisplayed(), "The email input field isn't displayed");
        //assert guest phone number input field is displayed
        assertTrue(guestAccountPage.isPhoneNumberInputFieldDisplayed(), "The phone number input field isn't displayed");
        //assert guest fax input field is displayed
        assertTrue(guestAccountPage.isFaxInputFieldDisplayed(), "The fax input field isn't displayed");
        //assert guest company input field is displayed
        assertTrue(guestAccountPage.isCompanyInputFieldDisplayed(), "The company input field isn't displayed");
        //assert guest address1 input field is displayed
        assertTrue(guestAccountPage.isAddress1InputFieldDisplayed(), "The address1 input field isn't displayed");
        //assert guest address2 input field is displayed
        assertTrue(guestAccountPage.isAddress2InputFieldDisplayed(), "The address2 input field isn't displayed");
        //assert guest city input field is displayed
        assertTrue(guestAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        //assert guest state dropdown menu is displayed
        assertTrue(guestAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        //assert guest country dropdown menu is displayed
        assertTrue(guestAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        //assert guest zipcode input field is displayed
        assertTrue(guestAccountPage.isZipCodeInputFieldDisplayed(), "The zipcode input field isn't displayed");
        //assert guest separate shipping address checkbox is displayed
        assertTrue(guestAccountPage.isSeparateShippingAddressCheckboxDisplayed(), "The separate shipping address checkbox isn't displayed");
        //assert guest account back button is displayed
        assertTrue(guestAccountPage.isBackButtonDisplayed(), "The back button isn't displayed");
        //assert guest account continue button is displayed
        assertTrue(guestAccountPage.isContinueButtonDisplayed(), "The continue button isn't displayed");
    }

    //checkout page web element assert
    protected void isCheckoutPageWebElementDisplayed(CheckoutPage checkoutPage){
        //assert the checkout page title is displayed
        assertTrue(checkoutPage.isCheckoutPageTitleDisplayed(), "The checkout page title isn't displayed");
        //assert product summary name is displayed (as a list)
        assertTrue(checkoutPage.isProductSummaryNameDisplayed(), "The product summary name isn't displayed");
        //assert product summary price is displayed (as a list)
        assertTrue(checkoutPage.isProductSummaryPriceDisplayed(), "The product summary price isn't displayed");
        //assert product summary sub total price is displayed
        assertTrue(checkoutPage.isProductSummarySubTotalPriceDisplayed(), "The product summary sub total price isn't displayed");
        //assert product summary flat shipping price is displayed
        assertTrue(checkoutPage.isProductSummaryFlatShippingRateDisplayed(), "The product summary flat shipping rate isn't displayed");
        //assert product summary total price is displayed
        assertTrue(checkoutPage.isProductSummaryTotalPriceDisplayed(), "The product summary total price isn't displayed");
        //assert client shipping name is displayed
        assertTrue(checkoutPage.isClientShippingNameDisplayed(), "The client shipping name isn't displayed");
        //assert client shipping address is displayed
        assertTrue(checkoutPage.isClientShippingAddressDisplayed(), "The client shipping address isn't displayed");
        //assert client shipping payment method is displayed
        assertTrue(checkoutPage.isClientShippingPaymentMethodDisplayed(), "The client shipping payment method isn't displayed");
        //assert client shipping edit button is displayed
        assertTrue(checkoutPage.isClientShippingEditButtonDisplayed(), "The client shipping edit button isn't displayed");
        //assert client payment name is displayed
        assertTrue(checkoutPage.isClientPaymentNameDisplayed(), "The client payment name isn't displayed");
        //assert client payment address is displayed
        assertTrue(checkoutPage.isClientPaymentAddressDisplayed(), "The client payment address isn't displayed");
        //assert client payment method is displayed
        assertTrue(checkoutPage.isClientPaymentMethodDisplayed(), "The client payment method isn't displayed");
        //assert client payment edit payment button is displayed
        assertTrue(checkoutPage.isClientPaymentEditPaymentButtonDisplayed(), "The client payment edit payment button isn't displayed");
        //assert client payment edit coupon button is displayed
        assertTrue(checkoutPage.isClientPaymentEditCouponButtonDisplayed(), "The client payment edit coupon button isn't displayed");
        //assert client payment edit cart button is displayed
        assertTrue(checkoutPage.isClientPaymentEditCartButtonDisplayed(), "The client payment edit cart button isn't displayed");
        //assert product image is displayed (as a list)
        assertTrue(checkoutPage.isProductImageDisplayed(), "The product image isn't displayed");
        //assert product name is displayed (as a list)
        assertTrue(checkoutPage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert product unit price is displayed (as a list)
        assertTrue(checkoutPage.isProductUnitPriceDisplayed(), "The product unit price isn't displayed");
        //assert product unit quantity is displayed (as a list)
        assertTrue(checkoutPage.isProductQuantityDisplayed(), "The product quantity isn't displayed");
        //assert product total price is displayed (as a list)
        assertTrue(checkoutPage.isProductTotalPriceDisplayed(), "The product total price isn't displayed");
        //assert product sub total price is displayed
        assertTrue(checkoutPage.isProductSubTotalPriceDisplayed(), "The product sub total price isn't displayed");
        //assert product flat shipping rate is displayed
        assertTrue(checkoutPage.isProductFlatShippingRateDisplayed(), "The product flat shipping rate isn't displayed");
        //assert product confirm total price is displayed
        assertTrue(checkoutPage.isProductConfirmTotalPriceDisplayed(), "The product confirm total price isn't displayed");
        //assert checkout page back button is displayed
        assertTrue(checkoutPage.isBackButtonDisplayed(), "The back button isn't displayed");
        //assert checkout page confirm button is displayed
        assertTrue(checkoutPage.isConfirmButtonDisplayed(), "The confirm button isn't displayed");
    }

}

package com.automationteststore;

import org.junit.jupiter.api.*;

public class CreateAccountPageTest extends TestMethods{

    // Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation")
    @Tag("Valid_User_Account_Creation")
    void validAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
    }

    // Test 002a -> invalid user account creation test (no first name)
    @Test
    @DisplayName("Invalid User Account Creation - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoFirstNameTest(createAccountPage);
    }

    // Test 002b -> invalid user account creation test (no last name)
    @Test
    @DisplayName("Invalid User Account Creation - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoLastNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoLastNameTest(createAccountPage);
    }

    // Test 002c -> invalid user account creation test (no email address)
    @Test
    @DisplayName("Invalid User Account Creation - No Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoEmailAddressTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoEmailTest(createAccountPage);
    }

    // Test 002d -> invalid user account creation test (no user address)
    @Test
    @DisplayName("Invalid User Account Creation - No User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserAddressTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoAddress1Test(createAccountPage);
    }

    // Test 002e -> invalid user account creation test (no user city)
    @Test
    @DisplayName("Invalid User Account Creation - No User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserCityTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoCityTest(createAccountPage);
    }

    // Test 002f -> invalid user account creation test (no user state selection)
    @Test
    @DisplayName("Invalid User Account Creation - No User State")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserStateTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoStateTest(createAccountPage);
    }

    // Test 002g -> invalid user account creation test (no user country selection)
    @Test
    @DisplayName("Invalid User Account Creation - No User Country")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserCountryTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoCountryTest(createAccountPage);
    }

    // Test 002h -> invalid user account creation test (no login username)
    @Test
    @DisplayName("Invalid User Account Creation - No Username")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoUsernameTest(createAccountPage);
    }

    // Test 002i -> invalid user account creation test (no user password)
    @Test
    @DisplayName("Invalid User Account Creation - No Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoPasswordTest(createAccountPage);
    }

    // Test 002j -> invalid user account creation test (no confirm password)
    @Test
    @DisplayName("Invalid User Account Creation - No Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoConfirmPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoConfirmPasswordTest(createAccountPage);
    }

    // Test 002k -> invalid user account creation test (no 'Agree to terms' checkbox click)
    @Test
    @DisplayName("Invalid User Account Creation - No 'Agree To Terms'")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoAgreeToTermsTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoAgreeToTermsTest(createAccountPage);
    }

    // Test 002m -> invalid user account creation test (too long first name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongFirstNameTest(createAccountPage);
    }

    // Test 002n -> invalid user account creation test (too long last name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongLastNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongLastNameTest(createAccountPage);
    }

    // Test 002o -> invalid user account creation test (invalid email address format)
    @Test
    @DisplayName("Invalid User Account Creation - Invalid Email Address Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void accountCreationInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationInvalidEmailFormatTest(createAccountPage);
    }

    // Test 002p -> invalid user account creation test (too short email address) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortEmailTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortEmailTest(createAccountPage);
    }

    // Test 002q -> invalid user account creation test (too long email address)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongEmailTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongEmailTest(createAccountPage);
    }
}

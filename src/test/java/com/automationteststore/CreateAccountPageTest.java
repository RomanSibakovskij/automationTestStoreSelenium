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
}

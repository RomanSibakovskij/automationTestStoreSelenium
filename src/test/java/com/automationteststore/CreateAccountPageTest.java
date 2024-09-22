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

    // Test 002a -> invalid user account creation test
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
}

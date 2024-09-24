package com.automationteststore;

import org.junit.jupiter.api.*;

public class LoginTest extends TestMethods{

    //Test 003 -> valid user account logout test
    @Test
    @DisplayName("Valid User Account Logout")
    @Tag("User_Account_Logout")
    void userAccountLogOutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        AccountPage accountPage = new AccountPage(driver);
        userAccountLogOutTest(accountPage);
    }

    //Test 004 -> valid user account login test
    @Test
    @DisplayName("Valid User Account Login")
    @Tag("Valid_User_Account_Login")
    void userAccountLogInTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        AccountPage accountPage = new AccountPage(driver);
        userAccountLogOutTest(accountPage);
        validUserAccountLoginTest(createAccountPage);
    }

    //Test 004a -> invalid user account login test -> no username
    @Test
    @DisplayName("Invalid User Account Login - No Username")
    @Tag("Invalid_User_Account_Login")
    @Tag("No_Singular_Login_Input")
    void userAccountLogInNoUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        AccountPage accountPage = new AccountPage(driver);
        userAccountLogOutTest(accountPage);
        invalidUserAccountLoginNoUsernameTest(createAccountPage);
    }

    //Test 004b -> invalid user account login test -> no password
    @Test
    @DisplayName("Invalid User Account Login - No Password")
    @Tag("Invalid_User_Account_Login")
    @Tag("No_Singular_Login_Input")
    void userAccountLogInNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        AccountPage accountPage = new AccountPage(driver);
        userAccountLogOutTest(accountPage);
        invalidUserAccountLoginNoPasswordTest(createAccountPage);
    }

    //Test 004c -> invalid user account login test -> invalid username
    @Test
    @DisplayName("Invalid User Account Login - Invalid Username")
    @Tag("Invalid_User_Account_Login")
    @Tag("Invalid_Singular_Login_Input")
    void userAccountLogInInvalidUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        AccountPage accountPage = new AccountPage(driver);
        userAccountLogOutTest(accountPage);
        invalidUserAccountLoginInvalidUsernameTest(createAccountPage);
    }

    //Test 004d -> invalid user account login test -> invalid password
    @Test
    @DisplayName("Invalid User Account Login - Invalid Password")
    @Tag("Invalid_User_Account_Login")
    @Tag("Invalid_Singular_Login_Input")
    void userAccountLogInInvalidPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        AccountPage accountPage = new AccountPage(driver);
        userAccountLogOutTest(accountPage);
        invalidUserAccountLoginInvalidPasswordTest(createAccountPage);
    }
}

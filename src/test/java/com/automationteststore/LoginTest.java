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
}

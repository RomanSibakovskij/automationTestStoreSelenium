package com.automationteststore;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    // Test 001 -> user navigation to login/register page test
    @Test
    @DisplayName("Navigate To Login/Register Page")
    @Tag("Go_To_Login_Register_Page")
    void navigateToLoginRegisterPage(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
    }
}

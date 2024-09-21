package com.automationteststore;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    @Test
    @DisplayName("Navigate To Login/Register Page")
    @Tag("Go_To_Login_Register_Page")
    void navigateToLoginRegisterPage(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPage(homePage);
    }
}

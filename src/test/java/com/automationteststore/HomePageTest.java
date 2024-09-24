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

    // Test 005 -> add featured products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Featured Products To Cart As A Non-Registered User")
    @Tag("Add_Featured_Products_To_Cart")
    void addFeaturedProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addFeaturedProductsToCartTest(homePage);
    }

    // Test 005a -> add latest products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Latest Products To Cart As A Non-Registered User")
    @Tag("Add_Latest_Products_To_Cart")
    void addLatestProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addLatestProductsToCartTest(homePage);
    }
}

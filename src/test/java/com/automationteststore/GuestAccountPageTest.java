package com.automationteststore;

import org.junit.jupiter.api.*;

public class GuestAccountPageTest extends TestMethods{

    // Test 007 -> add featured products to check out test (as a non-registered user) with valid guest account creation
    @Test
    @DisplayName("Add Featured Products To Checkout As A Non-Registered User - Valid Guest Account Creation")
    @Tag("Valid_Guest_Account_Creation")
    @Tag("Featured_Products")
    void addFeaturedProductToCheckoutValidAccountTest(){
        HomePage homePage = new HomePage(driver);
        addFeaturedProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
    }

    // Test 008 -> add latest products to check out test (as a non-registered user) with valid guest account creation
    @Test
    @DisplayName("Add Latest Products To Checkout As A Non-Registered User - Valid Guest Account Creation")
    @Tag("Valid_Guest_Account_Creation")
    @Tag("Latest_Products")
    void addLatestProductToCheckoutValidAccountTest(){
        HomePage homePage = new HomePage(driver);
        addLatestProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
    }

}

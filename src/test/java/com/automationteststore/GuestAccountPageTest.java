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

    // Test 009 -> add bestseller products to check out test (as a non-registered user) with valid guest account creation
    @Test
    @DisplayName("Add Bestseller Products To Checkout As A Non-Registered User - Valid Guest Account Creation")
    @Tag("Valid_Guest_Account_Creation")
    @Tag("Bestseller_Products")
    void addBestsellersProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addBestsellersProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
    }

    // Test 010 -> add special products to check out test (as a non-registered user) with valid guest account creation
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Valid Guest Account Creation")
    @Tag("Valid_Guest_Account_Creation")
    @Tag("Special_Products")
    void addSpecialProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
    }

    // Test 010a-> add special products to check out test (as a non-registered user) with invalid guest account creation
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - No First Name")
    @Tag("Invalid_Guest_Account_Creation")
    void addSpecialProductToCheckoutNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationNoFirstNameTest(guestAccountPage);
    }

}

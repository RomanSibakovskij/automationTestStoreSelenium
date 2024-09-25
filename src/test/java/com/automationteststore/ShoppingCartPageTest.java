package com.automationteststore;

import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    // Test 006 -> add featured products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Featured Products To Checkout As A Non-Registered User")
    @Tag("Add_Featured_Products_To_Checkout")
    void addFeaturedProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addFeaturedProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
    }

    // Test 006a -> add latest products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Latest Products To Checkout As A Non-Registered User")
    @Tag("Add_Latest_Products_To_Checkout")
    void addLatestProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addLatestProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
    }

    // Test 005b -> add bestseller products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Bestseller Products To Checkout As A Non-Registered User")
    @Tag("Add_Bestseller_Products_To_Checkout")
    void addBestsellersProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addBestsellersProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
    }

}

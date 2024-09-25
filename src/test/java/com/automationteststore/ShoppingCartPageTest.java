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
        addFeaturedProductsToCheckoutTest(shoppingCartPage);
    }

}

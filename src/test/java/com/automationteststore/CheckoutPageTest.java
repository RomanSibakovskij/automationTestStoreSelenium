package com.automationteststore;

import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    // Test 011 -> confirm featured products addition to check out test (as a non-registered user)
    @Test
    @DisplayName("Confirm Addition Featured Products To Checkout As A Non-Registered User")
    @Tag("Confirm_Product_Addition_To_Checkout")
    @Tag("Confirm_Featured_Products")
    void confirmFeaturedProductAdditionToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addFeaturedProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 012 -> confirm latest products addition to check out test (as a non-registered user)
    @Test
    @DisplayName("Confirm Addition Featured Products  To Checkout As A Non-Registered User")
    @Tag("Confirm_Product_Addition_To_Checkout")
    @Tag("Confirm_Latest_Products")
    void confirmLatestProductAdditionToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addLatestProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

}

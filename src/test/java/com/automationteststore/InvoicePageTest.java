package com.automationteststore;

import org.junit.jupiter.api.*;

public class InvoicePageTest extends TestMethods{

    // Test 011a -> verify featured products order is indeed placed (as a non-registered user)
    @Test
    @DisplayName("Verify Featured Products Order As A Non-Registered User")
    @Tag("Verify_Products_Order")
    @Tag("Verify_Featured_Products_Order")
    void verifyFeaturedProductOrderTest(){
        HomePage homePage = new HomePage(driver);
        addFeaturedProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 012a -> verify latest products order is indeed placed (as a non-registered user)
    @Test
    @DisplayName("Verify Latest Products Order As A Non-Registered User")
    @Tag("Verify_Products_Order")
    @Tag("Verify_Latest_Products_Order")
    void verifyLatestProductOrderTest(){
        HomePage homePage = new HomePage(driver);
        addLatestProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 013a ->  verify bestseller products order is indeed placed (as a non-registered user)
    @Test
    @DisplayName("Verify Bestseller Products Order As A Non-Registered User")
    @Tag("Verify_Products_Order")
    @Tag("Verify_Bestseller_Products_Order")
    void verifyBestsellersProductOrderTest(){
        HomePage homePage = new HomePage(driver);
        addBestsellersProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 014a -> verify special products order is indeed placed (as a non-registered user)
    @Test
    @DisplayName("Verify Special Products Order As A Non-Registered User")
    @Tag("Verify_Products_Order")
    @Tag("Verify_Special_Products_Order")
    void verifySpecialProductOrderTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

}

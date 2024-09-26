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

    // Test 010a -> add special products to check out test (as a non-registered user) with invalid guest account creation (no first name)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - No First Name")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("No_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationNoFirstNameTest(guestAccountPage);
    }

    // Test 010b -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short first name)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Too Short First Name")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Too_Short_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutTooShortFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationTooShortFirstNameTest(guestAccountPage);
    }

    // Test 010c -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long first name)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Too Long First Name")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Too_Long_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutTooLongFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationTooLongFirstNameTest(guestAccountPage);
    }

    // Test 010d -> add special products to check out test (as a non-registered user) with invalid guest account creation (without last name)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - No Last Name")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("No_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutNoLastNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationNoLastNameTest(guestAccountPage);
    }

    // Test 010e -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short last name)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Too Short Last Name")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Too_Short_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutTooShortLastNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationTooShortLastNameTest(guestAccountPage);
    }

    // Test 010f -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long last name)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Too Long Last Name")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Too_Long_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutTooLongLastNameTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationTooLongLastNameTest(guestAccountPage);
    }

    // Test 010g -> add special products to check out test (as a non-registered user) with invalid guest account creation (no email address)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - No Email")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("No_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationNoEmailTest(guestAccountPage);
    }

    // Test 010h -> add special products to check out test (as a non-registered user) with invalid guest account creation (invalid email address format)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Invalid Email Format")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Invalid_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationInvalidEmailFormatTest(guestAccountPage);
    }

    // Test 010i -> add special products to check out test (as a non-registered user) with invalid guest account creation (existing email address) (The checkout is being complete)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Existing Email Format")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Existing_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutExistingEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationExistingEmailTest(guestAccountPage);
    }

    // Test 010j -> add special products to check out test (as a non-registered user) with invalid guest account creation (no address1)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - No Address")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("No_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutNoAddress1Test(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationNoAddress1Test(guestAccountPage);
    }

    // Test 010k -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short address1)
    @Test
    @DisplayName("Add Special Products To Checkout As A Non-Registered User - Invalid Guest Account Creation - Too Short Address")
    @Tag("Invalid_Guest_Account_Creation")
    @Tag("Too_Short_Singular_Guest_Account_Input")
    void addSpecialProductToCheckoutTooShortAddress1Test(){
        HomePage homePage = new HomePage(driver);
        addSpecialProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        invalidGuestCreationTooShortAddress1Test(guestAccountPage);
    }

}

package com.automationteststore;

import org.junit.jupiter.api.*;

public class SingleBrandProductTest extends TestMethods{

    // Test 015 -> add Benefit (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Benefit Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Benefit_Brand_Products")
    void addBenefitProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addBenefitProductsToCartTest(homePage);
    }

    // Test 015a -> add Pantene (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Pantene Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Pantene_Brand_Products")
    void addPanteneProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addPanteneProductsToCartTest(homePage);
    }

    // Test 015b -> add Mac (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Mac Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Mac_Brand_Products")
    void addMacProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addMacProductsToCartTest(homePage);
    }

    // Test 015c -> add Lancome (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Lancome Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Lancome_Brand_Products")
    void addLancomeProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addLancomeProductsToCartTest(homePage);
    }

    // Test 015d -> add Gucci (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Gucci Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Gucci_Brand_Products")
    void addGucciProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addGucciProductsToCartTest(homePage);
    }

    // Test 015e -> add Giorgio Armani (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Giorgio Armani Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Giorgio_Armani_Brand_Products")
    void addGiorgioArmaniProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addGiorgioArmaniProductsToCartTest(homePage);
    }

    // Test 015f -> add Dove (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Dove Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Dove_Brand_Products")
    void addDoveProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addDoveProductsToCartTest(homePage);
    }

    // Test 015g -> add Calvin Klein (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Calvin Klein Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Calvin_Klein_Brand_Products")
    void addCalvinKleinProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addCalvinKleinProductsToCartTest(homePage);
    }

    // Test 015h -> add Bulgari (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Bulgari Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Bulgari_Brand_Products")
    void addBulgariProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addBulgariProductsToCartTest(homePage);
    }

    // Test 015i -> add Sephora (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Sephora Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Sephora_Brand_Products")
    void addSephoraProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addSephoraProductsToCartTest(homePage);
    }

    // Test 016 -> add Benefit (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Benefit Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Benefit_Products_To_Checkout")
    void addBenefitProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addBenefitProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016a -> add Pantene (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Pantene Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Pantene_Products_To_Checkout")
    void addPanteneProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addPanteneProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016b -> add Mac (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Mac Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Mac_Products_To_Checkout")
    void addMacProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addMacProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016c -> add Lancome (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Lancome Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Lancome_Products_To_Checkout")
    void addLancomeProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addLancomeProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016d -> add Gucci (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Gucci Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Gucci_Products_To_Checkout")
    void addGucciProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addGucciProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016e -> add Giorgio Armani (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Giorgio Armani Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Giorgio_Armani_Products_To_Checkout")
    void addGiorgioArmaniProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addGiorgioArmaniProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016f -> add Dove (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Dove Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Dove_Products_To_Checkout")
    void addDoveProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addDoveProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016g -> add Calvin Klein (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Calvin Klein Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Calvin_Klein_Products_To_Checkout")
    void addCalvinKleinProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addCalvinKleinProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016h -> add Bulgari (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Bulgari Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Bulgari_Products_To_Checkout")
    void addBulgariProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addBulgariProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

    // Test 016i -> add Sephora (single brand) products to check out test (as a non-registered user)
    @Test
    @DisplayName("Add Sephora Products To Checkout As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Checkout")
    @Tag("Sephora_Products_To_Checkout")
    void addSephoraProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        addSephoraProductsToCartTest(homePage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutTest(shoppingCartPage);
        GuestAccountPage guestAccountPage = new GuestAccountPage(driver);
        validGuestAccountCreationTest(guestAccountPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
    }

}

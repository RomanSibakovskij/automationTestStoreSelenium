package com.automationteststore;

import org.junit.jupiter.api.*;

public class CategoriesProductAddToCheckoutRegUserTest extends TestMethods{

    // Test 024 -> add apparel & accessories products (Shoes) to check out as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (Shoes) To Checkout as Registered User")
    @Tag("Apparel_And_Accessories_Shoes_To_Checkout")
    @Tag("Apparel_And_Accessories_To_Checkout")
    void addApparelAndAccessoriesShoesToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        apparelAccessoriesShoesAddToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 024a -> add apparel & accessories products (men t-shirts) to checkout as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (T-Shirts) To Checkout as Registered User")
    @Tag("Apparel_And_Accessories_TShirts_To_Checkout")
    @Tag("Apparel_And_Accessories_To_Checkout")
    void addApparelAndAccessoriesTShirtsToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        apparelAccessoriesTShirtsAddToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 025 -> add makeup products (Cheeks) to check out as a registered user
    @Test
    @DisplayName("Add Makeup Products (Cheeks) To Checkout as Registered User")
    @Tag("Makeup_Cheeks_To_Checkout")
    @Tag("Makeup_Products_To_Checkout")
    void addMakeupCheeksToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addCheeksMakeupToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 025a -> add makeup products (Eyes) to check out as a registered user
    @Test
    @DisplayName("Add Makeup Products (Eyes) To Checkout as Registered User")
    @Tag("Makeup_Eyes_To_Checkout")
    @Tag("Makeup_Products_To_Checkout")
    void addMakeupEyesToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addEyesMakeupToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 025b -> add makeup products (Face) to check out as a registered user
    @Test
    @DisplayName("Add Makeup Products (Face) To Checkout as Registered User")
    @Tag("Makeup_Face_To_Checkout")
    @Tag("Makeup_Products_To_Checkout")
    void addMakeupFaceToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addFaceMakeupToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 025c -> add makeup products (Lips) to check out as a registered user
    @Test
    @DisplayName("Add Makeup Products (Lips) To Checkout as Registered User")
    @Tag("Makeup_Lips_To_Checkout")
    @Tag("Makeup_Products_To_Checkout")
    void addMakeupLipsToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addLipsMakeupToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 025d -> add makeup products (Nails) to check out as a registered user
    @Test
    @DisplayName("Add Makeup Products (Nails) To Checkout as Registered User")
    @Tag("Makeup_Nails_To_Checkout")
    @Tag("Makeup_Products_To_Checkout")
    void addMakeupNailsToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addNailsMakeupToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

}

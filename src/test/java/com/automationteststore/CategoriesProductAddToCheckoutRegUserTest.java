package com.automationteststore;

import org.junit.jupiter.api.*;

public class CategoriesProductAddToCheckoutRegUserTest extends TestMethods{

    // Test 024 -> add apparel & accessories products (Shoes) to check out as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (Shoes) To Checkout as Registered User")
    @Tag("Apparel_And_Accessories_Shoes_To_Checkout")
    @Tag("Apparel_And_Accessories_To_Checkout")
    void addApparelAndAccessoriesShoesToCartTest(){
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

}

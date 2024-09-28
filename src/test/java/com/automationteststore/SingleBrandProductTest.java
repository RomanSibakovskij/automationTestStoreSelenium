package com.automationteststore;

import org.junit.jupiter.api.*;

public class SingleBrandProductTest extends TestMethods{

    // Test 015 -> add benefit (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Benefit Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Benefit_Brand_Products")
    void addBenefitProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addBenefitProductsToCartTest(homePage);
    }

    // Test 015a -> add pantene (single brand) products to cart test (as a non-registered user)
    @Test
    @DisplayName("Add Pantene Products To Cart As A Non-Registered User")
    @Tag("Add_Single_Brand_Products_To_Cart")
    @Tag("Pantene_Brand_Products")
    void addPanteneProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        addPanteneProductsToCartTest(homePage);
    }

}

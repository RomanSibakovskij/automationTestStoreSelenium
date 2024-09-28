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


}

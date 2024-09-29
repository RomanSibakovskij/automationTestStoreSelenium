package com.automationteststore;

import org.junit.jupiter.api.*;

public class ApparelAccessoriesTest extends TestMethods{

    // Test 017 -> add apparel & accessories products (Shoes) to cart as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (Shoes) To Cart as Registered User")
    @Tag("Apparel_And_Accessories_Shoes_To_Cart")
    void addApparelAndAccessoriesShoesToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        apparelAccessoriesShoesAddToCartRegUserTest();
    }

    // Test 017a -> add apparel & accessories products (men t-shirts) to cart as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (T-Shirts) To Cart as Registered User")
    @Tag("Apparel_And_Accessories_TShirts_To_Cart")
    void addApparelAndAccessoriesTShirtsToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        apparelAccessoriesTShirtsAddToCartRegUserTest();
    }


}

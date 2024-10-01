package com.automationteststore;

import org.junit.jupiter.api.*;

public class CategoriesProductAddToCartRegUserTest extends TestMethods{

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

    // Test 018 -> add makeup products (Cheeks) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Cheeks) To Cart as Registered User")
    @Tag("Makeup_Cheeks_To_Cart")
    void addMakeupCheeksToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addCheeksMakeupToCartRegUserTest();
    }

    // Test 018a -> add makeup products (Eyes) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Eyes) To Cart as Registered User")
    @Tag("Makeup_Eyes_To_Cart")
    void addMakeupEyesToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addEyesMakeupToCartRegUserTest();
    }

    // Test 018b -> add makeup products (Face) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Face) To Cart as Registered User")
    @Tag("Makeup_Face_To_Cart")
    void addMakeupFaceToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addFaceMakeupToCartRegUserTest();
    }


}

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

    // Test 018c -> add makeup products (Lips) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Lips) To Cart as Registered User")
    @Tag("Makeup_Lips_To_Cart")
    void addMakeupLipsToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addLipsMakeupToCartRegUserTest();
    }

    // Test 018d -> add makeup products (Nails) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Nails) To Cart as Registered User")
    @Tag("Makeup_Nails_To_Cart")
    void addMakeupNailsToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addNailsMakeupToCartRegUserTest();
    }

    // Test 018e -> add makeup products (Value Sets) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Value Sets) To Cart as Registered User")
    @Tag("Makeup_Value_Sets_To_Cart")
    void addMakeupValueSetsToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addValueSetsMakeupToCartRegUserTest();
    }

    // Test 019 -> add skincare products (Eyes) to cart as a registered user
    @Test
    @DisplayName("Add Skincare Products (Eyes) To Cart as Registered User")
    @Tag("Skincare_Eyes_To_Cart")
    void addSkincareEyesToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addEyesSkincareToCartRegUserTest();
    }

    // Test 019a -> add skincare products (Face) to cart as a registered user
    @Test
    @DisplayName("Add Skincare Products (Face) To Cart as Registered User")
    @Tag("Skincare_Face_To_Cart")
    void addSkincareFaceToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addFaceSkincareToCartRegUserTest();
    }

    // Test 019b -> add skincare products (Gift Ideas & Sets) to cart as a registered user
    @Test
    @DisplayName("Add Skincare Products (Gift Ideas & Sets) To Cart as Registered User")
    @Tag("Skincare_Gift_Sets_To_Cart")
    void addSkincareGiftSetsToCart(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        addGiftSetsSkincareToCartRegUserTest();
    }


}

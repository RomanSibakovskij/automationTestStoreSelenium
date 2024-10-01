package com.automationteststore;

import org.junit.jupiter.api.*;

public class CategoriesProductAddToCartRegUserTest extends TestMethods{

    // Test 017 -> add apparel & accessories products (Shoes) to cart as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (Shoes) To Cart as Registered User")
    @Tag("Apparel_And_Accessories_Shoes_To_Cart")
    void addApparelAndAccessoriesShoesToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        apparelAccessoriesShoesAddToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 017a -> add apparel & accessories products (men t-shirts) to cart as a registered user
    @Test
    @DisplayName("Add Apparel & Accessories Products (T-Shirts) To Cart as Registered User")
    @Tag("Apparel_And_Accessories_TShirts_To_Cart")
    void addApparelAndAccessoriesTShirtsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        apparelAccessoriesTShirtsAddToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 018 -> add makeup products (Cheeks) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Cheeks) To Cart as Registered User")
    @Tag("Makeup_Cheeks_To_Cart")
    void addMakeupCheeksToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addCheeksMakeupToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 018a -> add makeup products (Eyes) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Eyes) To Cart as Registered User")
    @Tag("Makeup_Eyes_To_Cart")
    void addMakeupEyesToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addEyesMakeupToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 018b -> add makeup products (Face) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Face) To Cart as Registered User")
    @Tag("Makeup_Face_To_Cart")
    void addMakeupFaceToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addFaceMakeupToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 018c -> add makeup products (Lips) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Lips) To Cart as Registered User")
    @Tag("Makeup_Lips_To_Cart")
    void addMakeupLipsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addLipsMakeupToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 018d -> add makeup products (Nails) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Nails) To Cart as Registered User")
    @Tag("Makeup_Nails_To_Cart")
    void addMakeupNailsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addNailsMakeupToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 018e -> add makeup products (Value Sets) to cart as a registered user
    @Test
    @DisplayName("Add Makeup Products (Value Sets) To Cart as Registered User")
    @Tag("Makeup_Value_Sets_To_Cart")
    void addMakeupValueSetsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addValueSetsMakeupToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 019 -> add skincare products (Eyes) to cart as a registered user
    @Test
    @DisplayName("Add Skincare Products (Eyes) To Cart as Registered User")
    @Tag("Skincare_Eyes_To_Cart")
    void addSkincareEyesToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addEyesSkincareToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 019a -> add skincare products (Face) to cart as a registered user
    @Test
    @DisplayName("Add Skincare Products (Face) To Cart as Registered User")
    @Tag("Skincare_Face_To_Cart")
    void addSkincareFaceToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addFaceSkincareToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 019b -> add skincare products (Gift Ideas & Sets) to cart as a registered user
    @Test
    @DisplayName("Add Skincare Products (Gift Ideas & Sets) To Cart as Registered User")
    @Tag("Skincare_Gift_Sets_To_Cart")
    void addSkincareGiftSetsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addGiftSetsSkincareToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 019c -> add skincare products (Hands & Nails) to cart as a registered user (since none of the items is available, further testing here is aborted)
    @Test
    @DisplayName("Add Skincare Products (Hands & Nails) To Cart as Registered User")
    @Tag("Skincare_Hands_Nails_To_Cart")
    void addSkincareHandsNailsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addHandsNailsSkincareToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 019d -> add skincare products (Sun) to cart as a registered user (since none of the items is available, further testing here is aborted)
    @Test
    @DisplayName("Add Skincare Products (Sun) To Cart as Registered User")
    @Tag("Skincare_Sun_To_Cart")
    void addSkincareSunToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addSunSkincareToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 020 -> add fragrance products (Men) to cart as a registered user
    @Test
    @DisplayName("Add Fragrance Products (Men) To Cart as Registered User")
    @Tag("Fragrance_Men_To_Cart")
    void addMenFragranceToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addMenFragranceToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 020a -> add fragrance products (Women) to cart as a registered user
    @Test
    @DisplayName("Add Fragrance Products (Women) To Cart as Registered User")
    @Tag("Fragrance_Women_To_Cart")
    void addWomenFragranceToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addWomenFragranceToCartRegUserTest(singleCategoryProductPage);
    }

    // Test 021 -> add men products (Body & Shower) to cart as a registered user (since none of the items is available, further testing here is aborted)
    @Test
    @DisplayName("Add Men Products (Body & Shower) To Cart as Registered User")
    @Tag("Men_Body_And_Shower_To_Cart")
    void addMenBodyShowerToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addMenBodyAndShowerProductsToCart(singleCategoryProductPage);
    }

    // Test 021 -> add men products (Fragrance Sets) to cart as a registered user (since none of the items is available, further testing here is aborted)
    @Test
    @DisplayName("Add Men Products (Fragrance Sets) To Cart as Registered User")
    @Tag("Men_Fragrance_Sets_To_Cart")
    void addMenFragranceSetsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addMenFragranceSetProductsToCart(singleCategoryProductPage);
    }


}

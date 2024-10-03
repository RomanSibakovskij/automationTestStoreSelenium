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

    // Test 025e -> add makeup products (Value Sets) to check out as a registered user
    @Test
    @DisplayName("Add Makeup Products (Value Sets) To Checkout as Registered User")
    @Tag("Makeup_Value_Sets_To_Checkout")
    @Tag("Makeup_Products_To_Checkout")
    void addMakeupValueSetsToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addValueSetsMakeupToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 026 -> add skincare products (Eyes) to check out as a registered user
    @Test
    @DisplayName("Add Skincare Products (Eyes) To Checkout as Registered User")
    @Tag("Skincare_Eyes_To_Checkout")
    @Tag("Skincare_Products_To_Checkout")
    void addSkincareEyesToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addEyesSkincareToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 026a -> add skincare products (Face) to check out as a registered user
    @Test
    @DisplayName("Add Skincare Products (Face) To Checkout as Registered User")
    @Tag("Skincare_Face_To_Checkout")
    @Tag("Skincare_Products_To_Checkout")
    void addSkincareFaceToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addFaceSkincareToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 026b -> add skincare products (Gift Ideas & Sets) to check out as a registered user
    @Test
    @DisplayName("Add Skincare Products (Gift Ideas & Sets) To Checkout as Registered User")
    @Tag("Skincare_Gift_Sets_To_Checkout")
    @Tag("Skincare_Products_To_Checkout")
    void addSkincareGiftSetsToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addGiftSetsSkincareToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 027 -> add fragrance products (Men) to check out as a registered user
    @Test
    @DisplayName("Add Fragrance Products (Men) To Checkout as Registered User")
    @Tag("Fragrance_Men_To_Checkout")
    @Tag("Fragrance_Products_To_Checkout")
    void addMenFragranceToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addMenFragranceToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 027a -> add fragrance products (Women) to check out as a registered user
    @Test
    @DisplayName("Add Fragrance Products (Women) To Checkout  as Registered User")
    @Tag("Fragrance_Women_To_Checkout ")
    @Tag("Fragrance_Products_To_Checkout ")
    void addWomenFragranceToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addWomenFragranceToCartRegUserTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 028 -> add men products (Fragrance Sets) to check out as a registered user
    @Test
    @DisplayName("Add Men Products (Fragrance Sets) To Checkout as Registered User")
    @Tag("Men_Fragrance_Set_Products_To_Checkout")
    @Tag("Men_Products_To_Checkout")
    void addMenFragranceSetsToCartTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addMenFragranceSetProductsToCart(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 028a -> add men products (Skincare) to check out as a registered user
    @Test
    @DisplayName("Add Men Products (Skincare) To Checkout as Registered User")
    @Tag("Men_Skincare_Products_To_Checkout")
    @Tag("Men_Products_To_Checkout")
    void addMenSkincareProductsToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addMenSkincareProductsToCart(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 029 -> add hair care products (Conditioners) to check out as a registered user
    @Test
    @DisplayName("Add Haircare Products (Conditioners) To Checkout  as Registered User")
    @Tag("Haircare_Conditioner_Products_To_Checkout ")
    @Tag("Haircare_Products_To_Checkout")
    void addHaircareConditionersToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addHaircareConditionersToCart(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 029a -> add hair care products (Shampoo) to check out as a registered user
    @Test
    @DisplayName("Add Haircare Products (Shampoo) To Checkout as Registered User")
    @Tag("Haircare_Shampoo_Products_To_Checkout")
    @Tag("Haircare_Products_To_Checkout")
    void addHaircareShampooToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addHaircareShampooToCart(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationTest(checkoutPage);
        InvoicePage invoicePage = new InvoicePage(driver);
        verifyTheOrderSubmissionInInvoicePageTest(invoicePage);
    }

    // Test 030 -> add book products (Paperback) to check out as a registered user (the product that's not valid default quantity (1000000) gets added to check out) (since this particular test run cannot be verified in invoice page, the further testing is aborted (due to Selenium/Internet/CPU issues))
    @Test
    @DisplayName("Add Book Products (Paperback) To Checkout as Registered User")
    @Tag("Book_Paperback_Products_To_Checkout")
    @Tag("Book_Products_To_Checkout")
    void addBookPaperbackToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
        SingleCategoryProductPage singleCategoryProductPage = new SingleCategoryProductPage(driver);
        addPaperbackToCartTest(singleCategoryProductPage);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        addSelectedProductsToCheckoutAsRegUserTest(shoppingCartPage);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        productCheckoutConfirmationPaperbackTest(checkoutPage);
    }

}

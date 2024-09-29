package com.automationteststore;

import org.junit.jupiter.api.*;

public class ApparelAccessoriesTest extends TestMethods{

    // Test 017 -> valid user account creation test
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


}

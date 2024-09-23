package com.automationteststore;

import org.junit.jupiter.api.*;

public class CreateAccountPageTest extends TestMethods{

    // Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation")
    @Tag("Valid_User_Account_Creation")
    void validAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        validUserAccountCreationTest(createAccountPage);
    }

    // Test 002a -> invalid user account creation test (no first name)
    @Test
    @DisplayName("Invalid User Account Creation - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoFirstNameTest(createAccountPage);
    }

    // Test 002b -> invalid user account creation test (no last name)
    @Test
    @DisplayName("Invalid User Account Creation - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoLastNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoLastNameTest(createAccountPage);
    }

    // Test 002c -> invalid user account creation test (no email address)
    @Test
    @DisplayName("Invalid User Account Creation - No Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoEmailAddressTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoEmailTest(createAccountPage);
    }

    // Test 002d -> invalid user account creation test (no user address)
    @Test
    @DisplayName("Invalid User Account Creation - No User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserAddressTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoAddress1Test(createAccountPage);
    }

    // Test 002e -> invalid user account creation test (no user city)
    @Test
    @DisplayName("Invalid User Account Creation - No User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserCityTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoCityTest(createAccountPage);
    }

    // Test 002f -> invalid user account creation test (no user state selection)
    @Test
    @DisplayName("Invalid User Account Creation - No User State")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserStateTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoStateTest(createAccountPage);
    }

    // Test 002g -> invalid user account creation test (no user country selection)
    @Test
    @DisplayName("Invalid User Account Creation - No User Country")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUserCountryTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoCountryTest(createAccountPage);
    }

    // Test 002h -> invalid user account creation test (no login username)
    @Test
    @DisplayName("Invalid User Account Creation - No Username")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoUsernameTest(createAccountPage);
    }

    // Test 002i -> invalid user account creation test (no user password)
    @Test
    @DisplayName("Invalid User Account Creation - No Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoPasswordTest(createAccountPage);
    }

    // Test 002j -> invalid user account creation test (no confirm password)
    @Test
    @DisplayName("Invalid User Account Creation - No Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoConfirmPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoConfirmPasswordTest(createAccountPage);
    }

    // Test 002k -> invalid user account creation test (no 'Agree to terms' checkbox click)
    @Test
    @DisplayName("Invalid User Account Creation - No 'Agree To Terms'")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoAgreeToTermsTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoAgreeToTermsTest(createAccountPage);
    }

    // Test 002m -> invalid user account creation test (too long first name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongFirstNameTest(createAccountPage);
    }

    // Test 002n -> invalid user account creation test (too long last name)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongLastNameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongLastNameTest(createAccountPage);
    }

    // Test 002o -> invalid user account creation test (invalid email address format)
    @Test
    @DisplayName("Invalid User Account Creation - Invalid Email Address Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void accountCreationInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationInvalidEmailFormatTest(createAccountPage);
    }

    // Test 002p -> invalid user account creation test (too short email address) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortEmailTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortEmailTest(createAccountPage);
    }

    // Test 002q -> invalid user account creation test (too long email address)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongEmailTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongEmailTest(createAccountPage);
    }

    // Test 002r -> invalid user account creation test (existing email address (in database))
    @Test
    @DisplayName("Invalid User Account Creation - Existing Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Existing_Singular_Input")
    void accountCreationExistingEmailTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationExistingEmailTest(createAccountPage);
    }

    // Test 002s -> invalid user account creation test (too short user address)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortUserAddressTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortAddress1Test(createAccountPage);
    }

    // Test 002t -> invalid user account creation test (too long user address)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongUserAddressTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongAddress1Test(createAccountPage);
    }

    // Test 002u -> invalid user account creation test (too short user city)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortUserCityTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortCityTest(createAccountPage);
    }

    // Test 002v -> invalid user account creation test (too long user city)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongUserCityTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongCityTest(createAccountPage);
    }

    // Test 002w -> invalid user account creation test (too short zip code)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short Zip Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortZipCodeTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortZipCodeTest(createAccountPage);
    }

    // Test 002x -> invalid user account creation test (no zip code)
    @Test
    @DisplayName("Invalid User Account Creation - No Zip Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void accountCreationNoZipCodeTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationNoZipCodeTest(createAccountPage);
    }

    // Test 002y -> invalid user account creation test (too long zip code)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Zip Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongZipCodeTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongZipCodeTest(createAccountPage);
    }

    // Test 002z -> invalid user account creation test (too short login username)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short Username")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortUsernameTest(createAccountPage);
    }

    // Test 002aa -> invalid user account creation test (too long login username)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Username")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongUsernameTest(createAccountPage);
    }

    // Test 002ab -> invalid user account creation test (too short user password)
    @Test
    @DisplayName("Invalid User Account Creation - Too Short Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void accountCreationTooShortPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooShortPasswordTest(createAccountPage);
    }

    // Test 002ac -> invalid user account creation test (too long user password)
    @Test
    @DisplayName("Invalid User Account Creation - Too Long Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void accountCreationTooLongPasswordTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationTooLongPasswordTest(createAccountPage);
    }

    // Test 002ad -> invalid user account creation test (existing login username)
    @Test
    @DisplayName("Invalid User Account Creation - Existing Username")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Existing_Singular_Input")
    void accountCreationExistingUsernameTest(){
        HomePage homePage = new HomePage(driver);
        goToLoginRegisterPageTest(homePage);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        userAccountCreationExistingUsernameTest(createAccountPage);
    }
}

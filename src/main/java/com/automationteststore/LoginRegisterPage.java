package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginRegisterPage extends BasePage{

    //account dashboard hover menu web element
    @FindBy(xpath = "//ul[@id='customer_menu_top']/li[@class='dropdown']/a[@class='top menu_account']")
    private WebElement accountDashboardHoverMenu;
    //account login title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement accountLoginPageTitle;
    //account register button web element
    @FindBy(xpath = "//form[@id='accountFrm']//button[@type='submit']")
    private WebElement registerButton;

    //login form input field web elements
    @FindBy(xpath = "//input[@id='loginFrm_loginname']")
    private WebElement usernameInputField;
    @FindBy(xpath = "//input[@id='loginFrm_password']")
    private WebElement passwordInputField;
    //login button web element
    @FindBy(xpath = "//button[@title='Login']")
    private WebElement loginButton;
    //incorrect credentials error web element
    @FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
    private WebElement credentialsErrorMessage;

    //guest checkout checkbox web element
    @FindBy(xpath = "//input[@id='accountFrm_accountguest']")
    private WebElement guestCheckoutCheckbox;
    //'continue' button web element
    @FindBy(xpath = "//button[@title='Continue']")
    private WebElement continueButton;

    //valid login input data
    private String username;
    private String password;

    //invalid login input data
    private String noUsername;
    private String noPassword;
    private String invalidUsername;
    private String invalidPassword;

    public LoginRegisterPage(WebDriver driver) {
        super(driver);
    }

    //register button click method
    public void clickRegisterButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }

    //valid user login data getter
    public void getValidUserLoginData(CreateAccountPage createAccountPage){
        username = createAccountPage.getUsername();
        password = createAccountPage.getPassword();

        System.out.println("Valid login user data: " + "\n");
        logger.info("Valid login username: " + username);
        logger.info("Valid login password: " + password);
    }

    //valid user login input methods
    public void inputUsername(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(username);
    }
    public void inputPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    //login button click method
    public void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    //guest checkout checkbox click method
    public void clickGuestCheckoutCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(guestCheckoutCheckbox));
        guestCheckoutCheckbox.click();
    }
    //'continue' button click method
    public void clickContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    //invalid user login data getter - no username
    public void getInvalidUserLoginDataNoUsername(CreateAccountPage createAccountPage){
        noUsername = "";
        password = createAccountPage.getPassword();

        System.out.println("Invalid login user data (username): " + "\n");
        logger.info("No login username: " + noUsername);
        logger.info("Valid login password: " + password);
    }
    //invalid user login input method - no username
    public void inputNoUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(noUsername);
    }

    //invalid user login data getter - no password
    public void getInvalidUserLoginDataNoPassword(CreateAccountPage createAccountPage){
        username = createAccountPage.getUsername();
        noPassword = "";

        System.out.println("Invalid login user data (password): " + "\n");
        logger.info("Valid login username: " + username);
        logger.info("No login password: " + noPassword);
    }
    //invalid user password input method - no password
    public void inputNoPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }

    //invalid user login data getter - invalid username
    public void getInvalidUserLoginDataInvalidUsername(CreateAccountPage createAccountPage){
        invalidUsername = "Fgrertr_22";
        password = createAccountPage.getPassword();

        System.out.println("Invalid login user data (username): " + "\n");
        logger.info("Invalid login username: " + invalidUsername);
        logger.info("Valid login password: " + password);
    }
    //invalid user login input method - invalid username
    public void inputInvalidUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(invalidUsername);
    }

    //invalid user login data getter - invalid password
    public void getInvalidUserLoginDataInvalidPassword(CreateAccountPage createAccountPage){
        username = createAccountPage.getUsername();
        invalidPassword = "Asdvtflf_33#";

        System.out.println("Invalid login user data (password): " + "\n");
        logger.info("Valid login username: " + username);
        logger.info("Invalid login password: " + invalidPassword);
    }
    //invalid user password input method - no password
    public void inputInvalidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(invalidPassword);
    }

    //login/register page web element assert methods
    public boolean isAccountLoginPageTitleDisplayed() {return accountLoginPageTitle.isDisplayed();}
    public boolean isRegisterButtonDisplayed() {return registerButton.isDisplayed();}
    public boolean isUsernameInputFieldDisplayed() {return usernameInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isLoginButtonDisplayed() {return loginButton.isDisplayed();}

    //account login title getter
    public String getAccountLoginPageTitleText() {return accountLoginPageTitle.getText();}

    //incorrect credentials error getter
    public String getIncorrectCredentialsErrorMessage(){return credentialsErrorMessage.getText();}

    //guest checkbox confirmation getter
    public String getGuestCheckboxTitle(){return guestCheckoutCheckbox.getText();}

    //account dashboard user first name getter
    public String getFirstNameFromDashboardText() {
        String dashboardText = accountDashboardHoverMenu.getText();
        String[] words = dashboardText.split(" ");
        String firstName = words[words.length - 1];
        return firstName;
    }

}

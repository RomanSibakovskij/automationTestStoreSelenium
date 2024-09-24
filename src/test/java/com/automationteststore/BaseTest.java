package com.automationteststore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        //disable Chrome's Autofill for addresses and forms
        options.addArguments("--disable-autofill-keyboard-accessory-view[8]");
        //disable save address prompts
        options.addArguments("--disable-save-password-bubble"); 
        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1920,1080"); //this is necessary for CI run, disable once run in IDE and re-enable commented out options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    }

    @AfterEach
    public void close() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}

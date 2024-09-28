package com.automationteststore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        // Add arguments to disable popups and notifications
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("disable-infobars");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false); // disables Chrome password manager
        prefs.put("profile.password_manager_enabled", false); // disables password save prompt
        prefs.put("autofill.profile_enabled", false); // disables autofill for addresses
        prefs.put("profile.default_content_setting_values.notifications", 2); // block notifications
        options.setExperimentalOption("prefs", prefs);
//        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1920,1080"); //this is necessary for CI run, disable once run in IDE and re-enable commented out options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    }

    @AfterEach
    public void close() {
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
    }
}

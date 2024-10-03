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
        options.addArguments("--disable-search-engine-choice-screen");//-> enable this with browser run
        //add arguments to disable popups and notifications
        options.addArguments("--disable-notifications"); //-> enable this with browser run
        options.addArguments("--disable-popup-blocking"); //-> enable this with browser run
        options.addArguments("--disable-save-password-bubble"); //-> enable this with browser run
        options.addArguments("disable-infobars"); //-> enable this with browser run
        Map<String, Object> prefs = new HashMap<>(); //-> enable this with browser run
        prefs.put("credentials_enable_service", false); // disables Chrome password manager //-> enable this with browser run
        prefs.put("profile.password_manager_enabled", false); // disables password save prompt //-> enable this with browser run
        prefs.put("autofill.profile_enabled", false); // disables autofill for addresses //-> enable this with browser run
        prefs.put("profile.default_content_setting_values.notifications", 2); // block notifications //-> enable this with browser run
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1920,1080"); //this is necessary for CI run, disable once run in IDE and re-enable commented out options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); //-> enable this with browser run
        driver.get("https://automationteststore.com/");
    }

    @AfterEach
    public void close() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}

package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SkincarePage extends BasePage{

    //skincare category page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement categoryProductPageTitle;

    public SkincarePage(WebDriver driver) {
        super(driver);
    }

    //skincare category page title getter
    public String getCategoryProductPageTitle() {return categoryProductPageTitle.getText();}

}

package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class MakeupPage extends BasePage{

    //makeup category page title web element
    @FindBy(xpath = "//span[@class='maintext']")
    private WebElement categoryProductPageTitle;


    public MakeupPage(WebDriver driver) {
        super(driver);
    }

    //makeup category page title getter
    public String getCategoryProductPageTitle() {return categoryProductPageTitle.getText();}
    
}

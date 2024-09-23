package com.automationteststore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    //account dashboard hover menu web element
    @FindBy(xpath = "//ul[@id='customer_menu_top']/li[@class='dropdown']/a[@class='top menu_account']")
    private WebElement accountDashboardHoverMenu;

    public AccountPage(WebDriver driver) {
        super(driver);
    }


    //account dashboard user first name getter
    public String getFirstNameFromDashboardText() {
        String dashboardText = accountDashboardHoverMenu.getText();
        String[] words = dashboardText.split(" ");
        String firstName = words[words.length - 1];
        return firstName;
    }

}

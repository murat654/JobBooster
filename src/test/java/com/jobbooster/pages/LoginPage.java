package com.jobbooster.pages;

import com.jobbooster.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(name = "send")
    public WebElement loginButton;

    @FindBy(xpath = "//form[@id='login_form']/div[3]/a")
    public WebElement forgotYourPassLink;
}

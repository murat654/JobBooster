package com.jobbooster.pages;

import com.jobbooster.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    public ForgotPasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement usernameInput;

    @FindBy(name = "send")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div/form/p[1]")
    public WebElement errorMessageParagraph;
}

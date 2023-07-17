package com.jobbooster.step_definitions;

import com.jobbooster.pages.ForgotPasswordPage;
import com.jobbooster.pages.LoginPage;
import com.jobbooster.utilities.ConfigurationReader;
import com.jobbooster.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_Stepdefinitions {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPageUrl"));
    }

    @Given("user clicks to forgot password link")
    public void user_clicks_to_forgot_password_link() {
        loginPage.forgotYourPassLink.click();
    }

    @Given("user enters username {string} on the ForgotPasswordPage")
    public void user_enters_username_on_the_forgot_password_page(String username) {
        forgotPasswordPage.usernameInput.sendKeys(username);
    }

    @Given("user clicks to the send button on the ForgotPasswordPage")
    public void user_clicks_to_the_send_button_on_the_forgot_password_page() {
        forgotPasswordPage.loginButton.click();
    }

    @Then("user sees Identity not registered message")
    public void user_sees_identity_not_registered_message() {
        Assert.assertEquals(ConfigurationReader.getProperty("forgotPasswordErrorMessageInGerman"), forgotPasswordPage.errorMessageParagraph.getText());
    }
}

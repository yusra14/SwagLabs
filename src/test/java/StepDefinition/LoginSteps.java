package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    public LoginSteps(WebDriver driver) throws SQLException {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username password and click login button")
    public void user_enters_valid_username_and_password() {
        loginPage.login("standard_user", "secret_sauce");
    }

}

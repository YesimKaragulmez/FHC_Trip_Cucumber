package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Fhc_loginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcTrip_Login {

    Fhc_loginPage fhc_loginPage = new Fhc_loginPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
     Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
        fhc_loginPage.username.sendKeys(ConfigurationReader.getProperty("valid_username"));
        fhc_loginPage.password.sendKeys(ConfigurationReader.getProperty("valid_password"));
        fhc_loginPage.loginButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Admin - ListOfUsers");

    }


}

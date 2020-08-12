package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Fhc_loginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.security.auth.login.Configuration;

public class Negativelogin_Test {
    Fhc_loginPage fhc_loginPage = new Fhc_loginPage();

    @Given("user on the fhctrip.com")
    public void user_on_the_fhctrip_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Then("user enter the wrong credentials")
    public void user_enter_the_wrong_credentials() {
        fhc_loginPage.username.sendKeys("manger2");
        fhc_loginPage.password.sendKeys("Man1ager2");
        fhc_loginPage.loginButton.click();
    }

    @Then("verify the errormessage")
    public void verify_the_errormessage() {
        Assert.assertEquals(fhc_loginPage.errorMessage.getText(), "Try again please");
    }

}

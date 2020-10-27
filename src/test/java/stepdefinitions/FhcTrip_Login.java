package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Fhc_loginPage;
import utilities.AllPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcTrip_Login {

    AllPage allPage = new AllPage();


    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_url"));
    }

    @Given("Click on Log in link")
    public void click_on_Log_in_link() {
        allPage.homePage().logInLink.click();

    }

    @Given("Click on user name text box and type it {string}")
    public void click_on_user_name_text_box_and_type_it(String string) {
        allPage.loginPage().username.sendKeys("manager2");
    }

    @Given("Click on password name text box and type it {string}")
    public void click_on_password_name_text_box_and_type_it(String string) {
        allPage.loginPage().password.sendKeys("Man1ager2!");
    }

    @Given("Click login button")
    public void click_login_button() {
        allPage.loginPage().loginButton.click();
    }


    @Then("Verify LISTOFUSERS text is located")
    public void verify_LISTOFUSERS_text_is_located() {
        Assert.assertEquals(allPage.userPage().userListText.getText(), "LISTOFUSERS");
    }
}






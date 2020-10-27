package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.AllPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RoomSearch_Test {

    AllPage allPage = new AllPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
        allPage.loginPage().username.sendKeys(ConfigurationReader.getProperty("valid_username"));
        allPage.loginPage().password.sendKeys(ConfigurationReader.getProperty("valid_password"));
        allPage.loginPage().loginButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin - ListOfUsers");
    }
    @Given("Click on Hotel Management Management button")
    public void click_on_Hotel_Management_Management_button() {
        allPage.userPage().hotelManagementButton.click();

    }

   @Given("Click on the room reservation button")
   public void click_on_the_room_reservation_button() {
    allPage.userPage().roomReservat.click();
    }

   @Given("Click on ContactNameSurname textbox and type valid name	{string}")
    public void click_on_ContactNameSurname_textbox_and_type_valid_name(String string) {
    allPage.roomReservationPage().contactNameSname.sendKeys(string);
   }

    @Given("Click on ContactPhone textbox and type valid phone number	{string}")
   public void click_on_ContactPhone_textbox_and_type_valid_phone_number(String string) {
    allPage.roomReservationPage().contactPhone.sendKeys(string);
  }

    @Given("Click on Search button")
   public void click_on_Search_button() {
   allPage.roomReservationPage().searchButton.click();
   }

    @Then("Verify the message {string}")
   public void verify_the_message(String string) {
       Assert.assertEquals(allPage.roomReservationPage().noRecordMessage.getText(), "No data available in table");
  }

}

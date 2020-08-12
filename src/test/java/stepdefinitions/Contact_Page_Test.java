package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Contact_Page_Test {
    ContactPage contactPage=new ContactPage();

    @Given("user is on the fhctrip contact url")
    public void user_is_on_the_fhctrip_contact_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_contact"));
    }

    @Given("user enter her name and surname")
    public void user_enter_her_his_name_and_surname() {
   contactPage.name.sendKeys("Adam John");
    }

    @Given("user enter the email address in to email address input box")
    public void user_enter_the_email_address_in_to_email_address_input_box() {
   contactPage.email.sendKeys("zcan123@gmail.com");
    }

    @Given("user enter the  phone number in to phone number input box")
    public void user_enter_the_phone_number_in_to_phone_number_input_box() {
   contactPage.phoneNumber.sendKeys("+9087654321");
    }

    @Given("user enter the subject in to subject input box")
    public void user_enter_the_subject_in_to_subject_input_box() {
   contactPage.subject.sendKeys("cleaning");
    }

    @Given("user enter the message in to message input box")
    public void user_enter_the_message_in_to_message_input_box() {
    contactPage.message.sendKeys("it should be tidy");
    }

    @Given("user clicks the send message box")
    public void user_clicks_the_send_message_box() {
        contactPage.sendMessageButton.click();

    }
        @Then("verify if user send message successfully")
        public void verify_if_user_send_message_successfully() {
            Assert.assertFalse(contactPage.messageResult.isDisplayed());

    }


}

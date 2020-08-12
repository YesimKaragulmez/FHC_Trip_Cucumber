package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Fhc_hotelCreation_Page;
import pages.Fhc_loginPage;
import pages.Room_Creation_Page;
import pages.Room_Reservation_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Fhc_hotel_creation {
    Fhc_loginPage fhc_loginPage = new Fhc_loginPage();
    Fhc_hotelCreation_Page fhc_hotelCreation_page = new Fhc_hotelCreation_Page();
    Actions actions = new Actions(Driver.getDriver());
    Room_Creation_Page room_creation_page = new Room_Creation_Page();
    Room_Reservation_Page room_reservation_page = new Room_Reservation_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the fhctrip login page")
    public void user_is_on_the_fhctrip_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("user enter valid with manager username and password")
    public void user_enter_valid_with_manager_username_and_password() {
        fhc_loginPage.username.sendKeys(ConfigurationReader.getProperty("valid_username"));
        fhc_loginPage.password.sendKeys(ConfigurationReader.getProperty("valid_password"));

    }

    @Given("user clicks on loginbutton")
    public void user_clicks_on_loginbutton() {
        fhc_loginPage.loginButton.click();

    }

    @Then("verify the manager login is successful")
    public void verify_the_manager_login_is_successful() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin - ListOfUsers");
    }

    @Then("user clicks on hotel management")
    public void user_clicks_on_hotel_management() {
        fhc_hotelCreation_page.hotelManagement.click();
    }

    @Then("user clicks on hotel list")
    public void user_clicks_on_hotel_list() {
        fhc_hotelCreation_page.hotelList.click();
    }

    @Then("verify the new page")
    public void verify_the_new_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin - List Of Hotels");
    }

    @Then("user clicks on the ADD HOTEL")
    public void user_clicks_on_the_ADD_HOTEL() {
        fhc_hotelCreation_page.addHotel.click();
    }

    @Then("verify the list of hotels page")
    public void verify_the_list_of_hotels_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Admin - List Of Hotels");
    }

    @Then("user enter the code")
    public void user_enter_the_code() {
        fhc_hotelCreation_page.code.sendKeys(ConfigurationReader.getProperty("code"));
    }

    @Then("user enter the name")
    public void user_enter_the_name() {
        fhc_hotelCreation_page.name.sendKeys(ConfigurationReader.getProperty("name"));
    }

    @Then("user enter the address")
    public void user_enter_the_address() {
        fhc_hotelCreation_page.address.sendKeys(ConfigurationReader.getProperty("address"));
    }

    @Then("user enter the phone")
    public void user_enter_the_phone() {
        fhc_hotelCreation_page.phone.sendKeys(ConfigurationReader.getProperty("phone"));
    }

    @Then("user enter the email")
    public void user_enter_the_email() {
        fhc_hotelCreation_page.email.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @Then("user enter the IDgroup")
    public void user_enter_the_IDgroup() {
        WebElement group = Driver.getDriver().findElement(By.id("IDGroup"));
        Select option = new Select(group);
        option.selectByIndex(1);

    }

    @Then("user clicks on the save button")
    public void user_clicks_on_the_save_button() {

        fhc_hotelCreation_page.saveButton.click();
    }

    @Then("verify the Hotel was inserted successfully")
    public void verify_the_Hotel_was_inserted_successfully() {
        Assert.assertTrue(fhc_hotelCreation_page.message.getText().contains("HotelRoom was inserted successfully"));

    }

    @Then("user clicks on the OK button")
    public void user_clicks_on_the_OK_button() {
        fhc_hotelCreation_page.okButton.click();
    }

    @Then("user clicks on hotel Rooms")
    public void user_clicks_on_hotel_Rooms() {
        room_creation_page.hotelRooms.click();
    }

    @Then("user clicks addhotelroom")
    public void user_clicks_addhotelroom() {
        room_creation_page.addHotelRoom.click();

    }

    @Then("user enter the IDhotel")
    public void user_enter_the_IDhotel() {
        WebElement group = Driver.getDriver().findElement(By.id("IDHotel"));
        Select option = new Select(group);
        option.selectByIndex(1);
    }

    @Then("user enter the description")
    public void user_enter_the_description() {
        room_creation_page.description.sendKeys("This room should have sea view");

    }

    @Then("user enter the price")
    public void user_enter_the_price() {
        actions.dragAndDrop(room_creation_page.source, room_creation_page.target).perform();


    }

    @Then("user enter the room type")
    public void user_enter_the_room_type() {
        Select options = new Select(room_creation_page.roomType);
        options.selectByIndex(6);
    }

    @Then("user enter the max adult count")
    public void user_enter_the_max_adult_count() {
        room_creation_page.maxAdult.sendKeys("2");
    }

    @Then("user enter the max children count")
    public void user_enter_the_max_children_count() {
        room_creation_page.maxChildren.sendKeys("3");
    }

    @Then("user clicks on the Save button")
    public void user_clicks_on_the_Save_button() {
        room_creation_page.saveButton.click();
    }


    @Then("Verifying text is equal to HotelRoom was inserted successfully")
    public void verifying_text_is_equal_to_HotelRoom_was_inserted_successfully() {
        Assert.assertTrue(room_creation_page.message.getText().contains("HotelRoom was inserted successfully"));
    }

    @When("user clicks on Room Reservations")
    public void user_clicks_on_Room_Reservations() {
        room_reservation_page.roomReservation.click();
    }

    @When("user clicks ADD ROOM RESERVATION")
    public void user_clicks_ADD_ROOM_RESERVATION() {
        room_reservation_page.addRoomReservation.click();
    }

    @When("user enter the Select user")
    public void user_enter_the_Select_user() {

        Select option = new Select(room_reservation_page.selectUser);
        option.selectByIndex(3);
    }

    @When("user enter the Select hotel room")
    public void user_enter_the_Select_hotel_room() {
        Select group = new Select(room_reservation_page.selectHotelRoom);
        group.selectByIndex(3);
    }

    @When("user enter the Price")
    public void user_enter_the_Price() {
        room_reservation_page.price.sendKeys(ConfigurationReader.getProperty("price"));

    }

    @When("user enter the date start")
    public void user_enter_the_date_start() {
        room_reservation_page.dateStart.sendKeys(ConfigurationReader.getProperty("startDate"));
    }

    @When("user enter the date end")
    public void user_enter_the_date_end() {
        room_reservation_page.dateEnd.sendKeys(ConfigurationReader.getProperty("endDate"));
    }

    @When("user enter the adultamount")
    public void user_enter_the_adultamount() {
        room_reservation_page.adultAmount.sendKeys("2");
    }

    @When("user enter the childrenamount")
    public void user_enter_the_childrenamount() {
        room_reservation_page.childrenAmount.sendKeys("3");
    }

    @When("user enter the contactnamesurname")
    public void user_enter_the_contactnamesurname() {
        room_reservation_page.contactNameSurname.sendKeys("Asli");
    }

    @When("user enter the contactphone")
    public void user_enter_the_contactphone() {
        room_reservation_page.contactPhone.sendKeys(ConfigurationReader.getProperty("phone"));
    }

    @When("user enter the contact email")
    public void user_enter_the_contact_email() {
        room_reservation_page.contactEmail.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @When("user enter the notes")
    public void user_enter_the_notes() {
        room_reservation_page.notes.sendKeys("The room should be big and fresh ");
    }

    @When("user clicks Approved")
    public void user_clicks_Approved() {
        room_reservation_page.isApproved.click();
    }

    @When("user clicks Is paid")
    public void user_clicks_Is_paid() {
        room_reservation_page.isPaid.click();

    }
}



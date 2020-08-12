package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.RoomsPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RoomsPage_Test {
    RoomsPage roomsPage = new RoomsPage();

    @Given("user is on the contact page url")
    public void user_is_on_the_contact_page_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_contact"));
    }

    @When("user clicks on the rooms button")
    public void user_clicks_on_the_rooms_button() {
        roomsPage.rooms.click();
    }

    @When("user select room type")
    public void user_select_room_type() {
        Select option = new Select(roomsPage.roomType);
        option.selectByIndex(2);
    }

    @When("user select adult count")
    public void user_select_adult_count() {
        Select option = new Select(roomsPage.adultCount);
        option.selectByIndex(2);
    }

    @When("user select children count")
    public void user_select_children_count() {
        Select option = new Select(roomsPage.childrenCount);
        option.selectByIndex(4);
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
    roomsPage.search.click();
    }


}

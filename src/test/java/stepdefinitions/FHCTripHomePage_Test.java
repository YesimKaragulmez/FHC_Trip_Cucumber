package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FHCTripHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FHCTripHomePage_Test {
    FHCTripHomePage fhcTripHomePage = new FHCTripHomePage();
  WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
 Actions actions=new Actions(Driver.getDriver());
    @Given("go to fhctrip.com")
    public void go_to_fhctrip_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_url"));
    }


    @When("verify the FHCTRIP text on the top-left corner")
    public void verify_the_FHCTRIP_text_on_the_top_left_corner() {
        Assert.assertTrue(fhcTripHomePage.fhctripText.getText().contains("FHCTRIP"));
    }

    @When("verify the Welcome To Our Hotel text")
    public void verify_the_Welcome_To_Our_Hotel_text() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(500);
        Assert.assertEquals(fhcTripHomePage.welcomeText.getText(), "Welcome To Our Hotel"); 
    }

    @When("verify the number of staff is {double}")
    public void verify_the_number_of_staff_is(Double double1) throws InterruptedException {

        for (int i=0; i<6; i++){
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(500);
        }
        Thread.sleep(7000);
        System.out.println(" Actual Number is : " +fhcTripHomePage.staffText.getText());
        Assert.assertEquals(fhcTripHomePage.staffText.getText(),"1,000");
 
 
    }

}

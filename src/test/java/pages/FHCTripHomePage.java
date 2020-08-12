package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FHCTripHomePage {
    public FHCTripHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='navbar-brand']")
    public WebElement fhctripText;

    @FindBy(xpath = "(//h2[@class='mb-4'])[1]")
    public WebElement welcomeText;

    @FindBy(xpath = "//strong[@data-number='1000']")
    public WebElement staffText;

}

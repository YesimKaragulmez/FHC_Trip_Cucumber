package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ListOfHotelRoomPage {
    public ListOfHotelRoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoom;
    @FindBy (name = "Name")
    public WebElement nameTextbox;
    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public WebElement nameVerification;
    @FindBy(className = "dataTables_empty")
    public WebElement errorMessage;

}

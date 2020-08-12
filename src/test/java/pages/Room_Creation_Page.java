package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Room_Creation_Page {
    public Room_Creation_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href=\"/admin/HotelRoomAdmin\"]")
     public  WebElement hotelRooms;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
     public WebElement message;

   @FindBy(xpath = "//div[@class='actions']")
   public WebElement addHotelRoom;

    @FindBy(id = "IDHotel")
    public WebElement idHotel;

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(xpath = "//div[@id='cke_1_contents']//textarea")
    public WebElement description;

    @FindBy(name = "Price")
    public WebElement target;

    @FindBy(xpath = "//li[@data-id='700']")
    public WebElement source;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildren;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;
}

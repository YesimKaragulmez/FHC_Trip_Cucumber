package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Room_Reservation_Page {
    public Room_Reservation_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//*[@href=\"/admin/RoomReservationAdmin\"]")
   public WebElement roomReservation;

    @FindBy(xpath = "//div[@class='actions']")
    public WebElement addRoomReservation;

    @FindBy(id = "IDUser")
    public WebElement selectUser;

    @FindBy(id = "IDHotelRoom")
    public WebElement selectHotelRoom;

    @FindBy(id= "Price")
    public WebElement price;

    @FindBy(id = "DateStart")
    public WebElement dateStart;

    @FindBy(id = "DateEnd")
    public WebElement dateEnd;

    @FindBy(id = "AdultAmount")
    public WebElement adultAmount;

    @FindBy(id = "ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy(id = "ContactNameSurname")
    public WebElement contactNameSurname;

    @FindBy(id = "ContactPhone")
    public WebElement contactPhone;

    @FindBy(id = "ContactEmail")
    public WebElement contactEmail;

    @FindBy(id = "Notes")
    public WebElement notes;

 @FindBy(id = "Approved")
 public WebElement isApproved;
 @FindBy(id = "IsPaid")
 public WebElement isPaid;
 @FindBy(id = "btnSubmit")
 public WebElement submitButton;
 @FindBy(className = "bootbox-body")
 public WebElement success_message;
 @FindBy(xpath = "//*[@data-bb-handler='ok']")
 public WebElement okButton;


 @FindBy(name = "ContactNameSurname")
 public WebElement contactNameSname;

 @FindBy (xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
 public WebElement searchButton;
 @FindBy (className = "dataTables_empty")
 public WebElement noRecordMessage;
 @FindBy(xpath = "//div//tbody//tr//td[11]")
 public WebElement email;
}







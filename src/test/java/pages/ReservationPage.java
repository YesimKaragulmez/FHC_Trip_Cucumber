package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReservationPage {
    public  ReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addRoomPage;
    @FindBy(id = "IDUser")
    public WebElement idUserSelectUser;
    @FindBy(id = "IDHotelRoom")
    public WebElement idUserSelectRoom;
    @FindBy(id = "Price")
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
    public WebElement surname;
    @FindBy(id = "ContactPhone")
    public WebElement phone;
    @FindBy(id = "ContactEmail")
    public WebElement email;
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

    //@FindBy(xpath = "//input[@class='form-control input-lg required email error']")
    //@FindBy(id = "ContactEmail")
    @FindBy(xpath =  "//*[contains(text(),'Please provide correct email address')]")
    public WebElement negativeTest;

}



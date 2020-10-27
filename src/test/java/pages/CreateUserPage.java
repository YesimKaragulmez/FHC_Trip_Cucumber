package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateUserPage {
    public CreateUserPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addUser;
    @FindBy(id = "UserName")
    public WebElement userName;
    @FindBy(id = "txtPassword")
    public WebElement password;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "NameSurname")
    public WebElement fullName;
    @FindBy(id = "PhoneNo")
    public WebElement phoneNo;
    @FindBy(id = "SSN")
    public WebElement SSNnumber;
    @FindBy(id = "DrivingLicense")
    public WebElement drivingLicense;
    @FindBy(id = "IDCountry")
    public WebElement country;
    @FindBy(id = "IDState")
    public WebElement state;
    @FindBy(id = "Address")
    public WebElement address;
    @FindBy(id = "BirthDate")
    public WebElement birthDate;
    @FindBy(id = "WorkingSector")
    public WebElement workingSector;
    @FindBy(id = "IDRole")
    public WebElement role;
    @FindBy(xpath = "//input[@data-val='true']")
    public WebElement approved;
    @FindBy(id = "btnSubmit")
    public WebElement save;
    //@FindBy (xpath = "//div[@class='modal-body']")
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfullyWritten;
    @FindBy(xpath = "//div[@class='alert alert-danger display-hide']")
    public  WebElement NegativeTest;


}

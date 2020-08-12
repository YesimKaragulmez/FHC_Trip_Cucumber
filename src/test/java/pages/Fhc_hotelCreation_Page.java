package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Fhc_hotelCreation_Page {
    public Fhc_hotelCreation_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;

    @FindBy(xpath = "//*[@href='/admin/HotelAdmin']")
    public WebElement hotelList;

    @FindBy(xpath = "//*[@class='btn btn-circle btn-default']")
    public WebElement addHotel;

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(id = "Address")
    public WebElement address;

    @FindBy(id = "Phone")
    public WebElement phone;

    @FindBy(id = "Email")
    public WebElement email;


    @FindBy(id = "IDGroup")
    public WebElement IDgroup;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
     public WebElement message;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
     public WebElement okButton;







}

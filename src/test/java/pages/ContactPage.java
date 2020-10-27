package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "NameSurname")
    public WebElement name;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "PhoneNo")
    public WebElement phoneNumber;
    @FindBy(id = "Subject")
    public WebElement subject;
    @FindBy(id = "Message")
    public WebElement message;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement sendMessageButton;
    @FindBy(xpath= "//div[@id='divMessageResult']")
    public WebElement messageResult;
}

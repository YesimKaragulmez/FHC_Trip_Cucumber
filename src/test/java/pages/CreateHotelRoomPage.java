package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateHotelRoomPage {
    public CreateHotelRoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//select[@class='form-control input-lg required']")
    public WebElement IDHotel;
    @FindBy(id="Code")
    public WebElement Code;
    @FindBy(id="Name")
    public WebElement Name;
    @FindBy(id="Location")
    public WebElement Location;
    @FindBy (xpath="//textarea[@class='cke_source cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")
    public WebElement Description;
    @FindBy (id="Price")
    public WebElement Price;
    @FindBy (xpath="//a[@class='label label-success']")
    public WebElement threehundredPrice;
    @FindBy (id="IDGroupRoomType")
    public WebElement RoomType;
    @FindBy (id="MaxAdultCount")
    public WebElement MaxAdultCount;
    @FindBy (id="MaxChildCount")
    public WebElement MaxChildCount;
    @FindBy (id="IsAvailable")
    public WebElement IsAvailable;
    @FindBy (id="btnSubmit")
    public WebElement btnSubmit;
    @FindBy (xpath ="//div[@class='bootbox-body']")
    public WebElement successMessage;


}

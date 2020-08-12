package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomsPage {
    public RoomsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "nav-link")
    public WebElement rooms;

    @FindBy(id = "IDRoomType")
    public WebElement roomType;

    @FindBy(id = "AdultCount")
    public WebElement adultCount;
//degisiklik
    @FindBy(id = "ChildrenCount")
    public WebElement childrenCount;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement search;
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ListOfHotelsPage {
    public ListOfHotelsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;
    @FindBy (id = "Code")
    public WebElement codeHotel;
    @FindBy (id = "Name")
    public WebElement nameHotel;
    @FindBy (id = "Address")
    public WebElement addressHotel;
    @FindBy (id = "Phone")
    public WebElement phoneHotel;
    @FindBy (id = "Email")
    public WebElement emailHotel;
    @FindBy (xpath = "//select[@id='IDGroup']")
    public WebElement groupOfHotelDropdown;
    @FindBy (id = "btnSubmit")
    public WebElement saveHotel;
    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement messageHotel;
    @FindBy (xpath = "//label[@class='error']")
    public WebElement invalidEmailHotel;
    @FindBy (xpath = "//input[@name='Name']")
    public WebElement nameBoxForSearch;
    @FindBy (xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButtonHotel;
    @FindBy (xpath = "//td[@class='dataTables_empty']")
    public WebElement noDataMessage;

    public String printData(int row, int column){
        //write your code in this method
        //tbody//tr[8]//td[6]
        //Writing the dynamic xpath
        String xpath = "//tbody//tr["+row+"]//td["+column+"]";
        //String xpath1 = "//tbody//tr[8]//td[6]";//=>Studio
        //We are finding the elements  using that xpath
        WebElement data=Driver.getDriver().findElement(By.xpath(xpath));
        //We are and printing the data
        return data.getText();
    }

}

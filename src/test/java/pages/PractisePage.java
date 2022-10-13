package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PractisePage {
    public PractisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@id='button1']")
    public WebElement WYAclickButton1;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement addNewToDo;

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> todoListesi;

    @FindBy (xpath = "//button[text()='Hover Over Me First!']")
    public WebElement hoverOverFirst;

    @FindBy(xpath = "(//a[text()='Link 1'])[2]")
    public WebElement hoverOverFirstLink1;

    @FindBy(xpath = "(//div[@class='dropdown-content'])[1]")
    public WebElement hoverOverFirstDropDown;
}

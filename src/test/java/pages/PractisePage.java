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


}

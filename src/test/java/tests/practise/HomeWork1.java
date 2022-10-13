package tests.practise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.PractisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomeWork1 {

    PractisePage practise = new PractisePage();

    @Test
    public void test() {
        //"http://webdriveruniversity.com/Actions" sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("webDriverUniversityActions"));
        //Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(practise.hoverOverFirst).perform();
        //Link 1" e tiklayin
        WebElement ddm=practise.hoverOverFirstDropDown;
        Select select=new Select(ddm);
        select.selectByVisibleText("Hover Over Me First!");
        //Popup mesajini yazdirin
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        //Popup'i tamam diyerek kapatin
        Driver.getDriver().switchTo().alert().accept();
        //"Click and hold" kutusuna basili tutun
        //7-"Click and hold" kutusunda cikan yaziyi yazdirin
        //8- "Double click me" butonunu cift tiklayin


    }
}

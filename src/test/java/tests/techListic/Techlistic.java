package tests.techListic;

import com.github.javafaker.Faker;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TechlisticPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Techlistic {

    TechlisticPage techlistic = new TechlisticPage();

    @Test
    public void test01() {

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        Driver.getDriver().get(ConfigReader.getProperty("techlisticURL"));
        //cookies
        techlistic.cookiesOK.click();
        //fill the firstname
        //fill the lastname
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        techlistic.firstNameElementi.click();
        actions.sendKeys(faker.lorem().word(), Keys.TAB)
                .sendKeys(faker.lorem().word()).perform();
        //check the gender
        techlistic.genderMale.click();
        //check the experience
        techlistic.experience7.click();
        //fill the date
        techlistic.date.sendKeys("11,01.2022");
        //choose your profession -> Automation Tester
        techlistic.tester.click();
        //choose your tool -> Selenium Webdriver
        techlistic.webdriver.click();
        //choose your continent -> Antartica
        //dropdown'da önce dropdown locate edilip wep elementine atarız.
        //daha sonra select objesi oluşturuyoruz.
        WebElement ddm = techlistic.dropDownContinent;
        Select select = new Select(ddm);
        select.selectByVisibleText("Antartica");
        /*
        bu şekildede çözülebilir
        techlistic.dropDownContinent.sendKeys("Antartica");
         */
        //choose your command  -> Browser Commands
        techlistic.commands.click();
        //click submit button
        techlistic.button.click();
    }
}

package tests.practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class HerokuappClick {

    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons and verify they are all clicked
    HerokuappPage herokuappPage=new HerokuappPage();

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("herokuappURL"));
        Actions action=new Actions(Driver.getDriver());
        action.click(herokuappPage.onblur)
                .click(herokuappPage.onclick)
                .click(herokuappPage.onclick)
                .contextClick(herokuappPage.oncontextmenu)
                .doubleClick(herokuappPage.ondoubleclick)
                .click(herokuappPage.onfocus)
                .click(herokuappPage.onkeydown)
                .sendKeys(Keys.ENTER)
                .click(herokuappPage.onkeyup)
                .sendKeys(Keys.ENTER)
                .click(herokuappPage.onkeypress)
                .sendKeys(Keys.ENTER)
                .moveToElement(herokuappPage.onmouseover)
                .moveToElement(herokuappPage.onmouseleave)
                .moveToElement(herokuappPage.onmouseover)
                .click(herokuappPage.onmousedown).perform();

        Assert.assertEquals(herokuappPage.eventTriggedText.size(),11);
    }
}

package tests.practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PractisePage;
import pages.WebUniversityPages;
import utilities.ConfigReader;
import utilities.Driver;

public class WebdriverUniversityAllert {

    WebUniversityPages webUniversityPages=new WebUniversityPages();

    @Test
    public void test() {

        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("webDriverUniversityAllertsURL"));
        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        webUniversityPages.WYAclickButton1.click();
        // 3. Açılır metni alın
        String actualAlertText = Driver.getDriver().switchTo().alert().getText();
        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedText="I am an alert box!";
        Assert.assertEquals(actualAlertText,expectedText);
        // 5. Açılır pencereyi kabul edin
        Driver.getDriver().switchTo().alert().accept();
    }
}

package tests.hotelMyCampSmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class PositivetiveTest {

    HotelMyCamp hmc = new HotelMyCamp();

    @Test
    public void positiveLoginTest() {
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcURL"));
        //login butonuna bas
        hmc.login1.click();
        //test data username: manager ,
        //test data password : Manager1!
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hmc.username.sendKeys(ConfigReader.getProperty("hmcValidUsername"));
        hmc.password.sendKeys(ConfigReader.getProperty("hmcValidPassword"));
        hmc.login2.click();
        Assert.assertTrue(hmc.managerGorunurlugu.isDisplayed());
        Driver.closeDriver();
    }
}

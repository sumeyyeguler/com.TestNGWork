package tests.hotelMyCamp;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeTest {

    HotelMyCamp hmc = new HotelMyCamp();

    @Test
    public void YanlisUsername() {
        // 1 ) Bir Class olustur : NegativeTest
        // 2) Bir test method olustur NegativeLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcURL"));
        // login butonuna bas
        hmc.login1.click();
        // test data username: manager1 ,
        hmc.username.sendKeys(ConfigReader.getProperty("hmcWrongUsername"));
        // test data password : manager1!
        hmc.password.sendKeys(ConfigReader.getProperty("hmcValidPassword"));
        hmc.login2.click();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmc.login2.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisPassword() {
        Driver.getDriver().get(ConfigReader.getProperty("hmcURL"));
        hmc.login1.click();
        hmc.username.sendKeys(ConfigReader.getProperty("hmcValidUsername"));
        hmc.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));
        hmc.login2.click();
        Assert.assertTrue(hmc.login2.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisUsernamePassword() {
        Driver.getDriver().get(ConfigReader.getProperty("hmcURL"));
        hmc.login1.click();
        hmc.username.sendKeys(ConfigReader.getProperty("hmcWrongUsername"));
        hmc.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));
        hmc.login2.click();
        Assert.assertTrue(hmc.login2.isDisplayed());
        Driver.closeDriver();
    }
}

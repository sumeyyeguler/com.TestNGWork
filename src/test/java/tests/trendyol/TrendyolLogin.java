package tests.trendyol;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolLogin {

    Trendyol trendyol = new Trendyol();

    @Test(priority = 1)
    public void positiveLogin() {
        //trendyol sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("trendyolURL"));
        //cookies kabul edin
        trendyol.cookiesKabulEt.click();
        //giris yap'a tıklayın
        trendyol.girisYapSagUst.click();
        //dogru mail ve  dogru şifre girin
        Actions actions=new Actions(Driver.getDriver());
        actions.click(trendyol.loginEmail)
                .sendKeys(ConfigReader.getProperty("trendyolValidUsername"))
                .sendKeys(Keys.TAB,ConfigReader.getProperty("trendyolValidPassword")).click(trendyol.kullaniciGirisYap).perform();
        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void negativeLogin() {
        //trendyol sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("trendyolURL"));
        //cookies kabul edin
        trendyol.cookiesKabulEt.click();
        //giris yap'a tıklayın
        trendyol.girisYapSagUst.click();
        //yanlıs mail ve  yanlıs şifre girin
        Actions actions=new Actions(Driver.getDriver());
        actions.click(trendyol.loginEmail)
                .sendKeys(ConfigReader.getProperty("trendyolWrongUsername"))
                .sendKeys(Keys.TAB,ConfigReader.getProperty("trendyolWrongPassword")).click(trendyol.kullaniciGirisYap).perform();
        //E-posta adresiniz ve/veya şifreniz hatalı yazısının görünür olduğunu test edin
        String expected="E-posta adresiniz ve/veya şifreniz hatalı.";
        String actual=trendyol.hataliKullaniciGirisUyarisi.getText();
        Assert.assertEquals(actual,expected);
        Driver.closeDriver();
    }


}


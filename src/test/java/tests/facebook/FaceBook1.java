package tests.facebook;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FaceBook1 {
    @Test
    public void test01() {
        FacebookPage fbPage=new FacebookPage();
        Faker faker=new Faker();
       // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
       // 2 POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
       // Faker class’ini kullanarak email ve sifre degerlerini yazdirin
        fbPage.emailTextKutusu.sendKeys(faker.internet().emailAddress());
        fbPage.passwordTextKutusu.sendKeys(faker.internet().password());
       //3 giris butonuna basin
        fbPage.loginButonu.click();
       // 4 Basarili giris yapilamadigini test edin
        Assert.assertTrue(fbPage.sifremiUnuttum.isDisplayed());
        Driver.closeDriver();
    }
}

package tests.hotelMyCampSmokeTests;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FacebookPage;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class E2ETestCreateHotel {

    HotelMyCamp hmc = new HotelMyCamp();

    @Test
    public void createHotel() throws InterruptedException {
        //  1. Tests packagenin altına class olusturun: CreateHotel
        //  2. Bir metod olusturun: createHotel
        //  3. https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hmcURL"));
        hmc.login1.click();
        //  4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //  a. Username : manager
        //  b. Password : Manager1!
        //5. Login butonuna tıklayın.
        Actions actions = new Actions(Driver.getDriver());
        hmc.username.sendKeys(ConfigReader.getProperty("hmcValidUsername"));
        actions
                .sendKeys(Keys.TAB, ConfigReader.getProperty("hmcValidPassword"))
                .sendKeys(Keys.TAB, Keys.ENTER)
                .perform();
        //  6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        actions.click(hmc.hotelManagement)
                .sendKeys(Keys.TAB, Keys.ENTER).perform();
        //hmc.hotelList.click();
        hmc.addHotel.click();
        //  7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker = new Faker();
        actions.click(hmc.addHotelID)
                .sendKeys(faker.idNumber().invalid())
                .sendKeys(Keys.TAB, faker.name().firstName())
                .sendKeys(Keys.TAB, faker.address().fullAddress())
                .sendKeys(Keys.TAB, faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB, faker.internet().emailAddress())
                .perform();
        WebElement ddm = hmc.addHotelIDGroup;
        Select options = new Select(ddm);
        options.selectByIndex(2);
        //  8. Save butonuna tıklayın.
        hmc.addHotelLogin.click();
        //  9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        String expected = "Hotel was inserted successfully";
        String actual = hmc.uyariPaneli.getText();
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actual,expected);
        //  10. OK butonuna tıklayın.
        Thread.sleep(3000);
        hmc.uyariPaneliOK.click();
        Driver.closeDriver();
        sa.assertAll();
    }
}

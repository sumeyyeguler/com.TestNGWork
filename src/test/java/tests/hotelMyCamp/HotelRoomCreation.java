package tests.hotelMyCamp;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class HotelRoomCreation {

    HotelMyCamp hmc=new HotelMyCamp();

    @Test
    public void RoomCreateTest() {


        //1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
        //2. Bir metod olusturun: RoomCreateTest()
        //3. https://www.hotelmycamp.com adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("hmcURL"));
        //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        //a. Username : manager b. Password : Manager1!
        //5. Login butonuna tıklayın.
        hmc.login1.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.click(hmc.username)
                .sendKeys(ConfigReader.getProperty("hmcValidUsername"))
                .sendKeys(Keys.TAB,ConfigReader.getProperty("hmcValidPassword"))
                .sendKeys(Keys.TAB,Keys.ENTER).perform();
        //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        actions.click(hmc.hotelManagement)
                .sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).perform();
        hmc.addHotelRoomButonu.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8. Save butonuna basin.
        WebElement ddm1=hmc.createHotelRoomIdHotel;
        Select options1=new Select(ddm1);
        options1.selectByIndex(5);
        Faker faker=new Faker();
        actions.click(hmc.createHotelRoomCode)
                .sendKeys(faker.idNumber().valid())
                .sendKeys(Keys.TAB,faker.name().firstName(),Keys.TAB,faker.address().fullAddress(),Keys.TAB,faker.lorem().paragraph(30))
                .sendKeys(Keys.TAB,faker.numerify("1234")).perform();
        WebElement ddm2=hmc.createHotelRoomType;
        Select options2=new Select(ddm2);
        options2.selectByIndex(3);
        actions.click(hmc.createHotelMaxAdultCount).sendKeys("3",Keys.TAB,"2").click(hmc.createHotelApproveCheckBox).click(hmc.createHotelSave).perform();
        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        String expected="HotelRoom was inserted successfully";
        String actual=hmc.createHotelAlert.getText();
        //Assert.assertEquals(actual,expected);
        //Assert.assertTrue(hmc.createHotelAlert.isDisplayed());
        //10. OK butonuna tıklayın.
        hmc.createHotelAlertOK.click();
        //11. Hotel rooms linkine tıklayın.
        //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..

    }
}

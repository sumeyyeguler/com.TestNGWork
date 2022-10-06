package tests.trendyol;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendyolSepeteUrunEkle {

    Trendyol trendyol = new Trendyol();

    @Test
    public void evMobilyaMenu() {
        //trendyola gidin
        Driver.getDriver().get(ConfigReader.getProperty("trendyolURL"));
        //cookies kabul edin
        trendyol.cookiesKabulEt.click();
        //ev ve mobilya sekmesine tıklayın
        trendyol.evVeMobilya.click();
        //avize ve aydınlatma ürünleri kategorisini görene kadar sayfayı indirin ve kategoriye tıklayın
        //avize kategorisinde ilk urunu sepete ekleyin
        System.out.println(Driver.getDriver().getTitle());
        Actions actions = new Actions(Driver.getDriver());
        trendyol.aydinlatmadaIndirimZamani.click();
        trendyol.avizeIlkUrun.click();
        trendyol.sepeteEkle.click();
        //önceki sayfaya geri dönün
        Driver.getDriver().navigate().back();
        //ikinci ürünü sepete ekleyin
        ReusableMethods.waitFor(3000);
        trendyol.avizeIkinciUrun.click();


/*
 .click(trendyol.sepeteEkle)
.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN)

 */


    }
}

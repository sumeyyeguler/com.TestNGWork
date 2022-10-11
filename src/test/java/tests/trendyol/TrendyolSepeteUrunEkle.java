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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TrendyolSepeteUrunEkle {

    Trendyol trendyol = new Trendyol();

    @Test
    public void evMobilyaMenu() {
        //trendyola gidin
        Driver.getDriver().get(ConfigReader.getProperty("trendyolURL"));
        //cookies kabul edin
        trendyol.cookiesKabulEt.click();
        //ev ve mobilya sekmesine tıklayın
        ReusableMethods.waitFor(4);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(trendyol.evVeMobilya).perform();
        trendyol.avize.click();
        String avizeSayfa1=Driver.getDriver().getTitle();
        //avize kategorisinde ilk urunu sepete ekleyin
        trendyol.avizeIlkUrun.click();
        Set<String> sayfaSet=Driver.getDriver().getWindowHandles();
        List<String>sayfaList=new ArrayList<>(sayfaSet);
        Driver.getDriver().switchTo().window(sayfaList.get(1));
        trendyol.sepeteEkle.click();
        //önceki sayfaya geri dönün
        ReusableMethods.switchToWindow(avizeSayfa1);
        //ikinci ürünü sepete ekleyin
        trendyol.avizeIkinciUrun.click();
        sayfaSet=Driver.getDriver().getWindowHandles();
        sayfaList=new ArrayList<>(sayfaSet);
        Driver.getDriver().switchTo().window(sayfaList.get(2));
        trendyol.sepeteEkle.click();
        //ReusableMethods.waitFor(3000);


    }
}

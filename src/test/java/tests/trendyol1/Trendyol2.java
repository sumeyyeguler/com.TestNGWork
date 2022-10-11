package tests.trendyol1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.Google;
import pages.Morhipo;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Trendyol2 {

    Google google = new Google();
    Trendyol trendyol = new Trendyol();

    Morhipo morhipo=new Morhipo();

    @Test
    public void test01() {
        //- Google'a gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("googleURL"));
        // - trendyol'u aratınız
        google.googleAramaKutusu.sendKeys("trendyol" + Keys.ENTER);
        // - trendyol linkini bulup siteye gidiniz
        google.trendyolLinki.click();
        //cookies kabul edin
        trendyol.cookiesKabulEt.click();
        //- makas aratınız
        trendyol.aramaKutusu.sendKeys("makas", Keys.ENTER);
        //- toplam ürün sayısını alınız
        String trendyolMakas = trendyol.makasAramaSonucYazisi.getText();
        String[] kelimeler = trendyolMakas.split(" ");
        int trendyolMakasSonuc = Integer.parseInt(kelimeler[3]);
        String trendyolTittle=Driver.getDriver().getTitle();
        //- yeni sekmede morhipo'ya gidiniz
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Set<String> sayfaSet=Driver.getDriver().getWindowHandles();
        List<String> sayfaList=new ArrayList<>(sayfaSet);
        Driver.getDriver().switchTo().window(sayfaList.get(1)).get(ConfigReader.getProperty("morhipoURL"));
        String morhipoTittle=Driver.getDriver().getTitle();
        //- makas aratınız
        morhipo.aramaKutusu.sendKeys("makas",Keys.ENTER);
        //- toplam ürün sayısını alınız
        String morhipoMakasYaziSonuc=morhipo.makasSonucYaziElementi.getText();
        int morhipoMakasSayi=Integer.parseInt(morhipoMakasYaziSonuc);
        //- iki sitedeki topla makas sayısını karşılaştırınız
        //- Önce ürün sayısı fazla olan siteyi kapatınız
        if (morhipoMakasSayi>trendyolMakasSonuc){
            Driver.closeDriver();

        }else{
            ReusableMethods.switchToWindow(trendyolTittle);
            Driver.closeDriver();
        }
        //- Sonra diğer sayfayıda kapatınız
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandle());
        Driver.closeDriver();
    }
}

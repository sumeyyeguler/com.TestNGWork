package tests.practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.PractisePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class ToDoList {
    PractisePage practise = new PractisePage();

    @Test
    public void test() {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("webdriverUniversityToDoURL"));
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        List<String> todoListesi = Arrays.asList("Kahvaltıyı hazırla", "Bulaşıkları yıka", "Bebekle ilgilen",
                "Çocuğunun ödevine yardım et", "Selenyum çalış", "uyu");
        for (String each : todoListesi
        ) {
            practise.addNewToDo.sendKeys(each, Keys.ENTER);
        }
        //Tüm yapılacakların üzerini çiz.


        //Tüm yapılacakları sil.
        for (WebElement each : practise.todoListesi
        ) {
            each.click();
        }
        //Tüm yapılacakların silindiğini doğrulayın.
    }
}

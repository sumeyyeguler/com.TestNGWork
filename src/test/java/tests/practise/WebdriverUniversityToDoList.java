package tests.practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.PractisePage;
import pages.WebUniversityPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class WebdriverUniversityToDoList {
    WebUniversityPages webUniversityPages = new WebUniversityPages();

    @Test
    public void test() {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("webdriverUniversityToDoURL"));
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        List<String> todoListesi = Arrays.asList("Kahvaltıyı hazırla", "Bulaşıkları yıka", "Bebekle ilgilen",
                "Çocuğunun ödevine yardım et", "Selenyum çalış", "uyu");


        for (String each : todoListesi
        ) {
            webUniversityPages.addNewToDo.sendKeys(each, Keys.ENTER);
        }

        //lambda ile --> todoList.forEach(t->webUniversityPage.addNewTodo.sendKeys(t, Keys.ENTER));
        //Tüm yapılacakların üzerini çiz.
        List<WebElement> todos = webUniversityPages.drawTodos;
        for (WebElement each : todos
        ) {
            each.click();
        }

        //Tüm yapılacakları sil.

        for (WebElement each : webUniversityPages.todoListesi
        ) {
            each.click();
        }
        //Tüm yapılacakların silindiğini doğrulayın.
    }
}

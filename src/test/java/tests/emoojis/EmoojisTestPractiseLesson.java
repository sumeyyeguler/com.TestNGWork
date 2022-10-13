package tests.emoojis;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.EmoojisPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class EmoojisTestPractiseLesson {

    EmoojisPage emoojis = new EmoojisPage();

    @Test
    public void test01() {

        // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        Driver.getDriver().get(ConfigReader.getProperty("emoojisURL"));
        // ikinci emojiye tıklayın (hayvan emojisini seçin)
        WebElement iframeElementi = emoojis.iframe;
        Driver.getDriver().switchTo().frame(iframeElementi);
        emoojis.hayvanEmojiSecim.click();
        // tüm hayvan emojilerine tıklayın
        List<WebElement> hayvanEmojiElementleri = emoojis.tumHayvanEmojileriList;
        for (WebElement each : hayvanEmojiElementleri
        ) {
            each.click();
        }

        Driver.getDriver().switchTo().defaultContent();
        // formu doldurun (dilediğinizi yazabilirsiniz)
        List<WebElement> textKutuElementleri = emoojis.textKutulari;
       /* List<String> texts = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
        for (int i = 0; i < textKutuElementleri.size(); i++) {//boxun size ına kadar gel diyorum.
            textKutuElementleri.get(i).sendKeys(texts.get(i));
        }

        */
        Faker faker=new Faker();
        for (int i = 0; i < textKutuElementleri.size() ; i++) {
            textKutuElementleri.get(i).sendKeys(faker.lorem().word());
        }
        // apply butonuna tıklayın
        emoojis.applyButonu.click();

    }
}

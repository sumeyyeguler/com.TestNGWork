package tests.emoojis;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Emoojis;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class EmoojisTest {
    Emoojis emoji = new Emoojis();

    @Test
    public void test01() {
        // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        Driver.getDriver().get(ConfigReader.getProperty("emoojisURL"));
        // ikinci emojiye tıklayın (hayvan emojisini seçin)
        Driver.getDriver().switchTo().frame(emoji.iframe);
        emoji.hayvanEmojiSecim.click();
        // tüm hayvan emojilerine tıklayın
        List<WebElement> emojiList = emoji.tumHayvanEmojileriList;
        for (WebElement each : emojiList
        ) {
            each.click();
        }
        Driver.getDriver().switchTo().defaultContent();
        // formu doldurun (dilediğinizi yazabilirsiniz)
        // apply butonuna tıklayın
        Faker faker = new Faker();
        Actions actions=new Actions(Driver.getDriver());
       actions.click(emoji.textKutusu)
                .sendKeys(faker.lorem().word())
                .sendKeys(Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word()
                ,Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word()
                ,Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word(),Keys.TAB,faker.lorem().word(),Keys.TAB,Keys.ENTER).perform();


    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EmoojisPage {
    public EmoojisPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//iframe[@id='emoojis']")
    public WebElement iframe;

    @FindBy(xpath = "(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")
    public WebElement hayvanEmojiSecim;

    @FindBy(xpath = "//*[@id='nature']/div/img")
    public List<WebElement> tumHayvanEmojileriList;

    @FindBy(xpath = "//*[@id='text']")
    public WebElement textKutusu;

    @FindBy(xpath = "//input[@class='mdl-textfield__input']")
    public List<WebElement> textKutulari;

    @FindBy(xpath = "//button[@id='send']")
    public WebElement applyButonu;
}

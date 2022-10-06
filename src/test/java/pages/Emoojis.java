package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Emoojis {
    public Emoojis() {
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
}

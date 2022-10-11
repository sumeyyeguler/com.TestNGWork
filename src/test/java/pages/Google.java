package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Google {
    public Google() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleAramaKutusu;

    @FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
    public WebElement trendyolLinki;

    @FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
    public WebElement morhipoLinki;
}

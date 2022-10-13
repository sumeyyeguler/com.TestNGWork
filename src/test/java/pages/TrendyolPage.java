package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {
    public TrendyolPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='KABUL ET']")
    public WebElement cookiesKabulEt;

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapSagUst;

    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[4]")
    public WebElement kullaniciGirisYap;

    @FindBy(xpath = "//div[@id='error-box-wrapper']")
    public WebElement hataliKullaniciGirisUyarisi;

    @FindBy(xpath = "//*[text()='Ev & Mobilya']")
    public WebElement evVeMobilya;

    @FindBy (linkText = "Avize")
    public WebElement avize;

    @FindBy(xpath = "//img[@alt='Aydınlatmada İndirim Zamanı']")
    public WebElement aydinlatmadaIndirimZamani;

    @FindBy(xpath = "(//span[@class='prdct-desc-cntnr-name hasRatings'])[1]")
    public WebElement avizeIlkUrun;

    @FindBy(xpath = "(//span[@class='prdct-desc-cntnr-name hasRatings'])[2]")
    public WebElement avizeIkinciUrun;


    @FindBy(xpath = "//div[@class='add-to-basket-button-text']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "(//*[text()='Sepetim'])[1]")
    public WebElement sepetim;

    @FindBy (className = "vQI670rJ")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//div[@class='dscrptn']")
    public WebElement makasAramaSonucYazisi;
}

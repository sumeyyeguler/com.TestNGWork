package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trendyol {
    public Trendyol() {
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

    @FindBy(xpath = "//*[text()='Avize']")
    public WebElement avize;

    @FindBy(xpath = "//img[@alt='Aydınlatmada İndirim Zamanı']")
    public WebElement aydinlatmadaIndirimZamani;

    @FindBy(xpath = "(//img[@class='p-card-img'])[1]")
    public WebElement avizeIlkUrun;

    @FindBy(xpath = "(//img[@class='p-card-img'])[2]")
    public WebElement avizeIkinciUrun;


    @FindBy(xpath = "//*[@class='add-to-basket']")
    public WebElement sepeteEkle;
}

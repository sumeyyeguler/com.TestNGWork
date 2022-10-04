package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {
    /*
     (pages oluşturduğumuzda ilk yapmamız gerekn şey public constructor oluşturmaktır.
    ve constructor içinde kullanacağımız driverı tanıtmamız gerekecektir.)
    ORN:  public constructor(){
         PageFactory.initElements(Driver.getDriver(),this);}

    ORN LOCATE:   @FindBy(id="twotabsearchtextbox")
                    public WebElement  aramaKutusu;
     */
    public HotelMyCamp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"navLogon\"]/a")
    public WebElement login1;

    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement login2;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li/a/span")
    public WebElement managerGorunurlugu;

    @FindBy(xpath = "//*[@id=\"menuHotels\"]/span[1]")
    //*[@id='menuHotels']
    //*[@id="menuHotels"]/span[1]
    public WebElement hotelManagement;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]/a")
    public WebElement hotelList;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]/div/div/div[1]/div[2]/a/span")
    public WebElement addHotel;

    @FindBy(xpath = "//*[@id=\"Code\"]")
    public WebElement addHotelCode;

    @FindBy(xpath = "//*[@id=\"Code\"]")
    public WebElement addHotelID;

    @FindBy(xpath = "//*[@id=\"IDGroup\"]")
    public WebElement addHotelIDGroup;

    @FindBy(xpath = "//*[@id=\"IDGroup\"]/option[2]")
    public WebElement addHotelIDGroupOption1;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement addHotelLogin;

    @FindBy(xpath = "//*[text()='Hotel was inserted successfully']")
    public WebElement uyariPaneli;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement uyariPaneliOK;


}

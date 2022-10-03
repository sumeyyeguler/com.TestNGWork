package pages;

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


}

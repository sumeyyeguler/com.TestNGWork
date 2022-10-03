package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    /*
     (pages oluşturduğumuzda ilk yapmamız gerekn şey public constructor oluşturmaktır.
    ve constructor içinde kullanacağımız driverı tanıtmamız gerekecektir.)
    ORN:  public constructor(){
         PageFactory.initElements(Driver.getDriver(),this);}

    ORN LOCATE:   @FindBy(id="twotabsearchtextbox")
                    public WebElement  aramaKutusu;
     */
    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextKutusu;

    @FindBy (xpath = "//*[@id=\"pass\"]")
    public WebElement passwordTextKutusu;

    @FindBy (xpath = "//button[@value='1']")
    public WebElement loginButonu;

    @FindBy (xpath = "//*[@id=\"login_link\"]/div/a")
    public WebElement sifremiUnuttum;




}

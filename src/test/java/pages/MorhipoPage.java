package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MorhipoPage {
    public MorhipoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id='pw-search-input']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@id='total-product-count']")
    public WebElement makasSonucYaziElementi;
}

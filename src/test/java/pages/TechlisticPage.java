package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechlisticPage {

    public TechlisticPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Tamam']")
    public WebElement cookiesOK;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameElementi;

    @FindBy(xpath = "//input[@id='sex-0']")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@id='exp-6']")
    public WebElement experience7;

    @FindBy(xpath = "//input[@id='datepicker']")
    public WebElement date;

    @FindBy(xpath = "//input[@id='profession-1']")
    public WebElement tester;

    @FindBy(xpath = "//input[@id='tool-2']")
    public WebElement webdriver;

    @FindBy(xpath = "//select[@id='continents']")
    public WebElement dropDownContinent;

    @FindBy(xpath = "//select[@id='selenium_commands']/option[1]")
    public WebElement commands;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement button;
}

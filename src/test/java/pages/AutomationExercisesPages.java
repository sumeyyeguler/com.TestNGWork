package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisesPages {
    public AutomationExercisesPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement prouducts;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProducts;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//p[text()='Blue Top']")
    public WebElement blueTopProduct;
}

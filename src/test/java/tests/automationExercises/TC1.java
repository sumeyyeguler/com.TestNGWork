package tests.automationExercises;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisesPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC1 {
    AutomationExercisesPages automationExercisesPages=new AutomationExercisesPages();
    @Test
    public void test() {
        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationURL"));
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        ReusableMethods.waitFor(1);
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),homeUrl);
        // 4. 'Ürünler' butonuna tıklayın
        automationExercisesPages.prouducts.click();
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(automationExercisesPages.allProductsText.isDisplayed());
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        automationExercisesPages.searchProducts.sendKeys("blue top");
        automationExercisesPages.searchButton.click();
        // 7. 'Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Assert.assertTrue(automationExercisesPages.blueTopProduct.isDisplayed());


    }
}

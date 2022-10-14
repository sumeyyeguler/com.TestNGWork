package tests.practise;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPages;
import utilities.ConfigReader;
import utilities.Driver;

public class DhtmlgoodiesDrogAndDrop {

    DhtmlgoodiesPages dhtmlgoodiesPages = new DhtmlgoodiesPages();

    @Test
    public void test() {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get(ConfigReader.getProperty("dhtmlgoodiesURL"));
        // Fill in capitals by country.
       Actions actions=new Actions(Driver.getDriver());
       actions.dragAndDrop(dhtmlgoodiesPages.oslo, dhtmlgoodiesPages.norwey)
               .dragAndDrop(dhtmlgoodiesPages.stockholm,dhtmlgoodiesPages.sweden)
               .dragAndDrop(dhtmlgoodiesPages.washington, dhtmlgoodiesPages.unitedStates)
               .dragAndDrop(dhtmlgoodiesPages.copenhagen, dhtmlgoodiesPages.denmark)
               .dragAndDrop(dhtmlgoodiesPages.seoul, dhtmlgoodiesPages.southKorea)
               .dragAndDrop(dhtmlgoodiesPages.rome, dhtmlgoodiesPages.italy)
               .dragAndDrop(dhtmlgoodiesPages.madrid, dhtmlgoodiesPages.spain).perform();
    }
}

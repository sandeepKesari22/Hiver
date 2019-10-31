package pageLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class GenericLib {
    Utils utils;

    public GenericLib(WebDriver driver){
        utils= new Utils(driver);
    }
    public void switchTabs(WebDriver driver, int tabNumber){
        utils.switchTab(driver, tabNumber);

    }

    public String getText(WebDriver driver, String xpath){

        return utils.text(driver,xpath);
    }
}

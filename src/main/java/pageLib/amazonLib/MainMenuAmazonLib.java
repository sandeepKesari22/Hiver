package pageLib.amazonLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageObject.amazon.MainMenuPage;

public class MainMenuAmazonLib extends MainMenuPage {
    Utils utils;

    public MainMenuAmazonLib(WebDriver driver){
        utils= new Utils(driver);
    }
    public void enterStringInSearchBox(WebDriver driver, String mobileName){
        utils.enterText(driver,getSearchBox(), mobileName);
    }

    public void clickOnSearch(WebDriver driver){
        utils.click(getSearchbutton(), driver);
    }
}

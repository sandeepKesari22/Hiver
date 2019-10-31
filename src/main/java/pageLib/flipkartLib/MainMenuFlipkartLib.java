package pageLib.flipkartLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageObject.flipkart.MainMenuPage;

public class MainMenuFlipkartLib extends MainMenuPage {
    Utils utils;
    public MainMenuFlipkartLib(WebDriver driver){
        utils= new Utils(driver);

    }
    public void mouseHoverElectronics(WebDriver driver){
        utils.mouseHover(getElectronics(), driver);
    }

    public void clickingMobileFromDropDown(WebDriver driver){
        utils.click(getMobileXpath(),driver);
    }

    public void enterStringInSearchBox(WebDriver driver, String mobileName){
        utils.enterText(driver,getSearchBox(), mobileName);
    }

    public void clickOnSearch(WebDriver driver){
        utils.click(getSearchButton(), driver);
    }
}

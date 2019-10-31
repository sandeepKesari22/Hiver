package pageLib.flipkartLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageLib.GenericLib;
import pageObject.flipkart.CartPage;

public class CartPageFlipkartLib extends CartPage {
    Utils utils;
    GenericLib genericLib;
    public CartPageFlipkartLib(WebDriver driver){
        utils= new Utils(driver);
        genericLib= new GenericLib(driver);
    }

    public void addItemCount(WebDriver driver){
        utils.click(getAddItems(), driver);
    }

    public String gettotalPayable(WebDriver driver){
        utils.waitForElementPresence(getTotal_Payable());
        return genericLib.getText(driver, getTotal_Payable());
    }
}

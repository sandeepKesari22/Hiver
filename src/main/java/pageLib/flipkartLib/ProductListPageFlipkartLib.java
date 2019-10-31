package pageLib.flipkartLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageObject.flipkart.ProductListPage;

public class ProductListPageFlipkartLib extends ProductListPage {
    Utils utils;

    public ProductListPageFlipkartLib(WebDriver driver){
        utils = new Utils(driver);
    }

    public void clickingOnItemInList(WebDriver driver){
        utils.click(getMobileName(),driver);
    }




}

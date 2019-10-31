package pageLib.amazonLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageObject.amazon.ProductListPage;

public class ProductListPageAmazonLib extends ProductListPage {
    Utils utils;

    public ProductListPageAmazonLib(WebDriver driver){
        utils= new Utils(driver);
    }

    public void clickOnProduct(WebDriver driver){
        utils.click(getProductXpath(), driver);
    }


}

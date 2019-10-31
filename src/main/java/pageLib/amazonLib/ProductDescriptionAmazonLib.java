package pageLib.amazonLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageLib.GenericLib;
import pageObject.amazon.ProductDescriptionPage;


public class ProductDescriptionAmazonLib extends ProductDescriptionPage {
   GenericLib genericLib;

    public ProductDescriptionAmazonLib(WebDriver driver){
        genericLib= new GenericLib(driver);
    }

    public int fetchingProductPrice(WebDriver driver){
        String s = genericLib.getText(driver, getProductPriceXpath());
        s = s.replaceAll("\\D", "");
        return Integer.parseInt(s);

    }


}

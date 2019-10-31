package pageLib.flipkartLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageLib.GenericLib;
import pageObject.flipkart.ProductDescriptionPage;

public class ProductDescriptionFlipkartLib extends ProductDescriptionPage {
  Utils utils;
  GenericLib genericLib;

  public ProductDescriptionFlipkartLib(WebDriver driver) {
    utils = new Utils(driver);
    genericLib = new GenericLib(driver);
  }

  public void addingproducttoCart(WebDriver driver) {
    utils.waitForElementPresence(getAdd_to_cart());
    utils.click(getAdd_to_cart(), driver);
  }

  public int fetchingProductPrice(WebDriver driver) {
    String s = genericLib.getText(driver, getProductPrice());
    s = s.replaceAll("\\D", "");
    return Integer.parseInt(s);
  }
}

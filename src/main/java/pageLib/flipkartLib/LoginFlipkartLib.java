package pageLib.flipkartLib;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import pageObject.flipkart.LoginPage;

public class LoginFlipkartLib extends LoginPage {
        Utils utils;
         public LoginFlipkartLib(WebDriver driver){
            utils= new Utils(driver);
        }
    public void closeLoginBox(WebDriver driver){
        utils.click(getLogin_close_button(),driver);
    }

}

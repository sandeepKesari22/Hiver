import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageLib.GenericLib;
import pageLib.amazonLib.MainMenuAmazonLib;
import pageLib.amazonLib.ProductDescriptionAmazonLib;
import pageLib.amazonLib.ProductListPageAmazonLib;
import pageLib.flipkartLib.CartPageFlipkartLib;
import pageLib.flipkartLib.ProductDescriptionFlipkartLib;
import pageLib.flipkartLib.ProductListPageFlipkartLib;
import pageLib.flipkartLib.LoginFlipkartLib;
import pageLib.flipkartLib.MainMenuFlipkartLib;

import java.util.ArrayList;

public class test {
    WebDriver driver;
    LoginFlipkartLib loginFlipkartLib;
    MainMenuFlipkartLib mainMenuFlipkartLib;
    ProductListPageFlipkartLib listPageLib;
    ProductListPageAmazonLib productListPageAmazonLib;
    ProductListPageFlipkartLib productListPageFlipkartLib;
    ProductDescriptionAmazonLib productDescriptionAmazonLib;
    GenericLib genericLib;
    ProductDescriptionFlipkartLib productDescriptionFlipkartLib;
    CartPageFlipkartLib cartPageFlipkartLib;
    MainMenuAmazonLib mainMenuAmazonLib;


    @BeforeSuite
    public void beforeSuite(){
        System.setProperty("webdriver.gecko.driver", "/Users/sandeep/Downloads/geckodriver");
        driver = new FirefoxDriver();
        loginFlipkartLib = new LoginFlipkartLib(driver);
        mainMenuFlipkartLib = new MainMenuFlipkartLib(driver);
        listPageLib = new ProductListPageFlipkartLib(driver);
        genericLib= new GenericLib(driver);
        productDescriptionFlipkartLib = new ProductDescriptionFlipkartLib(driver);
        cartPageFlipkartLib = new CartPageFlipkartLib(driver);
        mainMenuAmazonLib = new MainMenuAmazonLib(driver);
        productListPageAmazonLib = new ProductListPageAmazonLib(driver);
        productDescriptionAmazonLib = new ProductDescriptionAmazonLib(driver);
        productListPageFlipkartLib = new ProductListPageFlipkartLib(driver);
    }

    @Test
    public void assignmentOne() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        loginFlipkartLib.closeLoginBox(driver);
        mainMenuFlipkartLib.mouseHoverElectronics(driver);
        mainMenuFlipkartLib.clickingMobileFromDropDown(driver);
        listPageLib.clickingOnItemInList(driver);
        genericLib.switchTabs(driver, 1);
        Thread.sleep(2000);
        productDescriptionFlipkartLib.addingproducttoCart(driver);
        cartPageFlipkartLib.addItemCount(driver);
    System.out.println(cartPageFlipkartLib.gettotalPayable(driver));
    }

    @Test
    public void assignmentTwo() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        mainMenuAmazonLib.enterStringInSearchBox(driver, "Realme XT (Pearl Blue, 64 GB) (4 GB RAM)");
        mainMenuAmazonLib.clickOnSearch(driver);
        productListPageAmazonLib.clickOnProduct(driver);
        genericLib.switchTabs(driver, 2);
        int priceInAmazon = productDescriptionAmazonLib.fetchingProductPrice(driver);

        //Comparing with Flipkart


        driver.get("https://www.flipkart.com/");
        loginFlipkartLib.closeLoginBox(driver);
        mainMenuFlipkartLib.enterStringInSearchBox(driver, "Realme XT (Pearl Blue, 64 GB)");
        mainMenuFlipkartLib.clickOnSearch(driver);
        productListPageFlipkartLib.clickingOnItemInList(driver);
        genericLib.switchTabs(driver, 3);
        Thread.sleep(2000);
        int priceInFlipkart = productDescriptionFlipkartLib.fetchingProductPrice(driver);
        if(priceInAmazon>priceInFlipkart){
      System.out.println("Price is lesser in Flipkart Rs."+priceInFlipkart);
        }else{
      System.out.println("Price is lesser in Amazon Rs."+priceInAmazon);
        }
    }




    @AfterSuite
    public void tearDown(){

        driver.quit();
    }

}

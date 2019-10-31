package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Utils {
    Actions actions;
    WebDriverWait wait;

    public Utils(){}

    public Utils(WebDriver driver){
        actions= new Actions(driver);
        wait = new WebDriverWait(driver, 10);
    }

    public boolean iselementPresent(String xpath){
        boolean flag =true;
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        if(element1==null){
            flag= false;
        }
        return flag;
    }

    public void mouseHover(String xpath, WebDriver driver){
        Action mousehover = actions.moveToElement(driver.findElement(By.xpath(xpath))).build();
        mousehover.perform();
    }

    public void waitForElementPresence(String xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void click(String xpath, WebDriver driver){
    iselementPresent(xpath);
    driver.findElement(By.xpath(xpath)).click();

    }


    public void switchTab(WebDriver driver, int tabNumber){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles()); //switching to product's detail page in new TAB.
        driver.switchTo().window(tabs2.get(tabNumber));
    }

    public String text(WebDriver driver, String xpath){
        waitForElementPresence(xpath);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void enterText(WebDriver driver, String xpath, String mobile_name){
        driver.findElement(By.xpath(xpath)).sendKeys(mobile_name);
    }
}

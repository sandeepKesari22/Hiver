package pageObject.flipkart;

import lombok.Getter;

@Getter
public class MainMenuPage {
    private String electronics="//span[contains(text(),'Electronics')]";
    private String mobileXpath="//a[text()='Realme XT']";
    private String searchBox="//input[@title='Search for products, brands and more']";
    private String searchButton="//button[@class='vh79eN'][@type='submit']";
}

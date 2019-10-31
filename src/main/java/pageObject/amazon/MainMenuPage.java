package pageObject.amazon;

import lombok.Getter;

@Getter
public class MainMenuPage {
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchbutton = "//*[span[@id='nav-search-submit-text']]/input";
}

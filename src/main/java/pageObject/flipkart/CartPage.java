package pageObject.flipkart;

import lombok.Getter;

@Getter
public class CartPage {
    private String addItems="//button[text()='+']";
    private String total_Payable="//div[@class='_2twTWD']/div[3]//span";
}

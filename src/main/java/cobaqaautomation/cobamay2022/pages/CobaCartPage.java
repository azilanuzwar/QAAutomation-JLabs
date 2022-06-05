package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaCartPage extends CobaBasePage {
	
	By shoppingCart = By.xpath ("//a[@class='shopping_cart_link']");
	By buttonCheckOut = By.xpath("//button[@id='checkout']");
	
	public CobaCartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	public void getCart() {
		clickAndWait (shoppingCart);
	}
	
	public void checkOut() {
		clickAndWait(buttonCheckOut);
	}
}


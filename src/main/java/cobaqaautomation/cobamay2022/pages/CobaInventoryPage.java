package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaInventoryPage extends CobaBasePage {

	By productsText = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By buttonAddToCart = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cartNumber = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	
	//tulisan produk: ;//button[@id='add-to-cart-sauce-labs-backpack']");
	
	
	public CobaInventoryPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
		
	public String getInventoryText() {
		return getText(productsText);
	}
	
	public void addToCart() {
		clickAndWait(buttonAddToCart);
	}
	
	public String getCartNumber() {
		return getText(cartNumber);
	}
}

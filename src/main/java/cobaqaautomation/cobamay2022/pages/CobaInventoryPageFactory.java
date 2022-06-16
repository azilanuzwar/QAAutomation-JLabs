package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaInventoryPageFactory extends CobaBasePage {

	//@FindBy(xpath = "//span[@class='title']")
	By productsText = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By buttonAddToCart = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cartNumber = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	
	
	public CobaInventoryPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver.get(),this);
		}
	
	//public String getInventoryText() {
		//By inventoryText;
		//return getText(productsText);
	}



package cobaqaautomation.cobamay2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import cobaqaautomation.cobamay2022.pages.CobaLoginPageFactory;
import cobaqaautomation.cobamay2022.pages.CobaCartPage;
import cobaqaautomation.cobamay2022.pages.CobaCheckOutStep1Page;
import cobaqaautomation.cobamay2022.pages.CobaCheckOutStep2Page;
import cobaqaautomation.cobamay2022.pages.CobaInventoryPage;

public class CobaWebTestAfterPageFactory extends CobaBaseWebTest{
	
			
		CobaCartPage cartPage = new CobaCartPage (driver, explicitWait);
		CobaCheckOutStep1Page informationPage = new CobaCheckOutStep1Page (driver, explicitWait);
		CobaCheckOutStep2Page overviewPage = new CobaCheckOutStep2Page (driver, explicitWait);
		
	@Test
	public void testLogin() {	
		
		CobaLoginPageFactory loginPage = new CobaLoginPageFactory (driver, explicitWait);
		CobaInventoryPage inventoryPage = new CobaInventoryPage (driver, explicitWait);
		
		String username = "standard_user";
		String password = "secret_sauce";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		
		String actualText = inventoryPage.getInventoryText();
		String expectedText = "PRODUCTS";
		Assert.assertTrue(actualText.contains(expectedText));    
	    	    	  
	}
}
	
//	@Test
//	public void testLoginFailedWrongPassword () {
//		
//		String username = "standard_user";
//		String password = "secret_saucC";
//		
//		loginPage.inputUsername(username);
//		loginPage.inputPassword(password);
//		loginPage.clickLoginButton();
//		
//		String actualText = loginPage.getTextError();
//	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
//	    
//	    Assert.assertTrue(actualText.contains(expectedText));
//	}
//	
//	@Test
//	public void testLoginFailedWrongUsername () {
//
//		String username = "standard_azila";
//		String password = "secret_sauce";
//		
//		loginPage.inputUsername(username);
//		loginPage.inputPassword(password);
//		loginPage.clickLoginButton();
//		
//		String actualText = driver.get().findElement(By.xpath("//h3[@data-test='error']")).getText();
//	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
//	    
//	    Assert.assertTrue(actualText.contains(expectedText));
//
//	}
//	
//	@Test
//	public void testLoginFailedWrongUsernameandPassword() {
//		
//		String username = "standard_azila";
//		String password = "secret_azila";
//		
//		loginPage.inputUsername(username);
//		loginPage.inputPassword(password);
//		loginPage.clickLoginButton();
//		
//	    String actualText = driver.get().findElement(By.xpath("//h3[@data-test='error']")).getText();
//	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
//	    
//	    Assert.assertTrue(actualText.contains(expectedText));
//	}
//	
//	@Test
//	public void testAddProducts() { 
//	//pada CobaInventoryPage
//		String username = "standard_user";
//		String password = "secret_sauce";
//		
//		loginPage.loginWeb(username, password);
//		inventoryPage.addToCart();
//		
//		String actualText = inventoryPage.getCartNumber();
//		
//		String expectedText = "1";
//	    
//	    Assert.assertTrue(actualText.contains(expectedText));
//	}
//	
//	@Test
//	public void checkOut () {
//	//pada CobaCartPage
//		String username = "standard_user";
//		String password = "secret_sauce";
//		
//		loginPage.loginWeb(username, password);
//		inventoryPage.addToCart();
//		
//		cartPage.getCart();
//		String actualText = driver.get().findElement(By.xpath("//span[@class='title']")).getText();
//	    String expectedText = "YOUR CART";
//	    Assert.assertTrue(actualText.contains(expectedText));
//	    
//	    cartPage.checkOut();
//	    
//	}
//	@Test
//	public void yourInformation () {
//		String username = "standard_user";
//		String password = "secret_sauce";
//		
//		loginPage.loginWeb(username, password);
//		inventoryPage.addToCart();
//		cartPage.getCart();
//	    cartPage.checkOut();
//	    
//	    String actualText = driver.get().findElement(By.xpath("//span[@class='title']")).getText();
//	    String expectedText = "CHECKOUT: YOUR INFORMATION";
//	    Assert.assertTrue(actualText.contains(expectedText));
//	} 
//	
//	@Test
//	public void checkOutOverview () {
//		String username = "standard_user";
//		String password = "secret_sauce";
//		
//		loginPage.loginWeb(username, password);
//		inventoryPage.addToCart();
//		cartPage.getCart();
//	    cartPage.checkOut();
//	    
//	    String firstName = "Azila";
//		String lastName = "Nuzwar";
//		String postalCode = "201197";
//		
//		informationPage.yourInformation(firstName, lastName, postalCode);
//				
//		String actualText = driver.get().findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[3]")).getText();
//		System.out.println(actualText);
//		String expectedText = "Shipping Information:";
//	 	Assert.assertTrue(actualText.contains(expectedText));
//	    
//	 	overviewPage.buttonFinish();
//	 	
//	 	String actualText2 = driver.get().findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText();
//		System.out.println(actualText);
//		String expectedText2 = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
//	 	Assert.assertTrue(actualText2.contains(expectedText2));
//	}
//}

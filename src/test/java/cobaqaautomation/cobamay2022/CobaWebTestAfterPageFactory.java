package cobaqaautomation.cobamay2022;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import cobaqaautomation.cobamay2022.pages.CobaLoginPageFactory;
import cobaqaautomation.cobamay2022.pages.CobaInventoryPageFactory;

public class CobaWebTestAfterPageFactory extends CobaBaseWebTest{

	@Test
	public void testLogin() {
		
		CobaLoginPageFactory loginPage = new CobaLoginPageFactory (driver, explicitWait);
		CobaInventoryPageFactory profilePage = new CobaInventoryPageFactory (driver, explicitWait);
		String username = "standard_user";
		String password = "secret_sauce";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "PRODUCTS";

	    
	}
	
}

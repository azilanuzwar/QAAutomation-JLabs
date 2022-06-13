package cobaqaautomation.cobamay2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cobaqaautomation.cobamay2022.pages.LoginPage;
import cobaqaautomation.cobamay2022.utils.BrowserFactory;

public class VerifyValidLogin {

	@Test
	public void checkValidUser() {
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/)");
	
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	
	login_page.loginSaucedemo("standard_user", "secret_sauce");
	
	
	
	}
	
	
	
}

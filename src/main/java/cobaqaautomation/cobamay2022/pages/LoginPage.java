package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver ldriver)
	{
		this.driver=ldriver;
	}


	@FindBy (id="/'user-name'/")
	WebElement username;
	
	@FindBy (xpath = "//input[@id='password']")
	WebElement password; 
	
	@FindBy (xpath = "//input[@id='login-button']")
	WebElement submit_button;	

	public void loginSaucedemo (String usr, String pass) {
		
		username.sendKeys(usr);
		password.sendKeys(pass);
		submit_button.click();
	}
}
	
	
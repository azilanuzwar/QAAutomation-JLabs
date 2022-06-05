package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaLoginPage extends CobaBasePage {
	
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id=\"password\"]");
	By loginBtn = By.xpath("//input[@id='login-button']");
	
	public CobaLoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	public void loginWeb(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		clickAndWait(loginBtn);
	}
	
	
}

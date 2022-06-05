package cobaqaautomation.cobamay2022.yopmailpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailLoginPage extends YopmailBasePage{
	
	By username = By.xpath("//input[@id='login']");
	By loginBtn = By.xpath("//i[@class='material-icons-outlined f36']");

	public YopmailLoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	public void loginWeb(String user) {
		setText(username, user);
		clickAndWait(loginBtn);
	}
}

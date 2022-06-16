package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaLoginPageFactory extends CobaBasePage {
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//h3[@data-test='error']")
	WebElement errorLogin;
	
	
	public CobaLoginPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}
	public void loginWeb(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public void inputUsername(String user) {
		username.sendKeys(user);
	}
	
	public void inputPassword(String pass) {
		password.sendKeys(pass);
		
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	public String getTextError() {
		// TODO Auto-generated method stub
		return errorLogin.getText();
	}
}

package cobaqaautomation.cobamay2022.yopmailpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailBasePage {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	public YopmailBasePage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
		
	}
	public void clickAndWait(By locator) {
		explicitWait.get().until(ExpectedConditions.elementToBeClickable(locator));
		driver.get().findElement(locator).click();
	
	}
	public void setText(By locator, String text) {
		explicitWait.get().until(ExpectedConditions.elementToBeClickable(locator));
		driver.get().findElement(locator).sendKeys(text);
	
	}
	public String getText(By locator) {
		explicitWait.get().until(ExpectedConditions.elementToBeClickable(locator));
		return driver.get().findElement(locator).getText(); 
		
	}
}

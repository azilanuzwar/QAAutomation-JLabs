package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaCheckOutStep2Page extends CobaBasePage{

	By btnFinish = By.xpath("//button[@id='finish']");
	
	public CobaCheckOutStep2Page(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	public void buttonFinish() {
		clickAndWait(btnFinish);
		
	}
}



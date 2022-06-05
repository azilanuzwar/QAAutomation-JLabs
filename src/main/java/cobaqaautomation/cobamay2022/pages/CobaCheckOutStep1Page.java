package cobaqaautomation.cobamay2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CobaCheckOutStep1Page extends CobaBasePage{
		
		By firstNameInput = By.xpath ("//input[@id='first-name']");
		By lastNameInput = By.xpath("//input[@id='last-name']");
		By postalCodeInput = By.xpath("//input[@id='postal-code']");
		By buttonContinue = By.xpath("//input[@id='continue']");
		
		public CobaCheckOutStep1Page(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
			super(driver, explicitWait);
			// TODO Auto-generated constructor stub
		}
		public void yourInformation(String firstName, String lastName, String postalCode) {
			setText(firstNameInput, firstName);
			setText(lastNameInput, lastName);
			setText(postalCodeInput, postalCode);
			clickAndWait(buttonContinue);
		}
}



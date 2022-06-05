package cobaqaautomation.cobamay2022.yopmail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import cobaqaautomation.cobamay2022.yopmailpages.*;

public class BaseWebTestAfterPOM extends BaseWebTest{

	YopmailLoginPage loginPage = new YopmailLoginPage (driver, explicitWait);
	YopmailCommonPage commonPage = new YopmailCommonPage (driver, explicitWait);
	
	@Test
	public void testLogin () {
		
		String username = "azilanuzwar";
			
		loginPage.loginWeb(username);
		
		String actualText = driver.get().findElement(By.xpath("//div[@class='bname']")).getText();
	    String expectedText = username + "@yopmail.com";
	    
	    Assert.assertTrue(actualText.contains(expectedText)); 
	    
	}
	
	@Test
	public void testSwitchFrame () {
		
		String username = "azilanuzwar";
		String idFrame = "ifmail";
			
		loginPage.loginWeb(username);
		commonPage.switchFrame(idFrame);
		
		
		String actualText = driver.get().findElement(By.xpath("//*[@id=\"mail\"]/div")).getText();
	    String expectedText = "Tugas 5 ialah bikin automation test untuk switch to Iframe";
	    
	    System.out.println(actualText);
	    
	    Assert.assertTrue(actualText.contains(expectedText)); 
	}
}
	
	
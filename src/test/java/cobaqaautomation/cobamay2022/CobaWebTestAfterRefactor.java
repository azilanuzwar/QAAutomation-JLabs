package cobaqaautomation.cobamay2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test; //agar muncul ini, import di @Test

public class CobaWebTestAfterRefactor extends CobaBaseWebTest{
	
	@Test
	public void testLogin () {
	    
	    driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.get().findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.get().findElement(By.xpath("//span[@class='title']")).getText();
	    String expectedText = "PRODUCTS";
	    
	    Assert.assertTrue(actualText.contains(expectedText));	    	  
	}
	
	@Test
	public void testLoginFailedWrongPassword () {
		
	    driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.get().findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_saucC");
	    driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.get().findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
	    
	    Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void testLoginFailedWrongUsername () {

	    driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_azila");
	    driver.get().findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.get().findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
	    
	    Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void testLoginFailedWrongUsernameandPassword() {
		
	    driver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_azila");
	    driver.get().findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_saucC");
	    driver.get().findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.get().findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
	    
	    Assert.assertTrue(actualText.contains(expectedText));
	}
}



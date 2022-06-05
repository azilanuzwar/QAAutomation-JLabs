package cobaqaautomation.cobamay2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //harus ditambahkan di dependency nya
import org.openqa.selenium.chrome.ChromeDriver; //import dari baris ke 16
import org.testng.Assert;
import org.testng.annotations.Test; //agar muncul ini, import di @Test

import io.github.bonigarcia.wdm.WebDriverManager; //akan langsung ter import saat baris ke 14 ditambahkan

public class CobaWebTest {

	@Test
	public void testLogin () {
		WebDriver driver;
		
	    WebDriverManager.chromedriver().setup();                 
	    driver = new ChromeDriver(); //inisiasi untuk buka chrome nya
	    driver.get("https://www.google.com/");
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.findElement(By.xpath("//span[@class='title']")).getText();
	    String expectedText = "PRODUCTS";
	    Assert.assertTrue(actualText.contains(expectedText));
	    
	    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    driver.findElement(By.xpath("//button[@id='checkout']")).click();
	    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Azila");
	    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Nuzwar");
	    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	    driver.findElement(By.xpath("//button[@id='finish']")).click();
	    String actualText1 = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	    String expectedText1 = "THANK YOU FOR YOUR ORDER";
	    Assert.assertTrue(actualText1.contains(expectedText1));
	    
	    driver.quit();
	  
	}
	
	@Test
	public void testLoginFailedWrongPassword () {
		WebDriver driver;
		
	    WebDriverManager.chromedriver().setup();                 
	    driver = new ChromeDriver(); //inisiasi untuk buka chrome nya
	    driver.get("https://www.google.com/");
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_saucC");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
	    
	    Assert.assertTrue(actualText.contains(expectedText));
	    driver.quit();
	}
	
	@Test
	public void testLoginFailedWrongUsername () {
		WebDriver driver;
		
	    WebDriverManager.chromedriver().setup();                 
	    driver = new ChromeDriver(); //inisiasi untuk buka chrome nya
	    driver.get("https://www.google.com/");
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_azila");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
	    
	    Assert.assertTrue(actualText.contains(expectedText));
	    driver.quit();
	}
	
	@Test
	public void testLoginFailedWrongUsernameandPassword() {
		WebDriver driver;
		
	    WebDriverManager.chromedriver().setup();                 
	    driver = new ChromeDriver(); //inisiasi untuk buka chrome nya
	    driver.get("https://www.google.com/");
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_azila");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_saucC");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    String actualText = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    String expectedText = "Epic sadface: Username and password do not match any user in this service";
	    
	    Assert.assertTrue(actualText.contains(expectedText));
	    driver.quit();
	}
}



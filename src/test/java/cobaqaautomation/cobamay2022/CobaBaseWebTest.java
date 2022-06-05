package cobaqaautomation.cobamay2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //harus ditambahkan di dependency nya
import org.openqa.selenium.chrome.ChromeDriver; //import dari baris ke 16
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; //agar muncul ini, import di @Test

import io.github.bonigarcia.wdm.WebDriverManager; //akan langsung ter import saat baris ke 14 ditambahkan

public class CobaBaseWebTest {
	
		ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
		ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
		
		@BeforeMethod
		public void setUp() {
			
		    WebDriverManager.chromedriver().setup(); 
		    driver.set(new ChromeDriver()); //inisiasi untuk buka chrome nya
		    explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
		    driver.get().manage().window().maximize();
		   // driver.get().get("https://www.google.com/");
		    driver.get().get("https://www.saucedemo.com/");
		}

		@AfterMethod
		public void tearDown() {
			
			driver.get().quit();
		}
}

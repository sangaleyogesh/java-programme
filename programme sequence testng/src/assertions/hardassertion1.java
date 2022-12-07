package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hardassertion1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
	}
	//asser.assertrue
	
	@Test
	public void loginpage() {
		WebElement username=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
	    WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
	    
	    Assert.assertTrue(username.isDisplayed());
	    username.sendKeys("GP8097");
	    
	    Assert.assertTrue(password.isDisplayed());
	    password.sendKeys("gms@0110");
	    
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	//Assert.assertequals
	
	@Test
	public void loginpage1() {
		
		boolean logintokite=driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).isDisplayed();
	
		Assert.assertTrue(true);
		Assert.assertEquals(true, logintokite);
	
	}
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	
}


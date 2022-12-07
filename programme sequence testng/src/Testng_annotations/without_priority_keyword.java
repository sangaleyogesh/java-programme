package Testng_annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class without_priority_keyword {
	WebDriver driver;
	
	//without priority test casese wiil be executing in Alphabatical order
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@Test
	public void title() {
		String title=driver.getTitle();
		System.out.println(title);	
	}
	@Test
	public void logintokite() {
		
		boolean b=driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).isDisplayed();
		
		System.out.println(b);
	}
	@Test
	public void forgetuserid() {
		
		boolean b=driver.findElement(By.xpath("//a[contains(text(),\"Forgot user ID or password?\")]")).isDisplayed();
	
		System.out.println(b);
	}
	@Test
	
	public void loginbutton() {
		boolean b=driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		System.out.println(b);
	}
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
}

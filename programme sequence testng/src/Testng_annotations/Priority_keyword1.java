package Testng_annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_keyword1 {

	//by using the priority the test cases will be executing as per the given priority
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		}
	@Test(priority=1)
	public void logo() {
		boolean b=driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
	System.out.println(b);	
	}
	@Test(priority=2)
	public void loginbutton() {
		
		boolean b=driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		System.out.println(b);
	}
	@Test(priority=3)
	public void logintokite() {
	
	boolean b=driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).isDisplayed();
	}
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}


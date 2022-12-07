package Testng_annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groups_keyword5 {
	
	//groups keyword use to grouping the test cases ,if there is multiple test cases that time grouping is needed
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(priority=1,groups="title")
	public void title() {
		
	String title=driver.getTitle();	
	System.out.println(title);	
	}
	@Test(priority=2,groups="title")
	public void loginbutton() {
		
	String forgotlink=driver.findElement(By.xpath("//a[@class=\"text-light forgot-link\"]")).getText();	
	}
	@Test(priority=3,groups="logo")
	public void logo() {
	driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();	
		
	}
	@Test(priority=4,groups="logo")
	public void test4() {
		System.out.println("test4");
	}
	@Test(priority=5,groups="test")
	public void test5() {
		System.out.println("test5");
	}
	@Test(priority=6,groups="test")
	public void test6() {
		System.out.println("test6");
	}
	@AfterMethod
	public void teardown() {
		
	driver.quit();	
	}
}

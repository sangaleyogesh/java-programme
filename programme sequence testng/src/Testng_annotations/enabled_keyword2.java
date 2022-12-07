package Testng_annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class enabled_keyword2 {
	
	//eneble keyword is use to disable or enable keyword
	//@Test(enable=false) test case is disable
	//@Test(enable-true) test case is enable,by default test case is enebled
	//it is use when we require to execute only spcific test cases
	
	@SuppressWarnings("deprecation")
	WebDriver driver; //declaration of webdriver globally
	@BeforeMethod
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(enabled=true)
	public void logo() {
		
	boolean b=driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
	
	System.out.println(b);
	}
	@Test(enabled=false)  //test case is disabled so not appearing in the test report
	
	public void logintokite() {
	
	boolean b=driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).isDisplayed();
	System.out.println(b);
	}
	@Test(enabled=true)
	
	public void forgotuserid(){
		
	String text=driver.findElement(By.xpath("//a[contains(text(),\"Forgot user ID or password?\")]")).getText();	
	
	System.out.println(text);
	}
	@AfterMethod(enabled=true)
	
	public void teardown() {

		driver.quit();
	}
	
}

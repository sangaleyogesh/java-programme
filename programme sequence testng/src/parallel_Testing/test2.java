package parallel_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void test1() {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	 
	 driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

public 	void test2() {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	 driver.get("https://kite.zerodha.com/");
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
}
	
	
}

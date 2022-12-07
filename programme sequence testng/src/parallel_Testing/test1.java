package parallel_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

   public class test1 {
	//parallel testing --to run test cases parallel that time performing the parallel testing,it will save lot of time of tester
	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

}
}

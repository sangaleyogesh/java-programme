package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {
	
	public static void main(String[]args) {
		//mostly use of implicit wait in programme
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		//implicit wait can be declared globally
		//implicit wait doesnot wait after element is found it moves further whil thread.sleep wait for given time
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("pune");
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("mumbai");
		
		
	}

}

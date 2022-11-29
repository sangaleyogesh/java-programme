package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1{
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.switchTo().frame("iframeResult");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	
	
	
	
		
		
		
	}
	
	
	
}


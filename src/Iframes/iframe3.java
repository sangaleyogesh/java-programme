package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {
	
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")]")).click();
	
	Thread.sleep(2000);
	
	WebElement outerframe=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
	driver.switchTo().frame(outerframe);
	Thread.sleep(5000);
	
	WebElement innerframe=driver.findElement(By.xpath("html/body/section/div/div/iframe"));
	
	Thread.sleep(5000);

	driver.switchTo().frame(innerframe);
	Thread.sleep(5000);

	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
		
	}

}

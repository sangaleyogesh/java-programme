package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover3{
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	Thread.sleep(3000);
	
	Actions act=new Actions(driver);
	
WebElement double1=driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
	
	act.doubleClick(double1).build().perform();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	
	
	
}	
	
	
	
}
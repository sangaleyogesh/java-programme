package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains {

public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\installation folder\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[contains(text(),\"Best Sellers\")]")).click();
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[contains(text(),\"Books\")and @data-csa-c-content-id=\"nav_cs_books\"]")).click();
	
	Thread.sleep(8000);
	driver.quit();
}	
	
	
}

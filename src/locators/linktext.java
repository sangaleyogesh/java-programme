package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://kite.zerodha.com/?next=%2Forders%2Falerts");

driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("YL8419");
Thread.sleep(3000);

driver.findElement(By.linkText("Forgot user ID or password?")).click();


	driver.close();
	
	
}	
	
	
	
	
	
	
	
	
	
	
}
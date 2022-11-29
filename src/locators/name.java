package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name{
	
public static void main (String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/login/");

Thread.sleep(5000);

driver.findElement(By.name("email")).sendKeys("tom@1234");

Thread.sleep(5000);

driver.findElement(By.name("pass")).sendKeys("abcd");
	
Thread.sleep(5000);

driver.findElement(By.xpath("//div[@class=\"_9lsa\"]")).click();

Thread.sleep(5000);


driver.findElement(By.name("login")).click();
	
driver.quit();
	
	
	
	
	
	
	
	
	
	
}	
	
	
}
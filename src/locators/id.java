package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.manage().window().maximize();

driver.findElement(By.id("email")).sendKeys("tom@123");

Thread.sleep(5000);

driver.findElement(By.id("pass")).sendKeys("abcd");

driver.findElement(By.id("loginbutton")).click();

driver.findElement(By.xpath("//div[contains(@id,\"u_0_4\")]")).click(); //dynamic id xpath by contains with attribute


//	driver.quit();
	
	
	
	
}	
	
}
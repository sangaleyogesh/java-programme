package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicid {
	
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.manage().window().maximize();

driver.findElement(By.id("email")).sendKeys("tom@123");

Thread.sleep(5000);

driver.findElement(By.id("pass")).sendKeys("abcd");

//dynamic id method 1. by xpath by contains id	

//driver.findElement(By.xpath("//div[contains(@id,\"u_0_4\")]")).click();

//dynamic id start with

driver.findElement(By.xpath("//div[starts-with(@id,\"u_0_4\")]")).click();

//dynamic id start with

//driver.findElement(By.xpath("//div[ends-with(@id,\"---ah\")]")).click();


Thread.sleep(5000);

driver.quit();


	
}	

}

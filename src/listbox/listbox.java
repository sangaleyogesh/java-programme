package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox {
	
//programme without using listbox concept
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("tom@0123");

driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abcd");

driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();


driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("yogesh");
	
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sangale");

driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9765205468");

driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
driver.findElement(By.xpath("//option[@value=\"15\"]")).click();


driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
driver.findElement(By.xpath("//option[@value=\"8\"][1]")).click();

driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
driver.findElement(By.xpath("//option[@value=\"2020\"]")).click();

Thread.sleep(3000);


}	
	

}

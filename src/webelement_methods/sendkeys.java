package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	
//sendkeys
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/login/");

Thread.sleep(5000);

driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("sangaleyogesh@ymail.com"); //xpath by attribute

Thread.sleep(5000);

driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _9npi inputtext _9npi\"]")).sendKeys("sudhir"); //xpath by attribute


	
}	

	
	
	
}

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear2 {
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

WebElement email=driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]"));

email.sendKeys("tom@4565");

Thread.sleep(3000);

email.clear();
	
	
	
	
	
}	

}
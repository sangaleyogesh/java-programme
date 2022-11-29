package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktext {
	
	//partial link text
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://kite.zerodha.com/");

driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("YL8419");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("@aHbz54g");

Thread.sleep(3000);

driver.findElement(By.partialLinkText("Forgot user ID")).click();  //require partial text not complete text require
Thread.sleep(3000);
driver.close();	
	
	
	
}	

}

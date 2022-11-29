package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_Index{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");	
	
WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in/");
	
driver.manage().window().maximize();

driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[5]")).click();

Thread.sleep(5000);
	
	
driver.navigate().back();
	
driver.quit();

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
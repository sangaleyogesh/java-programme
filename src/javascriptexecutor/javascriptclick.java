package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptclick {
	
	public static void main (String[]args) {
		
	System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement data=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	
	js.executeScript("arguments[0].click()", data);
		
	}

}

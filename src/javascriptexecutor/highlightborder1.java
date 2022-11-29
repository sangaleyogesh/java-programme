package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightborder1 {
	
	//creating border for multiple elements
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement name=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	
	Thread.sleep(3000);
	
	WebElement login=driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		
	Thread.sleep(3000);
	
	WebElement createnew=driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]"));
	
	
	highlight(name, driver);  //direct calling for static  method 
	
	highlight(login,driver);
	
	highlight(createnew, driver);
	
	}

	public static void highlight(WebElement element, WebDriver driver) { //creating method with parameter for multiple element
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border='6px solid red'", element);
		
		
	}
		
		
		
	
	
	
}

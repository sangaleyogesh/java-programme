package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightbackground {
	
	//use for highlight multiple background by using the static method
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement name=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	
	Thread.sleep(2000);
	
	WebElement login=driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
	Thread.sleep(2000);
	
	WebElement create=driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]"));
	
	Thread.sleep(2000);
	
	background(name,driver);
	background(login, driver);
	background(create,driver);
	
	}

	public static void background(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.background='red'", element); //highlight background
	}
	
	
}

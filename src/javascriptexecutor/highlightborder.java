package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightborder{
	
	//javascript executor use for the create the border for element
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement name=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].style.border='5px solid red'", name); //creating red border for single element
	
	
	
	
}	
	
}
package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	
	//explicit wait is used for specific element for the condition where wait is required
	//for form submit button to wait untill form filling
	//this wait is imoprtant for syntax in iterview ,programme is not important,rarely use
	
	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	WebElement source=driver.findElement(By.xpath("//input[@id=\"src\"]"));
	
	WebElement dest=driver.findElement(By.xpath("//input[@id=\"dest\"]"));
	
	redbus(driver, source, "pune");
	redbus(driver,source,"mumbai");	
	

	
	}

	public static void redbus(WebDriver driver,WebElement element, String value) {
		
		new WebDriverWait(driver, Duration.ofMinutes(20)).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
		
	}

}

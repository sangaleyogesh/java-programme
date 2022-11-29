package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision {

	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	
	Thread.sleep(5000);
		
	}
	
	
	
}

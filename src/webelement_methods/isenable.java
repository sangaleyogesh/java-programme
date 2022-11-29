package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {
	
	//to check login button is enable or not
	
	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
		
	Boolean b=	driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).isEnabled();
		
		
	System.out.println(b);	
		
		
		
		
		
	}

}

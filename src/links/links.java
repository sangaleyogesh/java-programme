package links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links{
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	List<WebElement> link1=driver.findElements(By.tagName("a"));
	
	System.out.println("total links:"+link1.size());
	
	for(WebElement links:link1 ) {
		
		System.out.println(links.getText());
		System.out.println(links.getAttribute("href"));
		
		
	}
		
		
	}
	
}
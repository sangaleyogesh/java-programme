package webDrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class minimize{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");	

ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login.php/");

Thread.sleep(3000);

driver.manage().window().maximize();

Thread.sleep(3000);

driver.manage().window().minimize();

Thread.sleep(3000);

	
}	
	
}
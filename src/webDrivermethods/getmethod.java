package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {
	
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com"); //to open url or application
}

}

package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class horizontalscroll{
	//scroll from right to left horizontally
	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.album.alexflueras.ro/");

JavascriptExecutor js=(JavascriptExecutor)driver;



js.executeScript("window.scrollBy(10000, 0)", "");
	
}	
	
	
	
}
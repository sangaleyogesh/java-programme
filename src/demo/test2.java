package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2{
	
public static void main(String[]args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\installation folder\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	
driver.get("https://kite.zerodha.com"); //this get method is used to open application and url
	
driver.close();  // driver.close method used to close application
	

	
}	
	
	
	
	
	
	
	
	
	
}
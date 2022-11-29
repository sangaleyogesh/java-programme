package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_method {
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();

driver.get("https://kite.zerodha.com/");

Thread.sleep(5000); //sleep for 5second then close that is use for threa.sleep method

driver.close();

}	
	

}

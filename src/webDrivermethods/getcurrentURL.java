package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentURL {
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();	
	
driver.get("https://kite.zerodha.com/");

Thread.sleep(1000);

String URL=driver.getCurrentUrl();

if(URL.equals("https://kit.zerodha.com/")){
	
	System.out.println("url is correct");
	
	
}
else {
	System.out.println("url is incorrect");	
}	
	driver.close();

	
}

}	
	



package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login.php/");
	
	Thread.sleep(3000);
	
	String page =driver.getTitle();

    System.out.println();

driver.navigate().to("https://kite.zerodha.com/");

Thread.sleep(3000);

String page1=driver.getTitle();

System.out.println("page1");

driver.navigate().back();

Thread.sleep(3000);

driver.navigate().forward();

Thread.sleep(3000);

driver.navigate().refresh();

driver.close();


}	

}

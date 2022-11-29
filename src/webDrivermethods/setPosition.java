package webDrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

Thread.sleep(3000);

driver.manage().window().minimize();

Thread.sleep(3000);
	
driver.manage().window().maximize();

Thread.sleep(3000);

Point p=new Point(700, 300);

driver.manage().window().setPosition(p);
	
Thread.sleep(5000);

driver.close();


	
}	
	
	

}

package webDrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition {
	
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

Thread.sleep(3000);

driver.manage().window().maximize();
				//w,   H);
Point p=new Point(500, 200);	

driver.manage().window().setPosition(p);

Thread.sleep(3000);

System.out.println(driver.manage().window().getPosition());

driver.close();

}	

}

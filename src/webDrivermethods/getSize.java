package webDrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();

Thread.sleep(5000);

Dimension size1=new Dimension(500,400);

driver.manage().window().setSize(size1);

Thread.sleep(5000);


System.out.println(driver.manage().window().getSize());

driver.close();
}	

}

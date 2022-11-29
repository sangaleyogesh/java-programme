package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyatribute {
	
public static void main(String[]args) throws InterruptedException {	
	
System.setProperty("webdriver.chrome.driver", "C:\\installation folder\\chromedriver.exe");

ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login.php");	

driver.manage().window().maximize();
Thread.sleep(8000);
driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("sangaleyogesh@ymail.com");
Thread.sleep(8000);

driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _9npi inputtext _9npi\"]")).sendKeys("sudhir");
Thread.sleep(5000);

driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy\"]")).click();
Thread.sleep(5000);
driver.close();
}
	
	
	
	
	
	
	

}

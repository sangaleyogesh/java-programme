package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle4{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Thread.sleep(5000);

driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();

Thread.sleep(5000);

Set<String> windowid=driver.getWindowHandles();
System.out.println(windowid);
	
Iterator<String> it=windowid.iterator();

String parentid=it.next();
Thread.sleep(5000);

String childid=it.next();

System.out.println(parentid);
System.out.println(childid);

Thread.sleep(5000);

driver.switchTo().window(parentid);

System.out.println(driver.getTitle());

driver.switchTo().window(childid);

System.out.println(driver.getTitle());


	
}	
}
package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle5 {
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
	
	Thread.sleep(3000);
	
	Set<String> windowid=driver.getWindowHandles();
	
	System.out.println(windowid);
	
	Iterator<String> id=windowid.iterator();
	
	Thread.sleep(5000);
	
	String parentwindow=id.next();
	
	Thread.sleep(5000);

	String childwindow=id.next();
	
	System.out.println(parentwindow);
	
	System.out.println(childwindow);
	
	driver.switchTo().window(parentwindow);
	
	Thread.sleep(3000);
	
	driver.switchTo().window(childwindow);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id=\"myText\"]")).sendKeys("yogesh@123");
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("//button[@id=\"linkadd\"]")).click();
	
	//second method for printing element using for loop
	
	for(String id1:windowid) {
	
		String s=driver.switchTo().window(id1).getTitle();
		
		if(id1.equals("OrangeHRM")|| id1.equals("Sign Up for a Free HR Software Trial | OrangeHRM | OrangeHRM")) {
			
			driver.close();
		}
		
		
		System.out.println(s);

	}
	
		
		
		
	}

}

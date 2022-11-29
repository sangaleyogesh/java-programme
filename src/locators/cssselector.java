package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	driver.manage().window().maximize();
	
	//1-id syntax #id
	
//	driver.findElement(By.cssSelector("#email")).sendKeys("tom@1234");
	
//	driver.findElement(By.cssSelector("#pass")).sendKeys("abcd");
	
	//2.tagname =synatx  tagname#id, whwnwever not getting element result 1 at that time using this type of cssselector
	
//	driver.findElement(By.cssSelector("input#email")).sendKeys("tom@123");
	
//	driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");

	//3.
//	driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("tom@1234");
		
	//4
	
//	driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("1234");

	driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._1kbt.inputtext._1kbt")).sendKeys("tom@123");//by removing space
	
	driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._9npi.inputtext._9npi")).sendKeys("abcd");
	
	
	
	
	
	
}	
	
	

}

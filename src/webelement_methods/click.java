package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {
	
	//click method
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/login/");

Thread.sleep(5000);


driver.findElement(By.xpath("//button[text()=\"Log In\"]")).click(); //xpath by text

Thread.sleep(5000);
	
	
}	

	
	
	
}

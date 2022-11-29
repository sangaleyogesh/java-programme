package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2{
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	driver.switchTo().frame("singleframe");
	Thread.sleep(5000);

	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
	Thread.sleep(5000);

	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@href=\"WebTable.html\"]")).click();
	
	
}	
	
	
}
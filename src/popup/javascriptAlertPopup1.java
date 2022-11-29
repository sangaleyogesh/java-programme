package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptAlertPopup1{
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]")).click();
	
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();  //this method is used to accept the java script alert popup
	
	//driver.switchTo is a method of webdriver ---alert is class and accept is method
	
		
		
	}
	
}
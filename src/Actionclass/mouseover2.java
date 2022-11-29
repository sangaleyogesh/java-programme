package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover2{
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://mrbool.com/");
	
	Thread.sleep(3000);
	
	Actions act=new Actions(driver);
	
	WebElement con=driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
	
	act.moveToElement(con).build().perform();
	
	WebElement articles=driver.findElement(By.xpath("//a[contains(text(),\"Articles\")]"));
	
	String art=articles.getText();
	System.out.println(art);
	
}
                                     
                                      
                             	
	
	
	
}
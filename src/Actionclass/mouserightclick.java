package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserightclick {
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act=new Actions(driver);
	
	WebElement button=driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
		
	act.contextClick(button).build().perform();  //for right click
	
	Thread.sleep(2000);
	
	//click on copy button

	driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
	
	Thread.sleep(2000);
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();  //to accept the popup
	
	}

}

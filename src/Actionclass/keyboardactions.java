package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://text-compare.com/");
	
	Thread.sleep(3000);
	
	WebElement input1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
	
	WebElement input2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
	
	input1.sendKeys("indian army");
	
	Thread.sleep(3000);

	
	Actions act=new Actions(driver);
	
	//to perform control all operation
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	Thread.sleep(5000);
		
	//to perform the control c (copy)
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	Thread.sleep(3000);
	
	act.sendKeys(Keys.TAB);
	
	act.build().perform();
	Thread.sleep(3000);
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	Thread.sleep(3000);

	if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
	
	System.out.println("correct copied");
	

	}
	else
		System.out.println("wrong copied");
	
	
	}
	
}

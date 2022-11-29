package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

Thread.sleep(3000);

Actions act=new Actions(driver);

WebElement source=driver.findElement(By.xpath("//div[@id=\"box6\"]"));

WebElement dest=driver.findElement(By.xpath("//div[@id=\"box106\"]"));

Thread.sleep(3000);

act.dragAndDrop(source, dest).build().perform();
	
}	
	
	
}
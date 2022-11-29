package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptsendkeys{
	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

WebElement data=driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));
	
JavascriptExecutor js=(JavascriptExecutor)driver;

//using method 1 for sendkey using javascriptexecutor

js.executeScript("arguments[0].value='yogesh'", data);

//using method2 for sendkey using javascript executor

js.executeScript("document.getElementById('pass').value='1234';");	
}	
	
	
}
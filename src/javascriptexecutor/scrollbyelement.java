package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbyelement{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.w3schools.com/");


WebElement data1=driver.findElement(By.xpath("//h1[contains(text(),\"Code Editor\")]")); //scroll up to code editor element

    Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView();", data1);
	
	
}	
	
	
}
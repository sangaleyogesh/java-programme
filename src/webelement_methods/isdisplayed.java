package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {
	
public static void main(String[]args)	{
	
	//return type is boolean
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

Boolean b=driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).isDisplayed();

System.out.println(b);

driver.close();
	
	
	
	
	
	
	
	
	
	
	
}

}

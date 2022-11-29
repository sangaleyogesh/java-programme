package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//when attribute and id not avialable in dom strucure that time locators will be find by classname
//when there is duplicate id that time also classname used to find elements

public class classname {
	
public static void main(String[]args)	{
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://login.yahoo.com/?.intl=in");

driver.manage().window().maximize();

driver.findElement(By.className("phone-no")).sendKeys("tom@1234");


	
	
}
	

}

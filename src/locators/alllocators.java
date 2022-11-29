package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllocators{
	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");
	// 1.xpath

//driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("tom@1234");

//driver.findElement(By.xpath("//input[contains(@class,\"inputtext _55r1 inputtext _9npi inputtext _9npi\")]")).sendKeys("1234");
	//2.id	
//driver.findElement(By.id("email_container")).sendKeys("1234@");

	//3.name
//driver.findElement(By.name("email")).sendKeys("tom@1234");

	//4.classname
//driver.findElement(By.className("_55r1 _1kbt")).sendKeys("1234");

	//5.linktext
//driver.findElement(By.linkText("Forgotten account?")).click();
	//6.partiallinktext
//driver.findElement(By.partialLinkText("Forgotten ")).click();
	//6.tag name -not sing this type because of multiple tag name present in dom structure

	//7.cssselector
//driver.findElement(By.cssSelector("#email")).sendKeys("tom@123"); //by id
//driver.findElement(By.cssSelector("input#pass")).sendKeys("124"); //by tagname
driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._1kbt.inputtext._1kbt")).sendKeys("tom@123"); //by class removing space with dot
driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("1234"); // by type
 	
}	
	
	
	
}
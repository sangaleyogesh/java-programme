package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox5{
	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.manage().window().maximize();

driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Yogesh");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Sangale");
driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9765205468");
WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));

String birthdate="9/8/1992";

String date[]=birthdate.split("/");

listbox(day,date[0]);
listbox(month,date[1]);
listbox(year,date[2]);

}
public static void listbox(WebElement element, String value) {
	
	Select select1=new Select(element);
	select1.selectByValue(value);
	
}
	

	
	
	
	
	
	
	
	
}	
	
	
	

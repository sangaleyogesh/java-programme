package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox6{
	
public static void main (String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();

driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("yogesh");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Sangale");

WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));	
WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));

String birthdate="9/8/1992";
 
String date[]=birthdate.split("/");

m1(day,date[0]);
m1(month,date[1]);
m1(year,date[2]);

}
public static void m1(WebElement element, String value) {
	Select select1=new Select(element);
	select1.selectByValue(value);
	




}	
	
	
}
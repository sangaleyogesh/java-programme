package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class listbox2 {
public static void main(String[]args) {

	//2.selectByValue
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("yogesh");

driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sangale");

driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9765205468");
WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));

//select by value

Select select1=new Select(day);

select1.selectByValue("9");

Select select2=new Select(month);
select2.selectByValue("8");

Select select3=new Select(year);
select3.selectByValue("1992");


	
	
	
}
	
	
}

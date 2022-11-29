package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox7{
	
public static void main(String[]args) {
	
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
	
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	
	Select daylist=new Select(day);
	
	List<WebElement> dayvalues=daylist.getOptions();
			
	System.out.println(dayvalues.size());
	
	
	for(int i=0; i<dayvalues.size(); i++) {
		String value=dayvalues.get(i).getText();
		System.out.println(value);
	if(value.equals("9")) {
		dayvalues.get(i).click();
		//break;  //use to stop all printing values ,it will stop at 9
	}	
	}
	Select monthlist=new Select(month);
	
	List<WebElement> monthvalues=monthlist.getOptions();
	System.out.println(monthvalues.size());  //to print size
	
	for(int i=0; i<monthvalues.size();i++) {
		String value1=monthvalues.get(i).getText();
		System.out.println(value1);
		if(value1.equals("Aug")) {
			monthvalues.get(i).click();
		}
		
	}
	
	Select yearlist=new Select(year);
	List<WebElement> yearvalue=yearlist.getOptions();
	System.out.println(yearvalue.size());
	
	for(int i=0; i<yearvalue.size(); i++) {
		String value3=yearvalue.get(i).getText();
		System.out.println(value3);
		
		if(value3.equals("1992")) {
			yearvalue.get(i).click();
		}
	}
	
}	
	
}
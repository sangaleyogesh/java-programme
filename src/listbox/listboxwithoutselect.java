package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listboxwithoutselect {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
		
		List<WebElement>day=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		List<WebElement>month=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		List<WebElement>year=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		
		System.out.println(day.size());
		
		for(int i=0;i<day.size();i++) {
			System.out.println(day.get(i).getText());
			
			if((day.get(i).getText()).equals("9")) {
				day.get(i).click();
			}
		}
		
		
		System.out.println(month.size());
		
		for(int i=0; i<month.size();i++) {
			System.out.println(month.get(i).getText());
			
			if(month.get(i).getText().equals("Aug")) {
				month.get(i).click();
			}
		}
		
		System.out.println(year.size());
		
		for(int i=0; i<year.size();i++) {
			
			System.out.println(year.get(i).getText());
			
			if(year.get(i).getText().equals("1992")) {
				year.get(i).click();
			}
		}
	}

}

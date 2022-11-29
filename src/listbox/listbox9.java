package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox9 {
	
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in");
	
	driver.findElement(By.id("src")).sendKeys("Pune");
	
	Thread.sleep(5000);
	List<WebElement> city=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	
	System.out.println(city.size());
	
	for(int i=0; i<city.size(); i++) {
		System.out.println(city.get(i).getText());
		if(city.get(i).getText().equals("Warje, Pune")) {
			city.get(i).click();
			break;
		}
	}


	driver.findElement(By.id("dest")).sendKeys("Mumbai");
	Thread.sleep(5000);

	
   List<WebElement>destination=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
   
   destination.size();
   System.out.println(destination.size());
   
   for(int i=0; i<destination.size(); i++) {
	   
	   System.out.println(destination.get(i).getText());
	   if(destination.get(i).getText().equals("Thane West, Mumbai")) {
		   destination.get(i).click();
		   break;
	   }
   }

driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();

driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();

}	

}

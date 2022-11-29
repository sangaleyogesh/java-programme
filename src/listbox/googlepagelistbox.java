package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlepagelistbox {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("java");
		
		Thread.sleep(3000);
		
		List<WebElement> listbox=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
		System.out.println(listbox.size());
		
		for(int i=0; i<listbox.size(); i++) {
			
			String list=listbox.get(i).getText();
			
			System.out.println(list);
			
			if(list.equals("javascript")) {
				
				listbox.get(i).click();
				
				break;
			}
		}
	}

}

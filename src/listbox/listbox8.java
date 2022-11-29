package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox8 {
	
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();   //use only driver. webdriver is declared globally.
		
		 driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
		Thread.sleep(5000);
		
		String dayxpath="//select[@id=\"day\"]//option";
		String monthxpath="//select[@id=\"month\"]//option";

		String yearxpath="//select[@id=\"year\"]//option";

		String birthdate="9-Aug-1992";
		String date[]=birthdate.split("-");
		
		selectdropdown(dayxpath,date[0]);
		selectdropdown(monthxpath,date[1]);
		selectdropdown(yearxpath,date[2]);
		
	}

	public static void selectdropdown(String xpath, String value)  {
	
		List<WebElement> name=driver.findElements(By.xpath(xpath));
		System.out.println(name.size());

		for(int i=0; i<name.size(); i++) {
			
			System.out.println(name.get(i).getText());
			
			if(name.get(i).getText().equals(value)) {
				name.get(i).click();
			}
			
			
		}
		
		
	}
	
}

package listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox11 {
	
	@SuppressWarnings("deprecation")
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installation folder\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
	String date="9/8/1992";
	
	String date1 []=date.split("/");
		
		listbox(day, date1[0]);
		listbox(month, date1[1]);
		listbox(year, date1[2]);

	}
		public static void listbox(WebElement element ,String value) {
			
			Select select1=new Select(element);
			
			select1.selectByValue(value);
			
			
		
		
		
	}

}

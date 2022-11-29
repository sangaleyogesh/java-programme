package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	
//in dom structure there is multiple tagname so we are not using this type and exception occur= element not interactable
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");

		Thread.sleep(5000);

		driver.findElement(By.tagName("input")).sendKeys("tom@1234");

		Thread.sleep(5000);

		driver.findElement(By.tagName("pass")).sendKeys("abcd");
			
		Thread.sleep(5000);

	


}
}
package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptAlertPopup2 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Confirm\")]")).click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();  //accept method used to accept the popup
		
		driver.switchTo().alert().dismiss();  //dismiss method used to cancel the popup
		
		
	}

}

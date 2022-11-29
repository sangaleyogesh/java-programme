package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownwindowBypixel {
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;  //top casting to the driver
		
		//scroll by pixcell bottom and up
		js.executeScript("window.scrollBy(0,3000)", "");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0, -2000)", "");
		
	}

}

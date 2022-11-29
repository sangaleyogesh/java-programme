package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permissionpopup {
	
	public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	
	
	Thread.sleep(3000);
	
	ChromeOptions option=new ChromeOptions();// this method is use to disable the chrome browser popup
	
	option.addArguments("--disable-notifications");
		
	
	WebDriver driver=new ChromeDriver(option);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.hdfcbank.com/");

	
}
}
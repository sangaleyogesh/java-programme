package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl1 {
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login.php/");
	
	Thread.sleep(1000);
	
	String url=driver.getCurrentUrl();
	
	if(url.equals("https://www.facebook.com/login.php/")) {
		
		System.out.println("url is correct");
	}
	else {
		
		System.out.println("url is wrong");
	}
	driver.close();
	}

}

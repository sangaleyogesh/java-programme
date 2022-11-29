package POM_page_Object_module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass_zerodha {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//create obj of page1 to call these method of loginpaage1
	
	loginpage1 login=new loginpage1(driver);
	
	login.userid();
	
	Thread.sleep(2000);

	login.password();
	
	Thread.sleep(2000);

	login.loginbutton();
	
	//create obj of loginpage2 to access method of loginpage2
	
	loginpage2 loginpage2=new loginpage2(driver);
	
	Thread.sleep(2000);

	loginpage2.pin();
	
	Thread.sleep(2000);
	
	loginpage2.continuebutton();
	
	//create obj of homepage to access method of homepage
	
	homepage homepage=new homepage(driver);
	
	homepage.userid();
	
	
	
	}

}

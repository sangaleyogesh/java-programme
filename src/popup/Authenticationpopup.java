package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
	
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	//for basic autentication popup username and password to be directly enter throug the driver.get method
	//syntax= driver.get("https://username:password@url");
	
	Thread.sleep(3000);
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	Thread.sleep(3000);
	
	//to print the text after login msg [Congratulations! You must have the proper credentials] by using xpath
	//return type is string
	
	String text=driver.findElement(By.xpath("//p[contains(text(),\"Congratulations! You must have the proper credentials\")]")).getText();
	
	System.out.println(text);
	}
	

}

package demoDEMO2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST {
	
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.whatsapp.com/");
	
	
}

}

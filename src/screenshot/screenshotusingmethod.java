package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshotusingmethod {
	
	static WebDriver driver;
	//scren shot using method
	
	//using method we can create multiple screenshot
	public static void main(String[]args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	 driver.get("https://www.facebook.com/login/");
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(5000);
	 
	driver.get("https://www.redbus.in");

	driver.manage().window().maximize();
	
	screenshot("facebook");
	
	screenshot("redbus");
	
	}
	public static void screenshot(String filename) throws IOException {
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String random=RandomString.make(4);
	
	File destination=new File(".//screenshot//"+filename+""+random+".jpg");	
	
	FileHandler.copy(source, destination);
		
		
		
		
	}

}

package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot5 {

	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/login/");
		 
		 WebElement src=driver.findElement(By.xpath("//img[@class=\"_97vu img\"]"));
		 
		Thread.sleep(2000);
		
		 File source=((TakesScreenshot)src).getScreenshotAs(OutputType.FILE);
		
		 Thread.sleep(2000);
		 
		 String random=RandomString.make(4);
		 String filename="facebook";

		 File destination=new File("C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\screenshot\\"+filename+""+random+".jpg");
		 
		 FileHandler.copy(source, destination);
		
	}
	
}

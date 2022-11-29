package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot7 {
	
	public static void main(String []args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Thread.sleep(2000);

		
		String filename="facebook";
		
		String random=RandomString.make(3);
		
		File destination=new File("C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\screenshot/"+filename+""+random+".jpg");
		
		FileHandler.copy(source, destination);
	}
	
	

}

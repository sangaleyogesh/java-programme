package crossbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	@Parameters("browsername")
	public void crosbrowser(String browsername) throws InterruptedException {
		
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "c:\\installation folder\\geckodriver.exe");
			
			driver =new FirefoxDriver();
		}
		else if(browsername.equals("msedge")) {
			
		System.setProperty("webdriver.msedge.driver", "c:\\installation folder\\msedgedriver.exe");
		
		driver=new EdgeDriver();
	
		}
		else if(browsername.equals("IE")) {
			
		System.setProperty("webdriver.IE.driver", "c:\\installation folder\\IEDriverserver.exe");
		
		driver=new InternetExplorerDriver();
		
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement user=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		
		Thread.sleep(3000);

		user.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		pass.sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String exp="Paul Collings";
		
		String name=driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).getText();
		
		if(exp.equals(name)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();

	}
	
	

}

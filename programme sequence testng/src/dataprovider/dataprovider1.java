package dataprovider;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {
	//data provider use to test the case with multiple set of data
	
	@SuppressWarnings("deprecation")
	
	@Test(dataProvider="logindata1")
	public void logindata(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue( driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).isDisplayed());
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
	
	@DataProvider(name="logindata1")
	public Object[][] data() {
		
		Object[][] data=new Object [4][2];
		//correct username &correct password
		
		data [0][0]="Admin";
		data [0][1]="admin123";
		
		//correct username &incorrect password
		
		data[1][0]="Admin";
		data[1][1]="admin231";
		
		//incorrect username &correct password

		data[2][0]="Adm";
		data[2][1]="admin123";
		
		//incorrect username &incorrect password
		
		data[3][0]="adm";
		data[3][1]="admin231";
		
		return data;
	}
	
	
	
	
	
	

}

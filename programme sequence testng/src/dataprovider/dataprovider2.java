package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider2 {
	
	WebDriver driver;

	@SuppressWarnings("deprecation")

	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}
	@Test(dataProvider="logindata")
	public void logintest(String username,String pwd,String exp) throws InterruptedException {
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement userid=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Thread.sleep(2000);
		userid.clear();
		Thread.sleep(2000);
		userid.sendKeys(username);
		Thread.sleep(2000);

		
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
		Thread.sleep(3000);
		
		String exp_title = "Dashboard / nopCommerce administration";
		
		String Act_title=driver.getTitle();
		
		System.out.println(Act_title);
		
		if(exp.equals("valid")) {
			if(exp_title.equals(Act_title)) {
				
			driver.findElement(By.xpath("//a[contains(text(),\"Logout\")]")).click();
			
			  Assert.assertTrue(true);
			}
			else{
				Assert.assertTrue(false);
			}
		}
			
		else if(exp.equals("invalid")) {
			
			if(exp_title.equals(Act_title)) {
				
				driver.findElement(By.xpath("//a[contains(text(),\"Logout\")]"));
				
				Assert.assertTrue(false);
			}
			
			else {
				
				Assert.assertTrue(true);
			}
			
		}
	}
	
	@DataProvider(name="logindata")
	public String[][] logindata() {
		
		String [][] logindata= {
		
		{"admin@yourstore.com","admin", "valid"},
		{"admin@yourstore.com","adm", "Invalid"},
		{"admin@yourst.com","admin", "Invalid"},
		{"admin@yourst.com","adm", "Invalid"},
		};
	return logindata;
		
}	
	@AfterClass
	public void teardown() {
		
	driver.quit();	
		
	}
	
	
}

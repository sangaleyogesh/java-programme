package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	
	WebDriver driver;

@SuppressWarnings("deprecation")

@BeforeMethod
@Parameters({"url"})
public void setup(String url) {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get(url);
	
}	
@Test
@Parameters({"username", "pwd"})
public void logindata(String username, String pwd) throws InterruptedException {
	
	WebElement userid=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	Thread.sleep(2000);
	userid.clear();
	Thread.sleep(2000);
	userid.sendKeys(username);
	Thread.sleep(2000);
	
	WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	Thread.sleep(2000);
	pass.clear();
	Thread.sleep(2000);
	pass.sendKeys(pwd);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	String exp ="Dashboard / nopCommerce administration";
	
	String act=driver.getTitle();

	if(exp.equals(act)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
@AfterMethod
public void teardown() {
	driver.quit();


}	
	
}

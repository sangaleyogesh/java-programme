package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class withoutframework {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	
	//to disable popup
		
	ChromeOptions option=new ChromeOptions();
	
    option.addArguments("--disable-notifications");	
	
    WebDriver driver=new ChromeDriver(option);

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	

	driver.get("https://kite.zerodha.com/");
	
	//enter id
	driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
	
	//enter password
	
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("gms@0110");
	
	//click on submit button
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(3000);
	//enter pin
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("111000");
	
	//click on submit button
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	String expecteduserid="GP8097";
	
	//xpath of user id for geting the xpath value
	
	String userid=driver.findElement(By.xpath("//span[contains(text(),\"GP8097\")]")).getText();
		
	
	if(expecteduserid.equals(userid)) {
		
		System.out.println("user id is ok");
	}
		
	else {
		System.out.println("user id is not ok");
	}
		
	}
	

}

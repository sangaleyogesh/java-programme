package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class withframeworkDDF {
	
	//by using data driven frmaework
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	Thread.sleep(2000);
	//for permission popup disable
	ChromeOptions option=new ChromeOptions();
	
	option.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(option);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	
	FileInputStream file=new FileInputStream("C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\withframeworktest.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
	
	String userid=sh.getRow(1).getCell(0).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(userid);
	
	
	String password=sh.getRow(1).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	String pin=sh.getRow(1).getCell(2).getStringCellValue();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pin);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	String expecteduserid="GP8097";
	
	String actualuserid=driver.findElement(By.xpath("//span[contains(text(),\"GP8097\")]")).getText();
	
	if(expecteduserid.equals(actualuserid)) {
		
		System.out.println("userid is correct");
	}
	else {
		System.out.println("userid is wrong");
	}
	
	
	
		
	}

}

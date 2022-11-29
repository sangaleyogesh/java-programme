package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		String filepath="C:\\\\Users\\\\Yogesh Sangale\\\\Desktop\\\\web page &SQL programme\\\\excellsheet\\\\withframeworktest.xlsx";
		
		FileInputStream file=new FileInputStream(filepath);
		
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		
		String id=sh.getRow(1).getCell(0).getStringCellValue();
	
		loginpage1 kp1=new loginpage1(driver);
		
		kp1.userid(id);
		
		String pass=sh.getRow(1).getCell(1).getStringCellValue();
		
		kp1.password(pass);
		
		kp1.loginbutton();
		
		loginpage2 kp2=new loginpage2(driver);
		
		String PIN=sh.getRow(1).getCell(2).getStringCellValue();
		Thread.sleep(3000);
		kp2.pin(PIN);
		
		Thread.sleep(3000);

		kp2.continuebutton();
		
		homepage kp=new homepage(driver);
		
		
		String expecteduserid=sh.getRow(1).getCell(0).getStringCellValue();
		
		kp.userid(expecteduserid);
		
		
	}

}

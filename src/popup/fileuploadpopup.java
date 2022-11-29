package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(3000);
		
		//to handle the file upload popup using selenium is only possible when the type=file is present in dom structure
		//otherwise to use third party tool AutoIt
		
		driver.findElement(By.xpath("//input[@type=\"file\" and @name=\"file\"]")).sendKeys("C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\Team list-3.xlsx");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
	
		Thread.sleep(3000);

	}
	
	
	

}

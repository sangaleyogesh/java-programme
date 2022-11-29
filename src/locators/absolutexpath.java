package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpath {
	
	public static void main(String[]args) {
		//absolute xpath starts from root node
		//absolute xpath starts with / forward slash
		//absolute xpath only tag name are used
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/form/div/div/input")).sendKeys("tom@123");

driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/div/div/div/input")).sendKeys("abcd");
	
	
	
	
	
	
	
	

}}

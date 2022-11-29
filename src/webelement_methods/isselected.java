package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	Boolean b=driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
	
	System.out.println(b);
	driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();

	Boolean b1=driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();

	System.out.println(b1);
	
	driver.quit();
}	

}

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	
	public static void main(String[]args) {
		
	//return type is String	
		
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

String text=driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps you connect and share with the people in your life.\")]")).getText();

System.out.println(text);

String expectedresult="Facebook helps you connect and share with the people in your life.";

System.out.println(text.equals(expectedresult));
	
	driver.close();	
		
	}

}

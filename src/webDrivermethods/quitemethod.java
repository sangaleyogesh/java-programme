package webDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitemethod {

	

public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://demo.automationtesting.in/Windows.html");

driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();

Thread.sleep(5000);

driver.quit();
}
}

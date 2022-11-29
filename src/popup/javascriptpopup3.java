package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopup3{
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\" and contains(text(),\"Click for JS Prompt\")]")).click();
		
		//x path find by using and operator for ref when there is multiple result for x path in dom structure i.e time use and ,or operator to get result 1:1
		
		Alert text=driver.switchTo().alert(); //method use to enter a word in popup,Alert is return type
		
		Thread.sleep(3000);
		
		System.out.println("alert message:"+text.getText());
		
		Thread.sleep(3000);
		
		text.sendKeys("welcome");
		Thread.sleep(3000);

		text.accept();
		
		
	}
	
}
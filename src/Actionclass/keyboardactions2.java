package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions2{
	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/key_presses?");

Actions act=new Actions(driver);

//for backspace action and print

act.sendKeys(Keys.BACK_SPACE).build().perform();

String result=driver.findElement(By.xpath("//p[contains(text(),\"You entered: BACK_SPACE\")]")).getText();

System.out.println(result);

//for escape action and print

act.sendKeys(Keys.ESCAPE).build().perform();

String result1=driver.findElement(By.xpath("//p[contains(text(),\"You entered: ESCAPE\")]")).getText();

System.out.println(result1);




	
	
	
}	
	
	
	
}
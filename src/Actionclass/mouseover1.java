package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover1{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.flipkart.com/");

Thread.sleep(3000);

driver.manage().window().maximize();

driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

Actions act=new Actions(driver); //Action is class creating the one parameter constructor

//WebElement login=driver.findElement(By.xpath("//a[@href=\"/account/login?ret=/\"]"));  //xpath of login

WebElement more=driver.findElement(By.xpath("//div[@class=\"exehdJ\"]")); //xpath of more

Thread.sleep(3000);

act.moveToElement(more).build().perform(); //this method is use to move mouse over the element

}	
	
	
	
}
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class programme2{
	
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	//scroll window by element upto example
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement element=driver.findElement(By.xpath("//h3[contains(text(),\"Example\")][1]"));
	
	js.executeScript("arguments[0].scrollIntoView()", element);
	
	//1 way to get row size
	
	int row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();
	System.out.println(row);
	
	//2 way to get row size
	//in html tr-tag name for row and td-tag name for column

	List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr"));
	
	System.out.println(row1.size());
	
	//1 way to get col size

	int col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th")).size();
	
	System.out.println(col);
	
	//2 way to get col size
	
	List<WebElement>  col1=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th"));
	
	System.out.println(col1.size());
	
	for(int i=2; i<=row1.size(); i++) {
		
		for(int j=1; j<=col1.size(); j++) {
			
			String tablevalue=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
		
		System.out.print(tablevalue+"|");
		
		if(tablevalue.equals("Italy")) {
			
			System.out.println("row no:"+i+" "+"col no:"+j);
			
			continue;
		}
		System.out.println();
		}
	}
	
	
	

	
	
	
	
}	
	
	
}
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class programme1{
	
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.w3schools.com/html/html_tables.asp");

driver.manage().window().maximize();

JavascriptExecutor js=(JavascriptExecutor)driver;

WebElement data=driver.findElement(By.xpath("//h3[contains(text(),\"Example\")]"));

js.executeScript("arguments[0].scrollIntoView()", data);
//first way to find out the row size

int row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();

System.out.println("total row size:"+row);

//second way to find out  the row size 

List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr"));

System.out.println("total row size1:"+row1.size());

//first way to find out the column size
int col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th")).size();

System.out.println("total column size:"+col);

//second way to find out the column size

List <WebElement>col1=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th"));

System.out.println("total col1 size:"+col1.size());

//to retrieve data from specifiic row and column

String value=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[3]//td[1]")).getText();

System.out.println(value);  //to fetch data from table row 3&col 1

//to retrieve data from specifiic row and column

	
for(int i=2; i<=row1.size(); i++) {
	
	for(int j=1; j<=col1.size();j++) {
		
		String tablevalue=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
	//we can not pass the variable in to the xpath i.e i&j,for that we have to use concatnation
		System.out.print(tablevalue+"|");
	}

System.out.println();
}
	
}	
	

	
}
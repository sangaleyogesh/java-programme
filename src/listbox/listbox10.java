package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class listbox10 {
public static void main(String[]args) {

	//2.selectByValue
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.google.co.in/");

WebElement value=driver.findElement(By.xpath("//div[@class=\"pcTkSc\"]"));

Select select1=new Select(value);

List<WebElement> value2=select1.getOptions();

for(int i=0; i<value2.size(); i++) {
	
	String s=value2.get(i).getText();
	
	System.out.println(s);
}



}

}
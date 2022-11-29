package windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle3{
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Thread.sleep(5000);

driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();

Thread.sleep(5000);


Set<String> windowid=driver.getWindowHandles();
	
System.out.println(windowid);	

//to print parent and child id using the iterator method

//Iterator<String> it=windowid.iterator();
//
//String parentid=it.next();
//String childid=it.next();
//
//System.out.println(parentid);
//System.out.println(childid);

//method-2 using the arraylist

ArrayList<String> id=new ArrayList(windowid);

String parentid=id.get(0);
String childid=id.get(1);

System.out.println("parent id:"+parentid);

System.out.println("child id:"+childid);







	
}	
	
	
	
	
}
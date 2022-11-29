package windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle2{
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
		
		Thread.sleep(3000);
		
		Set<String> windowid=driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		//1.method-using iterator print the multiple window
		
		Iterator<String> it=windowid.iterator();
		
		String parent =it.next();
		String child=it.next();
		
		//2.using list ArrayList
		
		ArrayList<String> arr=new ArrayList(windowid);
		
		String parent1= arr.get(0);
		
		String child1=arr.get(1);
		System.out.println(parent1);
		System.out.println(child1);
		System.out.println("parent window:"+parent);
		System.out.println("child window:"+child);
		
		
		
		
	}
	
	
	
	
}
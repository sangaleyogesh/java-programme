package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	
public static void main(String[]args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login.php/");

Thread.sleep(5000);

String title =driver.getTitle();

System.out.println(title);

String expectedresult=("Log in to Facebook");

if(title.equals(expectedresult)) {
	
	System.out.println("Title is correct");
}
else {
	System.out.println("Title is incorrect");
}


driver.close();
}	

}

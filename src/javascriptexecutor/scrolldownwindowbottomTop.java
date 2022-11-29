package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownwindowbottomTop {
	
	public static void main(String []args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);

	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
//scroll by bottom and top
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	
	Thread.sleep(3000);
	
	js.executeScript("document.documentElement.scrollTop=0");
		
	}

}

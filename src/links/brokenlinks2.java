package links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","c:\\installation folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/login");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println("total links:"+links.size());
	
	int brokenlink=0;
	
	//to fetch the broken links
	for(WebElement link1:links) {
				
	String url=link1.getAttribute("href");
	
	
	URL http=new URL(url);
	
	HttpsURLConnection http1=(HttpsURLConnection)http.openConnection();
	

	http1.connect();
		
	if(http1.getResponseCode()>=400) {
		
		System.out.println(http1.getResponseCode()+"------->"+url+"---->"+"Broken link");
		brokenlink++;	

			}
	else {
		System.out.println(http1.getResponseCode()+"------>"+url+"----->"+"ok link");
	}	
	}
		System.out.println(brokenlink);
		
	}

}

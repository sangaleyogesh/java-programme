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

public class brokenlinks1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		int brokenlink=0;
		
		for(WebElement links1:links) {
			
			String url=links1.getAttribute("href");
		
			
			if(url==null ||url.isEmpty()) {
				
				System.out.println("link is null or empty");
			}
		
		URL url1=new URL(url);
		
		HttpsURLConnection http=(HttpsURLConnection)url1.openConnection();
		
		http.connect();
		
		if(http.getResponseCode()>=400) {
			
			System.out.println(http.getResponseCode()+"---->"+url+"--->"+"is---->broken");
			
			brokenlink++;
		}
		else
		{
			System.out.println(http.getResponseCode()+"--->"+url+"---->url is correct");
		}
		
		}
		
		System.out.println(brokenlink);
		
	}

}

package links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {
	
	public static void main(String[]args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		int broken=0;
		
		for(WebElement link1:links) {
			
			String url=link1.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("url is empty or blank");
			}
			
			URL url1=new URL (url);
			
			HttpsURLConnection http=(HttpsURLConnection)url1.openConnection();
			
			http.connect();
			
			if(http.getResponseCode()>400) {
				
				System.out.println(http.getResponseCode()+" "+url1+" "+"link is broken");
				
				broken++;
			}
		 
			else {
				
				System.out.println(http.getResponseCode()+" "+ url+" link is ok");
			}
		
		
		System.out.println(broken);}
	}

}

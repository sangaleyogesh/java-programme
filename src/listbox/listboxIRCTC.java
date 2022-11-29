package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class listboxIRCTC {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");  //to disable popup permission popup
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		driver.findElement(By.xpath("//input[@class=\"ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).sendKeys("mumbai");
	
	   Thread.sleep(3000);
	   
		List<WebElement> citylist=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
	System.out.println(citylist.size());
	
	for(int i=0; i<citylist.size(); i++) {
		
		String list=citylist.get(i).getText();
		
		System.out.println(list);
		
		if(list.equals("MUMBAI CENTRAL - BCT")) {
			
			citylist.get(i).click();
			
			break;
		}
	}
	
	driver.findElement(By.xpath("//input[@class=\"ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).sendKeys("delhi");
	
	Thread.sleep(3000);
	
	List<WebElement>destcity=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
	
	System.out.println(destcity.size());
	
	for(int j=0; j<destcity.size(); j++) {
		
		String destlist=destcity.get(j).getText();
		
		System.out.println(destlist);
		
		if(destlist.equals("DELHI SHAHDARA - DSA")) {
			
			destcity.get(j).click();
			
			break;
		}
	}
	
	driver.findElement(By.xpath("//span[@class=\"ng-tns-c65-12 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted\"]")).click();
	
	Thread.sleep(3000);
	
	List<WebElement> dropdown=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
	
	System.out.println(dropdown);
	
	for(int k=0; k<dropdown.size(); k++) {
		
		String dropdown1=dropdown.get(k).getText();
		
		System.out.println(dropdown1);
		
		if(dropdown1.equals("TATKAL")) {
			
			dropdown.get(k).click();
			
			break;
		}
	}
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}

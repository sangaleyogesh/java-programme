package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
		Thread.sleep(3000);
		
		List<WebElement> citylist=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(int i=0; i<citylist.size(); i++) {
			
		String citylist1=citylist.get(i).getText();
		
		System.out.println(citylist1);
		
		if(citylist1.equals("Warje, Pune")) {
			
			citylist.get(i).click();
			break;

		}
		
		}
		
		driver.findElement(By.id("dest")).sendKeys("mumbai");
		
		List<WebElement> destcity=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(int j=0; j<destcity.size(); j++) {
			
			String destcity1=destcity.get(j).getText();
			
			System.err.println(destcity1);
			
			if(destcity1.equals("Thane West, Mumbai")) {
				
				destcity.get(j).click();
				
				break;
			}
		}
		
		driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),\"Search Buses\")]")).click();
		
		
	}

}

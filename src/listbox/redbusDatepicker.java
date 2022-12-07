package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbusDatepicker {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
		Thread.sleep(3000);
		
		List<WebElement> src=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(int i=0; i<src.size(); i++) {
			
			String source=src.get(i).getText();
			
			System.out.println(source);
			
			if(source.equals("Warje, Pune")) {
				
				src.get(i).click();
				
				break;
			}

		}
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Nashik");
		
		Thread.sleep(3000);
		
		List<WebElement> dest=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(int j=0; j<dest.size();j++) {
			
			String destination=dest.get(j).getText();
			
			System.out.println(destination);
			
			if(destination.equals("Mumbai Naka, Nashik")) {
				
				dest.get(j).click();
				
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		
     	Thread.sleep(3000);
		
		
		String date="20/Dec/2023";
		
		String date1[]=date.split("/");
		
		String day=date1[0];
		
		String month=date1[1];
		
		String year=date1[2];
		
		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();

		while(true) {
			
			String monthyear=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			
			String monyear[]=monthyear.split(" ");
			
			String mon=monyear[0];
			
			String yea=monyear[1];
			
			System.out.println(monthyear);
			
			if(mon.equalsIgnoreCase(month)&&yea.equals(year)) {
			
				break;
			}
			else {
				driver.findElement(By.xpath("//td[@class=\"next\"]")).click();

			}
		
			
			
		}
		List<WebElement> allday=driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]//td"));
		
		for(int k=0; k<allday.size(); k++) {
			
			String allday1=allday.get(k).getText();
			
			System.out.println(allday);
			
			if(allday1.equals(day)) {
				
				allday.get(k).click();
				
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		
		
		
		

}}

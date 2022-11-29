package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox12 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\installation folder\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select select1=new Select(day);
		
		List<WebElement>day1=select1.getOptions();
		
		int size=day1.size();
		System.out.println(size);
		
		for(int i=0; i<day1.size(); i++) {
			
			String daylist=day1.get(i).getText();
			
			System.out.println(daylist);
			
			if(daylist.equals("9")) {
				
				day1.get(i).click();
				break;
			}
			
			Select select2=new Select(month);
			
			List<WebElement> monthlist=select2.getOptions();
			
			System.out.println(monthlist.size());
			
			for(int j=0; i<monthlist.size(); j++) {
				
				String monthvalues=monthlist.get(j).getText();
				
				System.out.println(monthvalues);
				
				if(monthvalues.equals("Aug")) {
					
					monthlist.get(j).click();
					
					break;
				}
				
				Select select3=new Select(year);
				List <WebElement> year1=select3.getOptions();
				System.out.println(year1.size());
				
				for(int k=0; k<year1.size(); k++) {
					
					String yearlist=year1.get(k).getText();
					
					System.out.println(yearlist);
					
					if(yearlist.equals("1992")) {
						
						year1.get(k).click();
						
						break;
					}
				}
				
				
				
			}
			
			
		}
	}

}

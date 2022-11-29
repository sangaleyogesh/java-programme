package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	
	
	@FindBy(xpath="//span[contains(text(),\"GP8097\")]")WebElement userid;
	
	
	public homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
	public void userid(String expecteduserid) {
		
		String actualuserid=userid.getText();
		if(actualuserid.equals(expecteduserid)) {
			
			System.out.println("userid is ok");
		}
		else {
			System.out.println("userid is not ok");
		}
	}
}

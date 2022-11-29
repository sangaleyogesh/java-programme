package POM_page_Object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	
	
	
	@FindBy(xpath="//span[contains(text(),\"GP8097\")]")WebElement userid;
	
	
	homepage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	public void userid() {
		
		String expuserid="GP8097";
		String actualuserid=userid.getText();
		
		if(expuserid.equals(actualuserid)) {
			
			System.out.println("userid is correct");
		}
		else {
			
			System.out.println("user id is wrong");
		}
	
	}

	
	
	
}

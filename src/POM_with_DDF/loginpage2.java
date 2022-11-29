package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {
	
	//step1
	
	@FindBy(xpath="//input[@type=\"text\"]")WebElement pin;
	
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement continuebutton;
	
	//step2 constructor
	
	loginpage2(WebDriver driver){
		
	PageFactory.initElements(driver, this);
	
	}
		
	//step3 create method
	
	public void pin(String pin1) {
		pin.sendKeys(pin1);
		
	}

	public void continuebutton() {
		
		continuebutton.click();
	}
}

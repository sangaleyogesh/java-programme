package POM_page_Object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {
	
	//1-step
	//pin
	
	@FindBy(xpath="//input[@type=\"password\"]")WebElement pin;
	
	//continuebutton
	
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement continuebutton;
	
	//step2-create one parameter constructor
	
	public loginpage2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//step3 intialise by using the method

	public void pin() {
		pin.sendKeys("111000");
	}
	
	public void continuebutton() {
		
		continuebutton.click();
	}
	
	
	
}

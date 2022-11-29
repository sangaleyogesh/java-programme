package POM_page_Object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {

	//in pom main method is only present in the test class
	//variables are private 
	
	//step-1
	
	@FindBy(xpath="//input[@type=\"text\"]")private WebElement userid;
	
	@FindBy(xpath="//input[@type=\"password\"]") WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement loginbutton;
	
	//step-2 create one parameter constructor
	
	public  loginpage1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//intialisation using the method
	
	public void userid() {
		
	userid.sendKeys("GP8097");
			
	}
	public void password() {
		
		password.sendKeys("gms@0110");
	}
	public void loginbutton() {
		
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
}

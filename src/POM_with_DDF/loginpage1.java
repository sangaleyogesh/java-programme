package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {

	//step1
	
	@FindBy(xpath="//input[@type=\"text\"]")private WebElement userid;
	
	@FindBy(xpath="//input[@type=\"password\"]")WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement loginbutton;
	
	//step2=constructor create
	
	
	public loginpage1(WebDriver driver) {

		PageFactory.initElements(driver, this );
	}
	
	public void userid(String Userid) {
		
		userid.sendKeys(Userid);
	}
	public void password(String pass) {
		
		password.sendKeys(pass);
	}
	public void loginbutton() {
		
		loginbutton.click();
	}
	
}

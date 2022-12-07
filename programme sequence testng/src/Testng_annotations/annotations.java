package Testng_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	/*Sequence of annotations in Testng total-8 annotation --@Aftersuite is the annotation but not using
	 * @Beforesuite
	 * @BeforeTest
	 * @BeforeClass
	 * @BeforeMethod
	 * @Test
	 * @AfterMethod
	 * @Afterclass
	 * @AfterTest
	 */
	//in real time we do not use all this
	//in real time we use only @Beforeclass--@Beforemethod--@Afterclass--@Aftermethod--@Test
	@BeforeSuite
	
	public void setup() {
		
		System.out.println("@beforesuite--setup for system");
	}
	@BeforeTest
	public void url() {
		System.out.println("@Beforetest--url for browser");
	}
	@BeforeClass
	public void login() {
		
		System.out.println("@Beforeclass--login");
	}
	@BeforeMethod
	public void launchbrowser() {
		
		System.out.println("@Beforemethod--launchbrowser");
	}
	@Test
	public void title() {
		System.out.println("@Test--googletitle");
	}
	@Test
	public void logo() {
		System.out.println("@Test--logo");
	}
		
	@Test
	public void demo() {
		System.out.println("@Test--logo");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod--loout");
	}
	
	
	
	@AfterClass
	public void closebrowser() {
		System.out.println("@Afterclass--closebrowser");
	}
	@AfterTest
	public void deletecookies() {
		System.out.println("aftertest--deletecookies");
	}
}

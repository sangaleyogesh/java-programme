package Testng_annotations;

import org.testng.annotations.Test;

public class dependsOnMethods_keyword3 {
	
	//depends on keyword skip the depend test cases
	//e.g-if login page having the exception so no imprtance of executing the othe test cases of home page dependsonMethod keyword skip the other test cases
	//if depend method will execute all the test cases execute
	@Test
	public void loginpage() {
		int i=10;
		
		System.out.println("login page");
	}
	@Test(dependsOnMethods="loginpage")
	public void homepage() {
		
		System.out.println("homepage");
	}
	@Test(dependsOnMethods="loginpage")
	public void serchpage() {
		
		System.out.println("searchpage");
	}
	@Test(dependsOnMethods="loginpage")
	public void titlepage() {
		System.out.println("titlepage");
	}
}

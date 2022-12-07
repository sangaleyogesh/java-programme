package Testng_annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report {
	
	//in emailable report to add the important information manually for that using the method
	// syntax==reporter.log("inforamation")
	//reporter is class and log is the method present in this
	//to see report refresh on the project and click on the --test output--emailable report
	//such type of report sending to the client ,in this report adding the each and every information to the client
	
	@Test
	public void logintest() {
		Reporter.log("logintest--"); //to  add information in the report
	}
	
	@Test
	public void searchtest() {
		Reporter.log("search test--");
	}
}

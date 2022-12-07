package Testng_annotations;

import org.testng.annotations.Test;

public class Timeout_keyword6 {
	
	//timeout keyword is use when the exception occur and the execution loop will be go for the infinite loop that time tmeout keyword will stop the execution
	
	@Test(timeOut=10000)  //timeout will stop the execution in 10 seconds
	public void infiniteloop() {
		
		for(;;) {
			System.out.println("hello");
		}
			
	}
}

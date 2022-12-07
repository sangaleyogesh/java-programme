package Testng_annotations;

import org.testng.annotations.Test;

public class expectedexceptions_keword7 {
	//can we handle the exception not using the try and catch block--
	//ans-yes we can handle the exception using the expected exception keyword
	//syntax-- expectedExceptions=exceptiontyp.class 
	//exception typ=-arithmaticexception, nullpointer exce
	
	@Test(expectedExceptions=ArithmeticException.class) //for arithmetic exception handling
	
	public void exception() {
		
		int a=10/0;
		System.out.println("a");
	}
	
@Test(expectedExceptions=NullPointerException.class)  //for null pointer exception handling
	
	public void exception1() {
		
		String s=null;
		System.out.println(s.length());
	}
	
	
}

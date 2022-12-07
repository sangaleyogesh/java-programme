package Testng_annotations;

import org.testng.annotations.Test;

public class invocationCount_keyword4 {
	
	//invocation keyword use to run the test cases multiple times
	//eg.--invocationCount=20--test case will execute 20 times
	
	@Test(invocationCount=20)
	public void addition() {
		
		int a=10;
		int b=5;
		int sum=a+b;
		
		System.out.println("additin:"+sum);
	}

}

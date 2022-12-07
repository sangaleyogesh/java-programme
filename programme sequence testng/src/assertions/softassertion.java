package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {
	
	//soft assertion collects the all the assertion result and if assertion will failed it will marked at the end 
	// faied test cases for that failed assertion

SoftAssert softassert=new SoftAssert();
@Test
public void demotest() {
	
	softassert.assertEquals("java", "java");
	
	System.out.println("successfuly executed");
	
	softassert.assertEquals("python", "python");
	System.out.println("successfuly executed");
	softassert.assertAll(); //to collect the all asser result to mark test case as pass or fail
}
@Test
public void demotest1() {
	softassert.assertTrue(true);
	
	System.err.println("succesfully exe demotest1");
	
	softassert.assertTrue(false);
	System.err.println("succesfully exe demotest1");
	softassert.assertAll();

}
	
}

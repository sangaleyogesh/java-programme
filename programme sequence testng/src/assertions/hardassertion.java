package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion{
	
	
	
	@Test
	
	public void demotest1() {
		
		Assert.assertTrue(true);
		
		System.out.println("welcome");
		
		Assert.assertEquals("java", "ja"); //fails it will not execute the printing statement
		
		System.out.println("good morning");
	}
	@Test
	public void demotest2() {
		
		Assert.assertTrue(true);
		System.out.println("welcome");
		
		Assert.assertEquals("selenium", "selenium");
		
	}
}

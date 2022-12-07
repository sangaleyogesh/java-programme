package finalconcept;

public class finallyconcept {
	
	
public static void main(String[]args) {
	
//finally is block in java to handle exception error  in java to execute important code	wheather exceptiion occur
	
finallyconcept.m1();
	
finallyconcept.m2();
}
	public static void m1(){
	
	try {
		System.out.println("try is block");
	}
	catch( Exception e) {
		
		System.out.println("exception occur"); //print when exception occur in programe
	}
 finally {
	 
	 System.out.println("finally block");
 }

}

	public static void m2() {
		int i=10;
		
		try {
			int k=i/0;
			System.out.println("div test method");
		}
		catch(ArithmeticException e) {
			
			System.out.println("catch block");
		}
		finally {
			System.out.println("executed code even after eception");
		}
	}
	
	
}

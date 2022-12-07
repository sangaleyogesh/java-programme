package methods;

public class method2{ //class body
	
// regular static method caaling from same class
	
	public static void main(String[]args) { //main method
		
	System.out.println("main method started");
	 //direct calling by method name
		m1();
		m2();
		
		// calling by class name
		
		method2.m1();
		method2.m2();
		
	System.out.println("main method ended");	
	}
	public static void m1() {
		
	System.out.println("static method calling from same class:m1");
	}
	public static void m2() {
		
	System.out.println("static method calling from same class:m2");
	}
	
	
	
	
	
	
	
	
	
	
}
package methods;

public class method1{

	
	public static void main(String[]args){
		//main method started
	System.out.println("main method started");
	// 1.direct calling by method name
	
		System.out.println("direct calling method");
		
	m1();
	m2();
	
	//2. calling by class name
	
// syntax=classname.method();
	
	method1.m1();
	method1.m2();
	
	
	System.out.println("main method ended");
	
	//main method ended
	}
	
public static void m1() {
	
	System.out.println("static method direct calling:m1");
	}


public static void m2() {
	System.out.println("static method direct calling:m2");
	
	
}

	
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


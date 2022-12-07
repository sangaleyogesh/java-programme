package methods;

public class method7{
	
	// Non static regular method calling from different class
	public static void main(String[]args) {
		
	//syntax=classname refvariable=new classname();
		
		method6 obj=new method6();
		
		obj.m1();
		obj.m2();
		
		method7 obj1=new method7();
		obj1.m3();
	}
	
	
	public static void m3() {
		
		System.out.println("static method from same class:m1");
	}
	
	
}
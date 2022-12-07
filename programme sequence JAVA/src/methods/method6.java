package methods;

public class method6{
	
	public static void main(String[]args) {//main method
		
	// non static regular method call from same class
		
	// syntax= classname referencevariable=new classname();	
		
	method6 obj=new method6();
		
		obj.m1();
		obj.m2();
		
	}
	
	public void m1() {
		
		System.out.println("non static regular method calling from same class:m1");
	}
	
	public void m2() {
	
		System.out.println("non static regular method from same class:m2");
	}
}
	

package types_of_variables;


public class static_global_variable{

	
static int i=40;  // static global variable

public static void main(String[]args) {
	
	
	m1();
	
	m2();
	m3();
}
	public static void m1() {
		
	System.out.println(i);
	}
	public static void m2() {
		
	int i=30;	// if there is not assing the varible by int then it will print same value for other methods
		
		
	System.out.println(i);	
	}
 public static void m3() {
	 
	 System.out.println(i);
	 
 }
 }
	
	
	
	
	
	
	
	

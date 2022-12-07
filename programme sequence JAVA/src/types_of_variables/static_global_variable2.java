package types_of_variables;


public class static_global_variable2{
	
	static String name="akash";
	
	static int age=30;
	
public static void main(String[]args) {
	
	System.out.println(name);
	System.out.println(age);
	
	static_global_variable2 GV=new static_global_variable2();
	GV.m2();
	m1();
	
}	
	public static void m1() {
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void m2() {
		
	System.out.println(name);
	
	System.out.println(age);
		
	}

		
		
	}
	
	
	
	
	
	
	
	
	

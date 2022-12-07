package types_of_variables;

public class GV_variable{
	
	static String name="anil";
	
	static int age=35;
	
	public static void main(String[]args) {
		
	System.out.println(name);
	
	System.out.println(age);
		
	
	GV_variable gv=new GV_variable();
	
	gv.m2();
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
package types_of_variables;

public class non_static_global_variable{
	
	String name="akash";
	
	int age=30;
	

	public static void main(String[]args) {
		
	non_static_global_variable NS=new non_static_global_variable();
	
	System.out.println(NS.name);
	
	System.out.println(NS.age);
		
	NS.m1();
		
	}
	
	public void m1() {
		
	System.out.println(name);
		
	System.out.println(age);
	
	}
	
}
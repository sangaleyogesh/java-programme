package types_of_variables;

public class static_global_variable1{
	
static int a=100; //global variable in static way.
	
public static void main(String[]args) {
	
static_global_variable1 GV=new static_global_variable1();

GV.m1();
GV.m2();
GV.m3();
	
}	
	
public void m1() {
	
	System.out.println(a);
}	
public void m2() {
	
	a=30; //if not given int datatype at starting it store the value of a=30 for next method also.
	System.out.println(a); //30
	
}
public void m3() {
	
System.out.println(a);	//30
}	
	
}
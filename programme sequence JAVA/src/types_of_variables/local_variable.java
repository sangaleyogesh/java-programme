package types_of_variables;

public class local_variable{
	
public static void main(String[]args) {
	
	// local varibles declare inside the body of method
	// static and non static method call from same class by using local variable

	m1();
	m2();
	local_variable LV=new local_variable();
	
  LV.m3();

}

	public static void m1() {
		int i=20;
		
		System.out.println(i);		
	}

public static void m2() {
	int j=30;
	System.out.println(j);
}

public void m3() {
	int k=50;
	System.out.println(k);
}

	
}
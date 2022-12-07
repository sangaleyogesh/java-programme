package finalconcept;

public class finalconcept{
	
public static void main(String[]args) {
	
	// final reword=used to restriction on class,variables and method
	
	//can not override the metho  and inherite the class to the child class once declare as final
	
int i=100;

i=200;
System.out.println(i); // not declare as a final

final int j=100; //declare as final

// j=200; //not allwed to change once declare as final

 System.out.println(j);
}
 public final void m1(){ //can not be overide final method 
	
	System.out.println("final method");
}
}	
	
	

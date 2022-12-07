package polymorphism;

public class automaticpromotion {
	
	//automatic promotion-lower size data type can be promoted to the higher data type
	// short-->byte-->int-->long--->float--->double  
	// character-->int 
public static void main(String[]args) {
	

	automaticpromotion ap=new automaticpromotion();
	
	ap.m1();
	ap.m1(10);  //int datatype can be automatically promoted to the long datatype
	ap.m1(3333l); //long datattype can be automatically promoted the double data type
	
}

public void m1(){
	System.out.println("method with zero input parameter");
}
public void m1(int i) {
	System.out.println("method with one int parameter");
}
public void m1(long l) {
	System.out.println("method with long parameter");
	
}


}

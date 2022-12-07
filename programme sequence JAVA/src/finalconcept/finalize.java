package finalconcept;

public class finalize {
	
public static void main(String[]args) {
	
//finalize=	is used to perform cleanup processing just before the object is garbage collected
	
	finalize f=new finalize();
	
	f=null;  //if there is unused method or variable no need to call finalize method
	System.gc();
	
}	
	
public static void m1() {
	
	System.out.println("m1 method");
	
}	
	
	public  void finalize () {
		
		System.out.println("finalize method executed");
	}
	
	

}

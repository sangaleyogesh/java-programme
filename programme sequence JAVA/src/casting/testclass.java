package casting;

public class testclass {
	
	public static void main(String[]args) {
		
		//non primitive casting
		//1. upcasting-assigning the subclass property into the super class is called upcasting
		
		superclass s=new childclass(); //upcasting
		s.start();
		s.stop();
		s.refule();
		
		childclass s1=(childclass) new superclass();  //downcasting
		
		s1.automatic();
		
	}

}

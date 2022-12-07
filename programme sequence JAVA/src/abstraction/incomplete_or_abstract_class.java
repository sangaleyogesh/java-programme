package abstraction;

public abstract class incomplete_or_abstract_class {
	
	//we can not create object of abstract class
	//abstaction means the hiding the unnecesarry information and shows the essential attribute only
	
	
	public void m1() { //complete method
		
		System.out.println("m1 method");  
	}
	public abstract void m2(); //abstract or incomplete method that can be completed in concrete class and implemented in test class
	
	public abstract void m3(); //incomplete method 

}
	


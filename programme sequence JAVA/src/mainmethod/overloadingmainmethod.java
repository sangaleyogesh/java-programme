package mainmethod;

public class overloadingmainmethod {
	
	//main method can be overloaded but not override,jvm always call String[]args method only
	//inheritance concept is applicable if child class doesnt contain main method that time parrent class main method executed

public static void main (String[]args) {
		
	System.out.println("main method string[] overloading");
	
	
}	
	
	
public static void main (int[]args) {
	
	System.out.println("main method int[]overloading");

}
	
	
}

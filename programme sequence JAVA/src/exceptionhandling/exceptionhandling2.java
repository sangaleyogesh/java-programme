package exceptionhandling;

public class exceptionhandling2 {
	
	//we can use multiple catch block with try block 
	//suppose we have used multiple catch block for multiple exception but having null pointer exception that time 
	//only null pointer exxception block will execute
	
	public static void main(String[]args) {
		
	int a=10;
	
	try {
		System.out.println(a/0);
		}
	catch(Exception e){  //exeception e==generic exception when exception does not know that time use this
		
		System.out.println("this/by zero");
		
	}
		
	String s=null;
	
	try {
		System.out.println(s.length());
	}
	catch(NullPointerException e) {
			System.out.println("null pointer");
		}
	
	catch(ArithmeticException e){
		System.out.println("arithmetic exception"); //automatically does not execute because exception is null pointer
	}
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println("arrayindexoutofboundexception"); //automatically does not execute because exception is null pointer
	}
	
	}
}

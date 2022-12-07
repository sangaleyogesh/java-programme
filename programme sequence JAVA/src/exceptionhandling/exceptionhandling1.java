package exceptionhandling;

public class exceptionhandling1 {
	
	public static void main(String[]args) {
		
		int a=10;
		
		try {
			
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace(); //this method use to print exception message
			
			System.out.println(e.getMessage());
			
			System.out.println("this/by zerro");
		}
		System.out.println("eee");
	
	}
	
	
	
}

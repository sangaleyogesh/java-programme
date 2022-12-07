package exceptionhandling;

public class trycatchfinally {
	
	public static void main(String[]args) {
		
		
		int arr[]=new int[5];
		
		
		try {
			arr[10]=100;
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			e.printStackTrace();  //to print exception message,not mandatory to write this
			System.out.println(e.getMessage());
			
			System.out.println("arrayouofboundexception");
			
		}  
		finally {
			System.out.println("finally block executed");
		}
		//finally block excuted always
		//exception occur &catch block handle it, finally block executed
		//exception occur &catch block not handle ,finally block will execute
		//exception not ocuur &catch block ignore ,finally block will execute
	}

}

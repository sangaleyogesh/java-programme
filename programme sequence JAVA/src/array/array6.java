package array;

public class array6 {
	
	//object array
	
	public static void main(String[]args) {
		
		
		Object obj[]=new Object[4];
		
		obj[0]="ankit";  //string type
		obj[1]='a'; // char type
		obj[2]='@'; //char
		obj[3]=4; //int type
		
		for (int i=0; i<obj.length; i++) {
			
			System.out.println(obj[i]);
		}
	}

}

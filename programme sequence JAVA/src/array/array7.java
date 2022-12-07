package array;

public class array7 {
	
	// to find duplicate value
	
	public static void main(String[]args) {
	
	int a[] = {6,6,7,48,56,48};
	
	for(int i=0; i<a.length; i++) {  //i=0; 0<6 0+1=1; i=1; 1<=6;, 1+1=2 
		

		for(int j=i+1; j<a.length; j++) {  //j=0;  0<1 0+1=1,1  
		

		      if(a[i]==a[j])  //a[1]==a[0], 6==6  ,
				
				System.out.println(a[j]);

		}
	}
	
	}
}

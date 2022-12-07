package array;

public class maxnumberarray1 {
	
	public static void main(String[]args) {
		
		int a[]= {40,50,90,80};
		
		int maximum=a[0];
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]>maximum) {
				
			maximum=a[i];	
			}}
			System.out.println("max number"+maximum);
		
		
		
	}

}

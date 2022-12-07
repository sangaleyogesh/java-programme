package array;

public class maxno {
	
	public static void main(String[]args) {
		
		int a[]= {10,20,30,200,800};
		
	int maxno=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if( a[i]>maxno){
				
				maxno=a[i];
				}
	

		}
		
		
		System.out.println(maxno);

		
		
	}

}

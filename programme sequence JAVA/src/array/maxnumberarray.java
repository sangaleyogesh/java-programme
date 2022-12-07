package array;

public class maxnumberarray {
	//printing max number
	
	public static void main(String[]args) {
		
		int a[]= {1,2,3};
		
		int maximum=a[0];
		
		// i=0 ,a[0]=1; ,1>1 ,(maximuma[0]=1) false, maximum=1;
		// i=1, a[1]=2;  2>1  true, maximum=1; true
		//i=2, a[2]=3;   3>2;  maximum=3; true
		for (int i=0; i<a.length; i++) {
			
			if(a[i]>maximum) {
				
				maximum=a[i];}}
		
		System.out.println("max number"+maximum);
	
		
		}
}

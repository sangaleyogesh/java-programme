package array;

public class arraysum1{
	
public static void main (String[]args) {
	
 int a[]= {1,2,3,4,5,16};
 
 int sum=0;
 
 for(int i=0; i<a.length; i++) {
	 
	  sum=sum+a[i];
	  
	/*  0=0+1;
	  1=1+2
	  3=3+3;
	  6=6+4;
	  10=10+5;
	  15=15+16;
	  sum=31
	  */
	  
 }
	System.out.println(sum);
}
	
}
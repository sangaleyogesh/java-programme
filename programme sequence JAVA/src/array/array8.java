package array;

public class array8{
	
public static void main(String[]args) {
	
 int a[]= {15,56,250,35,78};
 
 int maxno=a[0];
 
 for(int i=0; i<a.length; i++) {
	 
if(a[i]>maxno) {
	
	maxno=a[i];
	
}
	 
 }
	System.out.println(maxno);
	
	
}	
	
	
}
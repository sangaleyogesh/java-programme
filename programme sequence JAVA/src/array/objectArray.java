package array;

public class objectArray {
	
public static void main (String[]args) {
	
	
	Object a[]=new Object[5];
	
	a[0]="akash";
	a[1]="@";
	a[2]=10;
	a[3]='a';
	a[4]=20.1;
	
	
	for(int i=0; i<a.length;i++) {
		
		System.out.println(a[i]);
	}
	
}	

}

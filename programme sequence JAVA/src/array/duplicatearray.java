package array;

import java.util.Arrays;

public class duplicatearray {
	
	public static void main(String[]args) {
		
		int a[]={2,2,3};
		
		
		for(int i=0; i<a.length;i++) { //when it get run 1 time ,2time next loop will execute
			
			//i=0 ; 0<3 true condition it will go to second loop
			
			
			for(int j=i+1; j<a.length; j++) {// if this loop get false value then it will go for first loop
			//j=0+1 ;1<3; true condition it will go to if loop
			//j=0+2; 2<3; true condition it will go to if loop	
			//j=0+3; 3<3; false condition it will go to first for loop(this loop will get false cond then go for first loop otherwise it will execute

			if(a[i]==a[j])
			
			// a[0]==a[1] ; 
			//	2==2 true condition it will go to printing statement
			// a[0]==a[2] ; 
			//	2==3 false condition it will go to second for loop 

			System.out.println(a[j]);}	
			}
			
		}
		
		
		
	}



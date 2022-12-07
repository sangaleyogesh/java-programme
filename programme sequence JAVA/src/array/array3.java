package array;

import java.util.Arrays;

//character type array

public class array3 {

	public static void main(String[]args) {
		
		char c[]=new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		
		Arrays.sort(c);
		
		for(int i=0; i<c.length; i++) {
			
			System.out.println(c[i]);
		}
		
		
	}
	
	
}

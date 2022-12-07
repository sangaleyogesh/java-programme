package array;

import java.util.Arrays;

public class doublearray {
	//two dimensional array
	
	public static void main(String[]args) {
		
		String s[][]=new String[3][4];
		
		s[0][0]= "a1";
		s[0][1]= "a2";
		s[0][2]= "a3";
		s[0][3]= "a4";
		
		
		s[1][0]="b1";
		s[1][1]="b2";
		s[1][2]="b3";
		s[1][3]="b4";
		
		s[2][0]="c1";
		s[2][1]="c2";
		s[2][2]="c3";
		s[2][3]="c4";
		
		System.out.println(s.length);
		System.out.println(s[0].length);

		
		for(int i=0; i<s.length; i++) {
			
			for(int j=0; j<s[0].length; j++) {
				
				System.out.println(s[i][j]);
			}
		}
				
		}
		
		
		
	

}

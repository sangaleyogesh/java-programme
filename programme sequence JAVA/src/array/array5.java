package array;

import java.util.Arrays;

public class array5 {

	//string array
	
	public static void main(String[]args) {
		
	String s[]=new String[4];
	
	s[0]="vikas";
	s[1]="vilas";
	s[2]="anil";
	s[3]="avi";
	
	Arrays.sort(s);
	
	for(int i=0; i<s.length;i++) {
		System.out.println(s[i]);
		}
	}
	}


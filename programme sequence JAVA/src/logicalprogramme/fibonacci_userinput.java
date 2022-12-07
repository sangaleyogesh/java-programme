package logicalprogramme;

import java.util.Scanner;

public class fibonacci_userinput {
	
	//if we enter number 10 it will print up to the 10 index fibonacci
	
	public static void main(String[]args) {
		
		int a=-1;
		int b=1;
		int c;
		System.out.println("enter no");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			c=a+b;
			
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}

}

package logicalprogramme;

import java.util.Scanner;

public class paliandromenumber {
	
	//palindrome number is the number is same from right to left i.e 1221--from right --from left--1221
	//eg-1312 --from right =1312 &from left-2131 i.e not palindrome number
	
	public static void main(String[]args) {
		
		System.out.println("enter number");  //if num=1221
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int sum;
		int rem;
		int orignalnumber=num;
		
		for(sum=0; num>0; num=num/10) {//if num=1221, 1221>0 true,num=1221/10=122;num=122/10=12;num=12/10=1;
			
			rem=num%10; //rem=1221%10=1 modulus,rem=122%10=2 modulus;rem=12%10=2modulus,rem=1/10=1;
			sum=sum*10+rem; //sum=0*10+1=1,sum=1*10+2=12;sum=12*10+2=122;sum=122*10+1=1220+1=1221 is the palindrome nu
			
		}
		if(sum==orignalnumber) {
			System.out.println("is palindrome number");
		}
		else {
			
			System.out.println("is not palindrome number");
		}
		
	}
}

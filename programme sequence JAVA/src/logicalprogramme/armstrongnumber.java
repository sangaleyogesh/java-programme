package logicalprogramme;

import java.util.Scanner;

public class armstrongnumber {
	
	//armstrong number is number cube sum is the same as number  
	//i.e-153 is the armstrong no--1^3=1,5^3=125, 3^3=27, sum=1+125+27=153 is armstrong number
	
	public static void main(String[]args) {
		
		System.out.println("enter number");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum;
		int rem; //reminder
		
		for(sum=0; num>0; num=num/10) { //if num=153,153>10 true; num=153/10=15,15>0 true; num=5/10=1,1>0 true
			
			rem=num%10;  //rem=153%10=modulus=3; rem=15%10=5 modulus(baki); rem=1%10=1 modulus
			sum=sum+rem*rem*rem; //sum=0+3*3*3=27; sum=27+5*5*5=27+125=152; sum=152+1*1*1=153
			
			
		}
		
		if(sum==num) { //153==153 true printing armstrong number otherwise printing not armstrong number
			System.out.println("is armstrong number");
		}
			else
				System.out.println("not armstrong number");
		
	}

}

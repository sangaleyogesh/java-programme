package logicalprogramme;

import java.util.Scanner;

public class primenumber1{
	
public static void main(String[]args) {
	
System.out.println("Enter number");

Scanner sc=new Scanner(System.in);


int num =sc.nextInt();

int i;   //num=3 enter
	
for( i=2; i<num;i++) { //i=2,2<3 true, i=3 ,3<3 false it will move directly next if block after first else block break
	
	if(num%i==0)   //3/2 modulus=1, condition will break
		
		break;
	}	
	if(i==num) { //i=3, num=3 3==3 true otherwise it will jump to else block
		System.out.println("prime number");
	}
	else
	{System.out.println("is not prime number");}
	
}	
	
	
	
	
}
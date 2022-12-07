package constructor;

public class constructor2{ //user defined constructor with two parameter
	
int i;
int j;
double k;

public constructor2(int num,int num1) {
	
i=num;
j=num1;
	
}
public constructor2(int x, double y) {
	
	i=x;
	k=y;	
}

	


public static void main(String[]args) {
	
constructor2 s1=new constructor2(20,30);	
	
	System.out.println(s1.i+" "+s1.j);
	
	constructor2 s2=new constructor2(40,50.1);
	System.out.println(s2.i+" "+s2.k);
}
	
	
	
}
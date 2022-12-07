package constructor;

public class constructor1{
	
int i;

int j;

public constructor1() { //user defined constructor without parameter
	
	i=20;
	j=30;
	
}
//usage
	
public void m1() {
	
	
	System.out.println(i);
	
	System.out.println(j);
	
}
public static void main(String[]args) {
	
constructor1 s1=new constructor1();

s1.m1();


	
}

	
}
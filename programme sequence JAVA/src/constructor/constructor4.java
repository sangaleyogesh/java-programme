package constructor;

public class constructor4 {
	
	//cons with two parameter
	int i;
	int j;
	
	public constructor4(int x,int y) {
		
	i=x;
	j=y;
	}
public void m1() {
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(i+j);
	System.out.println(i-j);
}

public static void main(String[]args) {
	
	constructor4 ud=new constructor4(40,30);
	constructor4 ud1=new constructor4(10,20);
ud.m1();
ud1.m1();
}
}

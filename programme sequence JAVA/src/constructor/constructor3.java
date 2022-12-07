package constructor;

public class constructor3 {
	//user define constructor without parameter
	int i;
	int j;
public constructor3() {
	
	i=30;
	j=20;
	
}	
public void m1() {
	
	System.out.println(i+j);
	System.out.println(i/j);
	System.out.println(i%j);
}	
public static void main(String[]args) {
	
constructor3 ud=new constructor3();
ud.m1();

}
}

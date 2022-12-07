package constructor;

public class constructor6 {

	int i;
	int j;
	String name;
	
	public constructor6() {//without parametr constructor
		
		i=20;
		j=30;
		name="akash";
	}
	
	public constructor6(int x, String name1) {//with two parameter constructor
		
		
		i=x;
		name=name1;
		
	}
	public void m1() {
		
	System.out.println(i+" "+j+" "+name);
	System.out.println(i+" "+name);
	}
	
	public static void main(String[]args) {
		
		constructor6 ud= new constructor6();
			ud.m1();
		constructor6 ud1=new constructor6(100,"amar");
		ud1.m1();
	}
	
}



package constructor;

public class constructor5{
	
	//constructor with parameter
	
	int i;
	int j;
	String name;
	public constructor5(int x,int y,String name1) {
		
	i=x;
	j=y;
	name=name1;
		
	}
	
	public void m1() {
		
		System.out.println(i+" "+j+" "+name);
	}
	
	public static void main(String[]args) {
		
	constructor5 ud=new constructor5(100,50,"ankita");
	ud.m1();
		
	}
	
	
	
	
}
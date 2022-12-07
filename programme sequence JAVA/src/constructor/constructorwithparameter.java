package constructor;

public class constructorwithparameter {
	
	int i;
	int j;
	
	//constructor with parameter
	
	public constructorwithparameter(int x, int y) {
		
		i=x;
		j=y;
	}
	public void m1() {
		
		System.out.println(i);
		System.out.println(j);
		
		
	}
	public static void main(String[]args) {
		
		constructorwithparameter ud= new constructorwithparameter(100,30);
			ud.m1();
		
	}
	

}

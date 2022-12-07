package this_and_superkeyword;

public class this_keyword {
	
	// this keyword used to access same name global variable from same class
	
	int i=30;
	String name="aniket";
	
	public static void main(String[]args) {
	
		this_keyword s= new this_keyword();
		s.m1();
	}
	
	public void m1() {
		
		
		int i=40;
		String name="ashok";

		
		System.out.println(i);
		
		System.out.println(name);
		
		System.out.println(this.i); //for global variable i=30;
		
		System.out.println(this.name); //for global variable name=aniket;
		
	}

}

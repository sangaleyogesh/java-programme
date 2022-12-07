package this_and_superkeyword;

public class super_keyword extends this_keyword {

	int i=20;
	String name="anil";

public static void main(String[]args) {
	
	super_keyword s1=new super_keyword();
	s1.m1();
	
}	
	
public void m1() {
	
	int i=40;
	String name="ankita";
	
	System.out.println("local variable from same class:"+i);
	System.out.println("local variable from same class:"+name);
	System.out.println("global variable call from same class:"+this.i);
	System.out.println("global variable call from same class:"+this.name);
	System.out.println("GV call from diff class:"+super.i);
	System.out.println("GV call from diff class:"+super.name);
	
	
}
}

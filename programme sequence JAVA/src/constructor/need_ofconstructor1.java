package constructor;

public class need_ofconstructor1{
	
	String name;
	int rollno;
	
	// by default string=null &  int=0;
	
public static void main(String[]args) {
		
	need_ofconstructor1 s=new need_ofconstructor1();
		
	need_ofconstructor1 s1=new need_ofconstructor1();

		s.m1();
		

	}
	
public void m1() {
	
	System.out.println(name+" "+rollno);
}
	
	
	
	
	
	
}
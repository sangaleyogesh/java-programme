package accessSpecifier;

public class sample1{
	//if we declare any member of class as public then the scope of that member throughout the project
	
public	int i=10;

public static void main(String[]args) {

sample1 s1=new sample1();	
System.out.println(s1.i);
s1.m1();
}
	
public void m1() {
	
	System.out.println("access specifier:public");
}
}
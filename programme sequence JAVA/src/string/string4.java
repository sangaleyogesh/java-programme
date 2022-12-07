package string;

public class string4 {
	
	
public static void main(String[]args) {
	
	//why string is immutable
	//ans-1) if we create a 5 ref or more with th ref of one object that time if we change one ref name that time all the ref will be 
	//affected so string is immutable.
	//2. for security purpose
	
	String s1="java";
	String s2="java";
	
	s2="python";
	
	System.out.println(s2); 
	
}
	
	

}

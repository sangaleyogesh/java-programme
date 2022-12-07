package string;

public class indexof {
	
	public static void main(String[]args) {
		
	String s1="java language java";
	
	//first occurance
	
	System.out.println(s1.indexOf("a"));
	
	//second occuerence
	
	System.out.println(s1.indexOf("a", s1.indexOf("a")+1));
	//third occurence
	
	System.out.println(s1.indexOf("a", s1.indexOf("a",s1.indexOf("a", s1.indexOf("a")+1)+1)));
		
	//fourth occurence
	
	System.out.println(s1.indexOf("a", s1.indexOf("a",s1.indexOf("a", s1.indexOf("a",s1.indexOf("a"))+1)+1)+1));
	
	System.out.println(s1.indexOf("a", s1.indexOf("a",s1.indexOf("a", s1.indexOf("a",s1.indexOf("a",s1.indexOf("a")+1)+1)+1))+1));

	
	}

}

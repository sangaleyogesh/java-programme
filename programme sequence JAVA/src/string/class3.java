package string;

public class class3 {

//diff. between equals == and .equals method
	
public static void main(String[]args) {
	
String s1=new String("automation");

String s2=new String("automation");

//1.equals method ==

System.out.println(s1==s2);  //false both adress of string s1&s2 diff

//2. .equals method 
 
System.out.println(s1.equals(s2)); //true both string character are same(automation)
	
}
	
	
	
}

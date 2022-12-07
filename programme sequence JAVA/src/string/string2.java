package string;

public class string2 {
	
//string memory allocation how many obj will create
	
	
	
public static void main(String[]args) {
	
String s1=new String("java"); //create new obj in heap and scp area s1 name

String s2=new String("java"); //create new obj s2 in heap area but link with s1 same obj in scp area

String s3="java";

String s4="java";
	
System.out.println( s3==s4); // s3 and s4 are at same obj in scp area

System.out.println(s1==s2); //both obj s1&s2 location are at diff location so it print false

System.out.println(s1.equals(s2)); //both name java same for string s1& s2 so it is true
	
// ==equals operator print true when both location of obj will same otherwise print false
// .equals method print true when ref variable decl name same
	
//there will be 3 obj will create 2 is in heap  area and one is in scp area
	
}
	
	
	
	
	
	

}

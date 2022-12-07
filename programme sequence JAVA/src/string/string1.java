package string;

public class string1{
	
public static void main(String[]args) {
	
// memory allocation
	
String s=new String("java"); //when declared as new keword then object will be created in heap memory and string constant pool area(scp)

String s1= "java"; //when declared witout new keyword object will be created in scp area
	
String s3=s;

System.out.println(s3==s);

System.out.println(s==s1);
	
}	
	
	
	
	
}
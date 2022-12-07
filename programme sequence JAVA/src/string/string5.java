package string;

public class string5{
	
public static void main(String[]args) {
	
//string method
	
//1.charAt() method-it returns the character index in string
	
String s1="automation";	
String s2="automation";

System.out.println("index:"+s1.charAt(2));

//************************************************************************************


//2.length(); to find the length of  index

System.out.println("length:"+s1.length());

//************************************************************************************


//3 .equals- it check equality with obj

System.out.println(".equals method:"+s1.equals(s2)); 

//************************************************************************************
	

//4.isempty-to check wheather 

String s3="anil";
String s4="";

System.out.println("isempty:"+s3.isEmpty());  //false
System.out.println(s4.isEmpty()); //TRUE

//************************************************************************************

//5. replace-used to replace single old character with new
String s5="ankita";

System.out.println("replace:"+s5.replace('k', 'p'));

System.out.println("replce:"+s5.replace("ankita", "arpita"));

//************************************************************************************

//6.replaceall-used to replce all word

String s6="java is language";

System.out.println("replaceall:"+s6.replaceAll("java","python"));

System.out.println("replaceall:"+s6.replaceAll("j","p"));

//************************************************************************************

//7.substring- starting included and end is excluded index

String s7="python";

System.out.println("substring:"+s7.substring(3,6));

System.out.println("substring:"+s7.substring(1));

//************************************************************************************

//8.indexof-to print first occurance of character

String s8="python ruby class pythtn";

System.out.println("first index:"+s8.indexOf("t")); //for printing first occurance

System.out.println("second index:"+s8.indexOf("t",s8.indexOf("t")+1)); //scocond occurance

System.out.println("third ocurence:"+s8.indexOf("t",s8.indexOf("t",s8.indexOf("t",s8.indexOf("t")+1)+1)));

//************************************************************************************


//9.split

String s9="20-02-2022";

String s10[]=s9.split("-");

for(int i=0; i<s10.length;i++) {
	
	System.out.println(s10[i]);
}

//************************************************************************************


//10 lastindexOf-to print lastindex

String s11="python";

System.out.println("last index:"+s11.lastIndexOf("n"));

//************************************************************************************


//11 tolowercase

String s12="JAVA";

System.out.println(s12.toLowerCase());

//************************************************************************************

//12.Uppercase

String s13="java";

System.out.println(s13.toUpperCase());

//************************************************************************************


//13.trim-used to remove 1st and last space

String s14=" welcome welcome ";

System.out.println("trim:"+s14.trim());

//************************************************************************************


//14.concat method-used to concat two words

String s15="hello";

System.out.println("concat:"+s15.concat("java"));

//************************************************************************************

String s16="hello";
String s17="world";
 int a=10;
 int b=20;
 
 System.out.println(s16+s17); //helloworld
 System.out.println(a+b+s16+s17); //30 hello world
 System.out.println(s16+s17+a+b); //helloworld1020

//************************************************************************************































}	
	
	
}
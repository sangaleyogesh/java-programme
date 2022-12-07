package Datatypes;

public class NumericandNondecimal{ //class body

public static void main(String[] args){//main method body

	System.out.println("1.Numeric and Non decimal Data type--->");
	System.out.println();
//1.syntax=dataype variable=byte=8bit=range=-128 to 127

byte b1=-128; //min limit 

//byte b2=-129; not allowed

byte b3=127; //max limit

//byte b4=128; not allowed

System.out.println("byte data type min limit:"+b1);
System.out.println("byte data type max limit:"+b3);
System.out.println();
System.out.println("******************************************");

//2.syntax=data type variable=short=2byte=16 bit=range=-32768 to 32767

short s1=32767;  //max limit value
//short s2=32768;  // not allowed
short s3=-32768; // min limit
//short s4=-32769; // not allowed

System.out.println("short data type max limit:"+s1);
System.out.println("short data type min limit:"+s3);
System.out.println();
System.out.println("******************************************");

//3.syntax=datatype=int=4byte=32 bit=range= -2147483648 to 2147483647

int i1=2147483647; //max limit
// int i2=2147483648;  not allowed
int i3=-2147483648; //min limit
//int i4=-2147483649; not allowed

System.out.println("int data type max limit:"+i1);
System.out.println("int data type min limit:"+i3);
System.out.println();
System.out.println("*****************************************");

//4.syntax=data type=long=8 byte=64 bit

long l1=1234564565l;
long l2=-1234564565l;

System.out.println("long data type:"+l1);
System.out.println("long data type:"+l2);
System.out.println();
System.out.println("*******************************************");



}}
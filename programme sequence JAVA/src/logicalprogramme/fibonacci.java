package logicalprogramme;

public class fibonacci {
	
	//fibonacci is the next number is the sum of first two numbers
	//e.g--0,1,1,2,3,5,8,13,21,34
	
	public static void main(String[]args) {
		
	int a=-1; 
	int b=1;
	int c;
	
	for(int i=1; i<=10;i++) { //i=1;1<=10 true,i=2; 2<=10;true,i=3; 3<=10 true upto <=10
		
		c=a+b;  //c=-1+1=0; c=1+0=1,c=0+1=1,c=1+1=2,c=1+2=3,c=2+3=5,c=3+5=8,c=5+8=13,c=8+13=21,c=13+21=34;
		
		System.out.println(c);
		
		a=b; //a=1,a=0;a=1,a=1,a=2,a=3,a=5,a=8,a=13,
		b=c; //b=0, b=1,b=1,b=2,b=3,b=5,b=8,b=13,b=21
		
	}
		
		
	}

}

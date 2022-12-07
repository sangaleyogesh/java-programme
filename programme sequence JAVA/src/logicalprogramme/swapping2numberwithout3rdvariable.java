package logicalprogramme;

public class swapping2numberwithout3rdvariable {
	
	//swapping 2number without 3rd variable
	public static void main(String[]args) {
		
	int a=10;
	int b=20;
	
	a=b+a; //30
	
	b=a-b; //30-20=10
	a=a-b; //30-10=20
	
	System.out.println("after swapping:"+a+" "+b);
	}

}

package logicalprogramme;

public class multiplication_without_multi_operator {
	
	//without using multiplication operator multiplication
	public static void main(String[]args) {
		
		int a=5;
		
		int b=15;
		
		int mul=0;
		for(int i=1; i<=a; i++) { //i=1; i<=5; true, i=2; 2<=5; true,i=3 ;3<=5 true,i=4;4<=5 true,i=5;5<=5 true 
			
			mul=mul+b;  //mul=0+15=15; mul=15+15=30; mul=30+15=45; mul=45+15=60; mul=60+15=75
		}
	System.out.println(mul); //mul=75
	}

}

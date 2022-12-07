package logicalprogramme;

public class leapyear {
	
	//to find the leap year
	
	public static void main(String[]args) {
		
	int year=1600;
	
	if((year%4==0&& year%100!=0)||(year%400==0)){ //((year/4 modulus==0and year/100not equal to=0) or (year/400==0))
		
		System.out.println("is leap year");
	}
	else {
		
		System.out.println("is not leap year");
	}	
	
	
	}

}

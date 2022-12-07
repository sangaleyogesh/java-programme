package logicalprogramme;

public class factorial {
	
	public static void main(String []args) {
		
	//factorial of number 5is--->5*4*3*2*1=120
		int sum=5;
		
		int factorial=1;
		
		for(int i=1; i<=sum; i++) { //i=1 1<5 true,i=2 2<=5 true,3<=5 true,4<=5 true ,5<=5 true
			
			factorial=factorial*i; // fa=1*1=1, fa=1*2=2,fa=2*3=6, fa=6*4=24, factorial=24*5=120
			
		}
		System.out.println(factorial);

	}

}

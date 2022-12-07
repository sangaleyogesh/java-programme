package logicalprogramme;

public class missingnumber {
	
	//to find the missing number
	
	public static void main(String[]args) {
		
	int arr[]= {1,2,3,4,6,7,8,9,10};
	
	int sum=0;
	
	for(int i=0; i<arr.length; i++) {
		
		sum=sum+arr[i];			
	}
		
	System.out.println("sum of the numbers:"+sum);

	int sum1=0;

	for(int i=0; i<=10;i++) {
		
		
		sum1=sum1+i;
		
	}
	System.out.println("sum of 1 to 10 no:"+sum1);

	System.out.println(sum1-sum);
	}
	

}

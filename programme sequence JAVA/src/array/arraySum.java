package array ;

public class arraySum{
	
public static void main(String[]args) {
	
	//array sum program
int arr[]= {4,1,2,3,5};	// array declaration and intitialisation 
	
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	
	System.out.println(arr.length); //to find the length of array
	
	
	int sum=0;
	for(int i=0;i<=arr.length; i++){
		
	sum=sum+i;	
	}
	System.out.println(sum);
	
}

}
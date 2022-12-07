package array;

public class duplicatenum_array {
	
	
	public static void main(String[]args) {
		
	int arr[]= {1,2,3,4,3,2,5}; //to find a duplicate number in array
	
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=3;
	arr[5]=2;
	arr[6]=5;
	
	for(int i=0; i<arr.length;i++) {
		for(int j=i+1; j<arr.length; j++) {
			
			if(arr[i]==arr[j])
				
				System.out.println(arr[j]+" ");
				
		
		}}
		
	}
	

	}



package array;

public class arrayascendingorder {
	
	public static void main(String[]args) {

	
	int arr[]= {10,5,6,8,25,2,30};
	
	int temp;
	
	
	for(int i=0; i<arr.length; i++) {
		
		for(int j=i; j<arr.length; j++) {
			
			
			if(arr[i]>arr[j]) {
				
				temp=arr[i];
				
				arr[i]=arr[j];
				
				arr[j]=temp;
			}
		}
		
			System.out.println(arr[i]);
		
		
	}
}
}

package array;

import java.util.Arrays;

public class array2{
	
public static void main (String[]args) {
	
	
	int arr[]= new int[5]; //array length 5 syntax datatype var=new datatype[length];
	
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;  // index always n-1, for array length 5 index n=5-1=4
	
	System.out.println(arr.length);  // printing array length
	
	Arrays.sort(arr);  //sorting array in sequence
	
	for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);}
	
}	
	
	
}
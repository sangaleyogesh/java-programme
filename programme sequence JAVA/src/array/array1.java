package array;

import java.util.Arrays;

public class array1{
	
public static void main(String[]args) {
	
 int arr[] = new int[6];
	
arr[0]=10;
arr[1]=9;
arr[2]=8;
arr[3]=7;
arr[4]=6;
arr[5]=5;

Arrays.sort(arr);
 for (int i=0;i<arr.length; i++) {

System.out.println(arr[i]);}

}	
	
	
}
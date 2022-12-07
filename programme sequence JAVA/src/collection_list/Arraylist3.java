package collection_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist3 {
	
public static void main(String[]args) {
	
	String arr[]= {"cat","dog","elephant"};
	
	for(Object o:arr) {
		
		System.out.println(o);
	}
	
	//convert array in to arraylist
	
	ArrayList AL=new ArrayList(Arrays.asList(arr));
	System.out.println(AL);
}	

}

package collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	
public static void main(String[]args) {
	
	HashSet hs=new HashSet();
	
	hs.add('A');
	hs.add(100);
	hs.add("Python");
	hs.add("Java");
	hs.add(5);
	
	System.out.println(hs);
	
	//add method
	
	System.out.println(hs.add("Python")); //if ur try to add same element then it will return the false
	System.out.println(hs.add("science")); //if ur try to add same element then it will return the true

	//remove method
	
	hs.remove('A');
	System.out.println(hs);
	
	
	
	//set method not present in Hashset
	
	//contains method--it returns true or false 
	System.out.println(hs.contains("Java"));
	
	//Isempty -it returns true or false 
	System.out.println(hs.isEmpty());
	
	//in collection for loop not allow due to .get method not available and set method not having in Hashset
	
	//for(int i=0; i<hs.size(); i++) {
		
	//	System.out.println(hs.get());
	System.out.println("print all element using for each loop");
	for(Object obj:hs) {
		System.out.println(obj);
	}

	Iterator it=hs.iterator();
	

}	

	

}

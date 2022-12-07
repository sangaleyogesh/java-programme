package collection_set;

import java.util.HashSet;

public class Hashset2 {
	
public static void main(String[]args) {
	
	HashSet<Integer> hs=new HashSet<Integer>();
	
	hs.add(5);
	hs.add(6);
	hs.add(7);
	hs.add(8);
	System.out.println(hs);
	
	HashSet <Integer> hs1=new HashSet<Integer>();
	
	hs1.add(6);
	hs1.add(8);
	hs1.add(4);
	
	//add all element Union method
	hs.addAll(hs1);
	System.out.println(hs);  //duplicate element not printing two time,only one time
	
	//interaction only duplicate element printing
	
	hs.retainAll(hs1);
	System.out.println("common:"+hs);
	
	//removeall
	hs.removeAll(hs1);
System.out.println(hs);

//contains
System.out.println(hs.contains(hs1)); //it will return true or false
	
}	
	
	
	

}

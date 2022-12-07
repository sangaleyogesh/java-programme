package collection_set;

import java.util.LinkedHashSet;

public class LinkedHashset3 {
	public static void main(String[]args) {
	
	LinkedHashSet lhs=new LinkedHashSet();
	//insertion order is preserved
	//same methods as per Hashset
			
	lhs.add(400);
	lhs.add(500);
	lhs.add(600);
	lhs.add(700);
	
	System.out.println(lhs);
	
	System.out.println(lhs.add(400));  //if we add a duplicate element it will return false
	System.out.println(lhs.add(800));  //if we add a not duplicate element it will return true
	System.out.println(lhs);

	
	}
	
	
}

package collection_list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList3{
	
public static void main(String[]args) {
	
LinkedList<String> LL=new LinkedList<String>();
	
	
	LL.add("cat");
	LL.add("cat");
	LL.add("Horse");
	LL.add("dog");
	
	System.out.println(LL);
	
	//addfirst
	
	LL.addFirst("Monkey");
	System.out.println(LL);
	
	//addlast
	LL.addLast("Tiger");
	System.out.println(LL);
	
	//getfirst
	System.out.println(LL.getFirst());
	
	//getlast
	System.out.println(LL.getLast());
	
	//sort
	
	Collections.sort(LL);
	
	System.out.println(LL);
}	
	
	
	
	
	
	
	
	
	
	
	
	
}
package collection_list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2{
	
public static void main(String[]args) {
	
	LinkedList <String> LL=new LinkedList<String>(); //homogeneous type LinkedList
	
	LL.add("b");
	LL.add("a");
	LL.add("c");
	LL.add("e");
	LL.add("d");
	
	System.out.println(LL);
	
	LinkedList<String> LL1=new LinkedList<String>();
	//1.addAll
	
	LL1.addAll(LL);
	System.out.println(LL1);
	
	//2.removeAll
	LL1.removeAll(LL);
	System.out.println(LL1);
	//3.isempty
	
	System.out.println(LL1.isEmpty());
	
	//4.sort
	
	Collections.sort(LL);
	System.out.println(LL);
	
	//5.SHUFFLE
	
	Collections.shuffle(LL);
	System.out.println(LL);
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
}
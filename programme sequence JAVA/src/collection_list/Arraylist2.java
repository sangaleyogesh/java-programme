package collection_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist2{
	
public static void main(String[]args) {
	
	
ArrayList AL=new ArrayList();
	
//add method

AL.add("B");
AL.add("A");
AL.add("D");
AL.add("c");

System.out.println(AL);
//addall method

ArrayList duplicate=new ArrayList();

duplicate.addAll(AL);
System.out.println("addall method:"+AL);

//removeall method

duplicate.removeAll(AL);
System.out.println("remove all method:"+duplicate);
//ISEMPTY
System.out.println(duplicate.isEmpty());

//collection method
//1.sort
Collections.sort(AL);
System.out.println(AL);
Collections.sort(AL,Collections.reverseOrder());
System.out.println(AL);

//2.SHUFFLE METHOD
Collections.shuffle(AL);
System.out.println(AL);


	
	
	
}	
	
	
	
	
}
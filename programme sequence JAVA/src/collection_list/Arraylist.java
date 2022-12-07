package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist{
	
public static void main(String[]args) {
	
ArrayList AL=new ArrayList();

AL.add(100);    //TO ADD ELEMENT INTO ARRAYLIST
AL.add("JAVA");
AL.add('A');
AL.add("welcome");
AL.add(null);

System.out.println(AL);
//1.LENGTH

System.out.println(AL.size());

//2.insert element in to arraylist

AL.add(20.5);
System.out.println(AL);		

//3.Remove element from arraylist

AL.remove(20.5);
System.out.println(AL);

//4.REPLACE ELEMENT TO ARRAYLIST

AL.set(1, "PYTHON");
System.out.println(AL);

//5.add element to perticular index
AL.add(1, "SELENIUM");
System.out.println(AL);

//6.retrive specific element from araylist
System.out.println(AL.get(1));
System.out.println(AL.get(2));

//7.contains --ttrue or false
System.out.println(AL.contains("PYTHON"));

//8.isempty--tru or false

System.out.println(AL.isEmpty());  //false

System.out.println("print array by using for loop");


for(int i=0;i<AL.size();i++) {
	System.out.println(AL.get(i));
}

System.out.println("print array by using for each loop");

for(Object obj:AL) {
	
	System.out.println(obj);
}
System.out.println("print array by using iterator");

Iterator it=AL.iterator();

while(it.hasNext()) {
	
	System.out.println(it.next());
}



}	
	
}
package collection_list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	
	//vector is legacy class

	
	public static void main(String[]args) {
		
	Vector <Integer> vc=new Vector<Integer>();
	
	//add element in vector
		vc.add(10);
		vc.add(15);
		vc.add(5);
		vc.add(20);
		vc.add(25);
		vc.add(4);
		vc.add(2);
		//print all element
		System.out.println("print all the element:"+vc);
		
		//remove element at perticular index
		
		vc.remove(2);
		System.out.println("After removing:"+vc);
		
		//add element at perticular index
		vc.add(3, 35);
		System.out.println("After adding element:"+vc);
		
		//replace or update element at perticular index
		
		vc.set(2, 45);
		System.out.println("update element:"+vc);
		
		//size or length
		System.out.println("size or length:"+vc.size());		
		
		//print all element using for loop
System.out.println("print all element using for loop");
		for(int i=0; i<vc.size();i++) {
			System.out.println(vc.get(i));
		}
		
		System.out.println("print all element using for each loop");
	
		for(Object obj:vc) {
			System.out.println(obj);
		}
		
		System.out.println("print all element using  iterator loop");
		
		Iterator it=vc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

		
	}
		
	

}

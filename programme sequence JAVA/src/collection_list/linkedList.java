package collection_list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedList{
	
	public static void main(String[]args) {
		
		LinkedList LL=new LinkedList();
		
		//1.add element to LinkedList
		LL.add(200);
		LL.add("Yogesh");
		LL.add("java");
		LL.add("python");
		LL.add(20.5);
		
		System.out.println("printing all element in LinkedList:"+LL);
		//2.remove element from linked list
		
		LL.remove(3);
		System.out.println("removing element:"+LL);
		
		//3.size
		
		System.out.println("size of linkedlist:"+LL.size());
		
		//4.add element at last
		
		LL.add("Ankita");
		System.out.println(LL);
		
		//add element at perticular index
		LL.add(3, "Vikas");
		System.out.println(LL);
		
		//5.ISempty
		System.out.println("Isempty:"+LL.isEmpty());
		
		//6.Contains
		
		System.out.println(LL.contains("Vikas"));
		
		
		//7.get methot
		
		System.out.println(LL.get(3));
		//8.firstindex
		System.out.println(LL.getFirst());
		//lastindex
		System.out.println(LL.getLast());
		
		//9.set method(to replace element)
		LL.set(2, "amar");
		System.out.println(LL);
		System.out.println();  //for line spacing
		System.out.println("print element using for loop");	

		
		for(int i=0; i<LL.size();i++) {
			System.out.println(LL.get(i));
			
		
		}
		System.out.println("print element using for each loop");
		
		for(Object obj:LL) {
			System.out.println(obj);

		}
		System.out.println("print element using iterator");
		Iterator it=LL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

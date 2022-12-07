package collection_que;

import java.util.PriorityQueue;

public class PriorityQue1 {
	
	public static void main(String[]args) {
		
		
		PriorityQueue pq=new PriorityQueue();
		
		//add and offer
		pq.add('x');
		pq.add('z');
		pq.add('d');
		pq.add('c');
		pq.add('a');
		
//		System.out.println(pq);
		
	//	pq.offer('n');  //also used for adding elements
	//	System.out.println(pq);
		
		//element & peek 
		
	//	System.out.println(pq.peek()); 		 //if  there is no element then it will show null

	
	//	System.out.println(pq.element()); 		 //if  there is no element then it will show error java.util.NoSuchElementException

		//remove and poll
  System.out.println(pq.remove());				 //if  there is no element then it will show error java.util.NoSuchElementException

		System.out.println(pq);
		
		System.out.println(pq.poll());	//if  there is no element then it will show null
	
		System.out.println("printing element using for each loop");
		
		for(Object obj:pq) {
			System.out.println(obj);
		}
	
	
	}

}

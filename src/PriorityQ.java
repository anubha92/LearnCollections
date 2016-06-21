import java.util.*;

class PriorityQ{
	
	public static void main(String args[]){
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul"); 
		
		System.out.println("Head"+queue.element());
		System.out.println("Head"+queue.peek());
		
		System.out.println("Iterating the queue elements");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		
		
		System.out.println("After removing 2 elements and using a different iterator");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
			
		
	}
}
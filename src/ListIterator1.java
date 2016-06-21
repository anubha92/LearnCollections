import java.util.ArrayList;
import java.util.ListIterator;

class ListIterator1{
	
	public static void main(String args[]){
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Hello");
		l1.add("There");
		l1.add("Anubha");
		l1.add(1, "Gupta");
		
		
		System.out.println("Element at 2nd position"+l1.get(2));
		
		ListIterator<String> itr = l1.listIterator();
		
		int i=0;
		System.out.println("Traversing in forward direction");
		while(itr.hasNext())
		{
			System.out.println(i+itr.next());
			i++;
		}
		i--;
		System.out.println("Traversing in backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(i+itr.previous());
			i--;
		}
		
	}
}
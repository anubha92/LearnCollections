import java.util.*;

class arrayList {
	
	public static void main(String args[]){
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Zen");
		a.add("Anubha");
		a.add("Megha");
		a.add("Shalvika");
		a.add("Sravani");
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("HEllo");
		a.addAll(b);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Anubha");
		l1.add("Megha");
		l1.add("Zen");
		l1.add("Shalvika");
		l1.add("Sravani");
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext())
			System.out.println("arrayList"+itr.next());
		
         Iterator itr1 = l1.iterator();
		
		while(itr1.hasNext())
			System.out.println("LinkedList"+itr1.next());
		
	}
}
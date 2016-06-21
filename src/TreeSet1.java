import java.util.*;

//maintains ascending order
class TreeSet1{
	
	public static void main(String args[]){
		
		TreeSet<String> h = new TreeSet<String>();
		
		h.add("4");
		h.add("1");
		h.add("2");
		h.add("0");
		
		System.out.println("Without Iterator"+ h);
		Iterator<String> itr = h.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
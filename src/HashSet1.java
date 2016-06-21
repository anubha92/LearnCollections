import java.util.*;
//removes duplicatse
class HashSet1{
	
	public static void main(String args[]){
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("Anubha");
		h.add("Juhi");
		h.add("Avinash");
		h.add("Anubha");
		
		System.out.println("Without Iterator"+ h);
		Iterator<String> itr = h.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
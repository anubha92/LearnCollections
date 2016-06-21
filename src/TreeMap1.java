import java.util.*;

class TreeMap1{
	
	public static void main(String args[]){
		
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		
		t.put(1, "apples");
		t.put(3, "Oranges");
		t.put(-1, "guave");
		t.put(2, "Mangoes");
	
	for(Map.Entry m:t.entrySet()){
		System.out.println(m.getValue()+" "+m.getKey());
	}}
}
import java.util.*;

class arrayList1{
	
	public static void main(String args[]){
		Students s1 = new Students(1,"Anubha",24);
		Students s2 = new Students(2,"Megha",50);
		Students s3 = new Students(3,"Avinash",25);
		//Students s1 = new Students(4,"Shalvika",22);
		
		ArrayList<Students> a1 = new ArrayList<Students>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		
		Iterator itr = a1.iterator();
		
		while(itr.hasNext()){
			Students st = (Students)itr.next();
			System.out.println(st.rollno+" "+ st.name +" "+ st.age);
			
		}
		
	}
}
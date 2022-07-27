package collectioninjava;

import java.util.HashSet;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> ar=new HashSet();
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(new Integer(10));
		ar.add(new Integer(56));
		ar.add(45);
		
		System.out.println(ar);
		
		ar.remove(new Integer(45));
		System.out.println(ar);
		
		HashSet<Object> ar1=new HashSet();
		
		ar1.add(10);
		ar1.add("Hello");
		ar1.add(78.58);
		ar1.addAll(ar);
		
		System.out.println(ar1);
	
		ar1.remove("Hello");
		System.out.println(ar1);
	}

}

package collectioninjava;

import java.util.LinkedList;

public class LinkedListInJava {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ar=new LinkedList();
	
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(2,new Integer(12));
		System.out.println(ar);
		
		ar.remove(0);
		ar.remove(new Integer(23));
		System.out.println(ar);
		
		LinkedList<Object> ar1=new LinkedList();	
		ar1.add(new Integer(10));
		ar1.add(new String("Hello"));
		ar1.add(new Float(12.34f));
		ar1.add(new Double(34.89));
		ar1.add(new Boolean(false));
		ar1.add(null);
		System.out.println(ar1);
		
	}

}

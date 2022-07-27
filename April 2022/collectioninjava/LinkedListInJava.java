package collectioninjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ar=new LinkedList();
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(new Integer(10));
		ar.add(new Integer(56));
		ar.add(45);
		
		System.out.println(ar);
		
		ar.remove(new Integer(45));
		System.out.println(ar);
		
		ar.add(2, new Integer(78));
		System.out.println(ar);
		
		LinkedList<Object> ar1=new LinkedList();
		
		ar1.add(10);
		ar1.add("Hello");
		ar1.add(78.58);
		
		System.out.println(ar1);
		
	}

}

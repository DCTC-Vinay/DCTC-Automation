package collectioninjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedHashSetDifferent();
		//linkedHashSetSame();
	}
	
	public static void linkedHashSetDifferent()
	{
		LinkedHashSet ar = new LinkedHashSet();
		ar.add(new String ("Hi"));
		ar.add(new Integer(10));
		ar.add(new Integer(20));
		ar.add(new Integer(34));
		ar.add(new Integer(34));
		ar.add(new Integer(34));
		ar.add(new Float(23.67));
		ar.add(null);
				
	
		System.out.println(ar);
		
		ar.removeAll(ar);
		
		System.out.println(ar);
	}
	
	public static void linkedHashSetSame()
	{
		LinkedHashSet<Integer> ar = new LinkedHashSet();
		ar.add(new Integer(12));
		ar.add(new Integer(14));
		ar.add(new Integer(17));
		ar.add(new Integer(10));
		ar.add(new Integer(9));
		ar.add(new Integer(11));
		ar.add(new Integer(78));
		ar.add(new Integer(34));
		
		System.out.println(ar);
		
		
	}
	
	

}

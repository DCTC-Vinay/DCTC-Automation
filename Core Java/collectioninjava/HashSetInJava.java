package collectioninjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashSetDifferent();
		//hashSetSame();
	}
	
	public static void hashSetDifferent()
	{
		HashSet ar = new HashSet();
		ar.add(new String ("Hi"));
		ar.add(new Integer(10));
		ar.add(new Integer(20));
		ar.add(new Integer(34));
		ar.add(new Integer(34));
		ar.add(new Integer(34));
		ar.add(new Float(23.67));
		ar.add(null);
		
		
		Iterator<String> itr=ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(ar);
		
	
	}
	
	public static void hashSetSame()
	{
		HashSet<Integer> ar = new HashSet();
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

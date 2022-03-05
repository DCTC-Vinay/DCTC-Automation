package collectioninjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> set=new LinkedHashSet();
		
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(10));
		set.add(new Integer(40));
		set.add(new Integer(23));
		set.add(null);
		
		System.out.println(set);
		
		set.remove(40);
				
		System.out.println(set);
		
		Iterator<Integer> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		LinkedHashSet<Object> set1=new LinkedHashSet();
		set1.add(new Integer(34));
		set1.add(new String("Hello"));
		set1.add(new Float(23.89));
		System.out.println(set1);
		
		
	}

}

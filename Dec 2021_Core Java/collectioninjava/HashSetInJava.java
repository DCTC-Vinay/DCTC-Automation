package collectioninjava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set=new HashSet();
		
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(10));
		set.add(new Integer(40));
		set.add(23);
		set.add(null);
		
		System.out.println(set);
		
		set.remove(40);
				
		System.out.println(set);
		
		Iterator<Integer> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		HashSet<Object> set1=new HashSet();
		set1.add(new Integer(34));
		set1.add(new String("Hello"));
		set1.add(new Float(23.89));
		System.out.println(set1);
		
		
	}

}

package collectioninjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetInJava {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> ar=new LinkedHashSet();
	
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		System.out.println(ar);
		
		ar.remove(new Integer(23));
		System.out.println(ar);
		
		System.out.println("Output Iterator");
		Iterator i=ar.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("Output For Each Version");
		for(Integer j:ar)
		{
			System.out.println(j);
		}
		
		LinkedHashSet<Object> ar1=new LinkedHashSet();	
		ar1.add(new Integer(10));
		ar1.add(new String("Hello"));
		ar1.add(new Float(12.34f));
		ar1.add(new Double(34.89));
		ar1.add(new Boolean(false));
		ar1.add(null);
		System.out.println(ar1);
	
		System.out.println("Output Iterator");
		i=ar1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Output For Each");
		
		for(Object x:ar1)
		{
			System.out.println(x);
		}
		
	
	}

}







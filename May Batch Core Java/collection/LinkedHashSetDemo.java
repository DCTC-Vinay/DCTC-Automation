package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> h1=new LinkedHashSet<String>();
		h1.add("Hello");
		h1.add("Hi");
		h1.add("15");
		h1.add("Automation");
		h1.add(null);
		h1.add("Hi");
		System.out.println(h1);
		h1.remove("15");
		h1.remove(null);
		System.out.println(h1);
		
		Iterator i=h1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
				
		for(String h3:h1)
		{
			System.out.println(h3);
		}
		
		LinkedHashSet<Object> h2=new LinkedHashSet<Object>();
		h2.add(56);
		h2.add("Hello");
		h2.add(58.23);
		h2.add(false);
		System.out.println(h2);
		h2.remove(new Double(58.23));
		System.out.println(h2);
	}

}

package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TreeSet<Integer> a1=new TreeSet<Integer>();
		a1.add(0);
		a1.add(45);
		a1.add(45);
		a1.add(89);
		a1.add(23);
	//	a1.add(2, 56);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.remove(0);
		a1.remove(new Integer(23));
		
		System.out.println(a1);
		System.out.println(a1.size());
		
		Object x[]=a1.toArray();
		
		for(Object z:x)
		{
			System.out.println(z);
		}
		
		
		TreeSet<Object> a2=new TreeSet<Object>();
		a2.add("Hi");
		a2.add("Hello");
		a2.add("Java");
		a2.add("Programming");
		a2.add("Object Oriented");
		a2.add("Hello");
		System.out.println(a2);
		a2.remove("Hello");
		System.out.println(a2);
		
		Iterator i=a2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
				
		for(Object a4:a2)
		{
			System.out.println(a4);
		}
	}

}

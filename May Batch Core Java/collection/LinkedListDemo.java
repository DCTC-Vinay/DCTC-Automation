package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(null);
		a1.add(0);
		a1.add(45);
		a1.add(45);
		a1.add(89);
		a1.add(23);
		a1.add(2, 56);
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
		
		
		LinkedList<Object> a2=new LinkedList<Object>();
		a2.add("Hi");
		a2.add(45);
		a2.add(25.36);
		a2.add(true);
		a2.add(null);
		a2.add(a1);
		System.out.println(a2);
		a2.remove(0);
		System.out.println(a2);
	}

}

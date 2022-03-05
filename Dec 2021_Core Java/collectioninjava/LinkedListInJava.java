package collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList();
		
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(10));
		list.add(new Integer(40));
		
		list.add(2,new Integer(30));
		list.add(23);
		list.add(null);
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		Iterator<Integer> i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		LinkedList<Object> list1=new LinkedList();
		list1.add(new Integer(34));
		list1.add(new String("Hello"));
		list1.add(new Float(23.89));
		System.out.println(list1);
		
		
	}

}

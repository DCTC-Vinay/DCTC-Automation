package collectioninjava;

import java.util.LinkedList;

public class LinkedListInJava {


	public void linkedListMethods()
	{
		LinkedList<Integer> a=new LinkedList();
		
		Integer i=new Integer(45);
		a.add(i);
		
		a.add(new Integer(25));
		a.add(new Integer(85));
		a.add(1,new Integer(17));
		a.add(new Integer(25));
		a.add(null);
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		Integer j=new Integer(57);
		a.add(j);
		
		System.out.println(a);
		
		a.remove(j);
		System.out.println(a);
		
		
		//LinkedList of Type String
		LinkedList<String> a2=new LinkedList();
		a2.add("Hi");
		a2.add("Hello");
		a2.add(null);
		a2.add("Hi");
		a2.add(0, "Bye");
		a2.add("45");
		System.out.println(a2);
		
		a2.remove(2);
		System.out.println(a2);
	
		a2.remove("Bye");
		System.out.println(a2);
		
		a2.remove("Hi");
		System.out.println(a2);
		
	
		LinkedList<String> a4=new LinkedList();
		
		a4.addAll(a2);
		System.out.println("a4 : "+a4);
		
		//LinkedList with all types of Object
		
		LinkedList<Object> a3=new LinkedList();
		
		a3.add(new Integer(11));
		a3.add(new Float(36.74f));
		a3.add(new Boolean(false));
		a3.add(new Double(23.25));
		a3.add("Hello");
		a3.add(null);
		a3.add(new Double(23.25));
		System.out.println(a3);
		
		a3.remove(2);
		System.out.println(a3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListInJava l=new LinkedListInJava();
		l.linkedListMethods();
	}

}
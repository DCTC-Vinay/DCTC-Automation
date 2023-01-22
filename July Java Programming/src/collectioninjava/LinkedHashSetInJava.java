package collectioninjava;

import java.util.LinkedHashSet;


public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSetInJava h=new LinkedHashSetInJava();
		h.linkedhashSetMethods();
	}
	
	public void linkedhashSetMethods()
	{
		LinkedHashSet<Integer> a=new LinkedHashSet();
			
		a.add(new Integer(25));
		a.add(new Integer(85));
		a.add(new Integer(25));
		a.add(null);
		a.add(new Integer(85));
		System.out.println(a);
		
		a.remove(new Integer(25));
		System.out.println(a);
		
		//Linked HashSet of Type String
		LinkedHashSet<String> a2 = new LinkedHashSet();
		a2.add("Hi");
		a2.add("Hello");
		a2.add(null);
		a2.add("Hi");
		a2.add("45");
		System.out.println(a2);
		
		//Linked HashSet with all types of Object
		
		LinkedHashSet<Object> a3 = new LinkedHashSet();

		a3.add(new Integer(11));
		a3.add(new Float(36.74f));
		a3.add(new Boolean(false));
		a3.add(new Double(23.25));
		a3.add(new Double(23.25));
		System.out.println(a3);
	}
}

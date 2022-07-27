package collectioninjava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ar=new TreeSet();

		ar.add(new Integer(12));
		System.out.println(ar);
		ar.add(new Integer(25));
		System.out.println(ar);
		ar.add(new Integer(5));
		System.out.println(ar);
		ar.add(new Integer(12));
		System.out.println(ar);
		ar.remove(new Integer(12));
		System.out.println(ar);
		ar.add(new Integer(1));
		ar.add(new Integer(3));
		ar.add(new Integer(4));
		System.out.println(ar);		

		
		Iterator<Integer> i=ar.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		TreeSet<String> ar1=new TreeSet();
		ar1.add("A");
		ar1.add("C");
		ar1.add("B");
		ar1.add("D");
		ar1.add("E");
		ar1.add("F");
		ar1.add("E");
		System.out.println(ar1);
		ar1.remove("B");
		System.out.println(ar1);
		
		Iterator<String> j=ar1.iterator();
		
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
	}
}












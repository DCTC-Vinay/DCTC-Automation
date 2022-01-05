package collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeSetDifferent();
		treeSetSame();
	}
	
	public static void treeSetDifferent()
	{
		TreeSet ar = new TreeSet();
	
		ar.add(new Float(23.12));
		ar.add(new Float(23.16));
		ar.add(new Float(23.09));
		
		
		Iterator itr=ar.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//.add(new String ("D"));
		//ar.add(new String("E"));
		//ar.add(new String("A"));
		
		//ar.add(new Float(23.67));
		//ar.add(null);
		
		System.out.println(ar);
		
	
	}
	
	public static void treeSetSame()
	{
		TreeSet<Integer> ar = new TreeSet();
		ar.add(new Integer(12));
		ar.add(new Integer(14));
		ar.add(new Integer(17));
		ar.add(new Integer(10));
		ar.add(new Integer(9));
		ar.add(new Integer(11));
		ar.add(new Integer(78));
		ar.add(new Integer(34));

		Iterator itr = ar.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(ar);
		
		
	}
	
	

}

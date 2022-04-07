package collectioninjava;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetInJava {
	
	public static void main(String[] args) {
		
		HashSet<Integer> ar=new HashSet();
	
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		//ar.add(2,new Integer(12));
		System.out.println(ar);
		
		ar.remove(new Integer(23));
		System.out.println(ar);
		
		HashSet<Object> ar1=new HashSet();	
		ar1.add(new Integer(10));
		ar1.add(new String("Hello"));
		ar1.add(new Float(12.34f));
		ar1.add(new Double(34.89));
		ar1.add(new Boolean(false));
		ar1.add(null);
		System.out.println(ar1);
		
	}

}

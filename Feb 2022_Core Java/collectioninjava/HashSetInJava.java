package collectioninjava;

import java.util.HashSet;


public class HashSetInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> ar=new HashSet();

		ar.add(new Integer(12));
		System.out.println(ar);
		ar.add(new Integer(25));
		System.out.println(ar);
		ar.add(null);
		System.out.println(ar);
		ar.add(new Integer(5));
		System.out.println(ar);
		ar.add(new Integer(12));
		System.out.println(ar);
		ar.remove(new Integer(12));
		System.out.println(ar);

		HashSet<String> ar1=new HashSet();
		ar1.add("A");
		ar1.add("C");
		ar1.add("B");
		ar1.add("D");
		ar1.add("E");
		ar1.add("F");
		ar1.add(null);
		ar1.add("E");
		System.out.println(ar1);
		ar1.remove("B");
		System.out.println(ar1);
	}
}












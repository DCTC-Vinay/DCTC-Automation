package collectioninjava;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar2=new ArrayList();
		ar2.add(25);
		ar2.add(65);
		ar2.add(55);
		
		ArrayList<Integer> ar=new ArrayList();
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(new Integer(10));
		ar.add(new Integer(56));
		ar.add(45);
		ar.addAll(ar2);
		
		System.out.println(ar);
		
		ar.remove(new Integer(45));
		System.out.println(ar);
		
		ar.add(2, new Integer(78));
		System.out.println(ar);
		
		ArrayList<Object> ar1=new ArrayList();
		
		ar1.add(10);
		ar1.add("Hello");
		ar1.add(78.58);
		
		System.out.println(ar1);
		
		

		
	}

}

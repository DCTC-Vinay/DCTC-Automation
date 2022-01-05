package collectioninjava;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayListDifferent();
		arrayListSame();
	}
	
	public static void arrayListDifferent()
	{
		ArrayList ar = new ArrayList();

		Integer i = new Integer(10);
		ar.add(i);

		String str = new String("Hello");
		ar.add(str);

		Float f = new Float(34.56);
		ar.add(f);

		System.out.println(ar);
		System.out.println(ar.size());
		ar.remove(1);
		System.out.println(ar);

		ar.add(new Character('w'));
		System.out.println(ar);
		System.out.println(ar.size());
	}
	
	public static void arrayListSame()
	{
		ArrayList<String> ar = new ArrayList();

		String i = new String("10");
		ar.add(i);

		ar.add(new String("Hello"));
		ar.add(new String("20"));
		ar.add(new String("30"));
		ar.add(new String("40"));
		ar.add(new String("50"));
		ar.add(new String(""));
		ar.add(new String("56"));
		System.out.println(ar);
		
		ar.remove(0);
		System.out.println(ar);
		
		ar.remove("Hello");
		
		System.out.println(ar);
		
		ar.add(2, new String("Hi"));
		System.out.println(ar);
	}
	
	

}

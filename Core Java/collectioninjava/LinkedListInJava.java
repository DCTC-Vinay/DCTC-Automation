package collectioninjava;


import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linkedListDifferent();
		linkedListSame();
	}
	
	public static void linkedListDifferent()
	{
		LinkedList ar = new LinkedList();

		Integer i = new Integer(10);
		ar.add(i);

		String str = new String("Hello");
		ar.add(str);

		
		String str1 = new String("Hi");
		ar.add(str1);
		
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
	
	public static void linkedListSame()
	{
		LinkedList<String> ar = new LinkedList();

		String i = new String("10");
		ar.add(i);

		ar.add(new String("Hello"));
		ar.add(new String("20"));
		ar.add(new String("30"));
		ar.add(new String("Hi"));
		ar.add(new String("50"));
		ar.add(new String(""));
		ar.add(new String("56"));
		System.out.println(ar);
		
		//ar.remove(0);
		System.out.println(ar);
		
	//	ar.remove("Hello");
			
		ar.add(2, new String("Hi"));
		System.out.println(ar);
	}
	
	

}

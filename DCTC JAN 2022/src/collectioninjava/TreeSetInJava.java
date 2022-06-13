package collectioninjava;


import java.util.TreeSet;

public class TreeSetInJava {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ar=new TreeSet();
	
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(new Integer(18));
		ar.add(new Integer(22));
		System.out.println(ar);
		ar.remove(new Integer(23));
		
		System.out.println(ar);
		
		TreeSet<String> ar1=new TreeSet();	
		ar1.add(new String("Hello"));
		ar1.add(new String("Hi"));
		ar1.add(new String("Bye"));
		ar1.add(new String("Will Meet"));
		System.out.println(ar1);
		
	}

}

package collectioninjava;

import java.util.HashMap;

public class HashMapInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap();
		
		hm.put(new Integer(1), "Java");
		hm.put(new Integer(2), "C");
		hm.put(new Integer(3), "C++");
		System.out.println(hm);
		
		hm.remove(new Integer(3));
		System.out.println(hm);
		
		System.out.println(hm.get(new Integer(1)));
	}
}












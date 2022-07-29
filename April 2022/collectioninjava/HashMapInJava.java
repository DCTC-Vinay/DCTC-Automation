package collectioninjava;

import java.util.HashMap;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Character> hm=new HashMap();
		
		hm.put(85, 'w');
		hm.put(78, 'v');
		hm.put(12, 'a');
		hm.put(1, 'C');
		hm.put(2, 'B');
		hm.put(85, 'D');
		System.out.println(hm);
		
		hm.remove(12);
		System.out.println(hm);
		
	}

}

package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(0, "Hi");
		h.put(1, "Hello");
		h.put(3, "Java");
		h.put(1, "Bye");
		h.put(3, "Object");
		h.put(-3, "Oriented");
		h.put(255, "Vector");
		h.put(244, "Vector");
		h.put(148595, "Anil");
		h.put(148597, "Vinay");
		System.out.println(h);
		h.remove(244);
		System.out.println(h);
	}

}

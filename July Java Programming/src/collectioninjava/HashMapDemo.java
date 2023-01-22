package collectioninjava;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> h=new HashMap();
		h.put(5,"Rupesh");
		h.put(6,"Rupesh");
		h.put(1, "Vinay");
		
		h.put(2, "Ajay");
		h.put(1, "Vikas");
		h.put(3, "Vinay");
		System.out.println(h);
		
		h.remove(2);
		System.out.println(h);
	}

}

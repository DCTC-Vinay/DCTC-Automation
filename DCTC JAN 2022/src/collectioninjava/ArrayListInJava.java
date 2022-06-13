package collectioninjava;

import java.util.ArrayList;

public class ArrayListInJava {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList();
	
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(2,new Integer(12));
		System.out.println(ar);
		
		ar.remove(0);
		
		for(Integer k:ar)
		{
			System.out.println(k);
		}
		
		for(int j=0;j<ar.size();j++)
		{
			System.out.println(ar.get(j));
		}
		
		System.out.println(ar);
		
		ArrayList<Object> ar1=new ArrayList();	
		ar1.add(new Integer(10));
		ar1.add(new String("Hello"));
		ar1.add(new Float(12.34f));
		ar1.add(new Double(34.89));
		ar1.add(new Boolean(false));
		ar1.add(null);
		System.out.println(ar1);
		
		
	}

}

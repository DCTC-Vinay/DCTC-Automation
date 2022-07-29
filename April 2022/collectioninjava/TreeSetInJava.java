package collectioninjava;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ar=new TreeSet();
	//	ar.add(null);
		ar.add(new Integer(10));
		ar.add(new Integer(23));
		ar.add(new Integer(10));
		ar.add(new Integer(56));
		ar.add(new Integer(29));
		ar.add(new Integer(125));
		ar.add(new Integer(108));
		ar.add(45);
		
		System.out.println(ar);
		
		ar.remove(new Integer(45));
		System.out.println(ar);
		
		Iterator<Integer> i=ar.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		TreeSet<Object> ar1=new TreeSet();
		
		ar1.add("Hello");
		ar1.add("Hi");
		ar1.add("Bye");
		ar1.add("Go On");
		System.out.println(ar1);
		
		Iterator<Object> j=ar1.iterator();
		
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
	
		
		//	ar1.add(78.58);
		
		//Copying into an Array
		
		System.out.println("Copying into an Array");
		
		Object[] n=ar.toArray();
		for(int x=0;x<ar.size();x++)
		{
			System.out.println(n[x]);
		}
		
		
	}

}

package collectioninjava;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList();

		ar.add(new Integer(12));
		System.out.println(ar);
		ar.add(new Integer(25));
		System.out.println(ar);
		ar.add(null);
		System.out.println(ar);
		ar.add(new Integer(5));
		System.out.println(ar);
		ar.add(0,new Integer(45));
		System.out.println(ar);
		ar.add(new Integer(12));
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		ar.remove(new Integer(12));
		System.out.println(ar);

		ArrayList<String> ar1=new ArrayList();
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		ar1.add("D");
		ar1.add("E");
		ar1.add("F");
		System.out.println(ar1);
		ar1.remove(2);
		System.out.println(ar1);
		
		Iterator<String> j=ar1.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
			
		}
	}
}












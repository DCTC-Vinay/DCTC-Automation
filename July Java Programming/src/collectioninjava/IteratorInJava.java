package collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;

import wrapperclass.OwnWrapper;

public class IteratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IteratorInJava i=new IteratorInJava();
		i.useIterator();
		i.stringCollection();
	}
	
	
	public void useIterator()
	{
		
		/*ArrayList<OwnWrapper> a4=new ArrayList();
		a4.add(new OwnWrapper(45));
		a4.add(new OwnWrapper(25));
		System.out.println(a4);*/
		
		
		ArrayList<Integer> a = new ArrayList();

		a.add(new Integer(25));
		a.add(new Integer(85));
		a.add(1, new Integer(17));
		a.add(new Integer(22));
		
		System.out.println(a);
		
		Iterator<Integer> j=a.iterator();
		while(j.hasNext())
		{
			Integer n=j.next();
			if(n<23)
			{
				j.remove();
			}
			//System.out.println(n);
		}
		System.out.println(a);
		
		
		for(Integer x:a)
		{
			System.out.println(x);
		}
		
		
	}
	
	public void stringCollection()
	{
		ArrayList<String> a = new ArrayList();

		a.add("Hi");
		a.add("Hello");
		a.add("Bye");
		System.out.println(a);
		
		Iterator<String> j=a.iterator();
		while(j.hasNext())
		{
			String n=j.next();
			System.out.println(n);
		}

	}

}

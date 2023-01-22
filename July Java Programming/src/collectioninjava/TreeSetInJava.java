package collectioninjava;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSetInJava t=new TreeSetInJava();
		t.treeSetMethods();
	}
	
	public void treeSetMethods()
	{
		TreeSet<Integer> t=new TreeSet();
		t.add(new Integer(10));
		t.add(new Integer(10));
		t.add(new Integer(20));
		t.add(new Integer(50));
		t.add(new Integer(40));
		t.add(new Integer(50));
		t.add(new Integer(40));
		t.add(new Integer(70));
		t.add(new Integer(5));
		
		System.out.println(t);
		
		TreeSet<Character> t1=new TreeSet();

		t1.add(new Character('a'));
		t1.add(new Character('b'));
		
		t1.add(new Character('A'));
		t1.add(new Character('B'));
				
		System.out.println(t1);
	}

}




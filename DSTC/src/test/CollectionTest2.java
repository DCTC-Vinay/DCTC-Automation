package test;

import java.util.ArrayList;

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<A> ar=new ArrayList<A>();
		
			
		ar.add(new A(10,20));
		ar.add(new A(30,40));
		A pp = ar.get(0);
		A pp1=ar.get(1);
		pp.addTwoNumbers();
		pp1.addTwoNumbers();
		
		
	}

}

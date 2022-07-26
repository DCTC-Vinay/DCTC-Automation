package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestEncapsulation t1=new TestEncapsulation();
		t1.setA(100);
		t1.setX(85.98f);
		t1.setY(true);
		t1.setZ('k');
		
		int n=t1.getA();
		System.out.println("Value of A :"+n);
		
		float m=t1.getX();
		System.out.println("Value of X :"+m);
		
		char o=t1.getZ();
		System.out.println("Value of Z: "+o);
		
		boolean p=t1.isY();
		System.out.println("Value of Y:"+p);
	}

}

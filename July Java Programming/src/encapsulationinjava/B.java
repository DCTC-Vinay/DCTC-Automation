package encapsulationinjava;

public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1=new B();
		
		b1.setW(false);
		b1.setX(12);
		b1.setY(23.11);
		b1.setZ("Hello");
		
		System.out.println(b1.isW());
		System.out.println(b1.getX());
		System.out.println(b1.getY());
		System.out.println(b1.getZ());
	}

}

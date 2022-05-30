package encapsulationinjava;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.setA(32);
		a1.setB(4.78f);
		a1.setC(false);
		
		
		System.out.println("Value of a:"+a1.getA());
		System.out.println("Value of b:"+a1.getB());
		System.out.println("Value of c:"+a1.isC());
	}

}

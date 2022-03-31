package encapsulationinjava;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		
		a1.setA(12);
		a1.setB(23.65f);
		a1.setN('r');
		
		System.out.println(a1.getA());
		System.out.println(a1.getB());
		System.out.println(a1.getN());
	}

}

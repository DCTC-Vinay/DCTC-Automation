package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e=new Encapsulation();
		e.setA(45);
		e.setB(25.78f);
		e.setC(69.25);
		e.setD("Vinay");
		
		System.out.println(e.getA());
		System.out.println(e.getB());
		System.out.println(e.getC());
		System.out.println(e.getD());
	}

}

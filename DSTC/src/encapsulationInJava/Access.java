package encapsulationInJava;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationInJava e1=new EncapsulationInJava();
		EncapsulationInJava e2=new EncapsulationInJava();
		e1.setA(34);
		System.out.println(e1.getA());
		
		e1.setCh('a');
		System.out.println(e1.getCh());
	}

}

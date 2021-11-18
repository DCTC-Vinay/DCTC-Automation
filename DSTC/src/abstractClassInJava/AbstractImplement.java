package abstractClassInJava;

public class AbstractImplement extends AbstractClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImplement ai=new AbstractImplement();
		ai.absMethod();
		ai.m1ofAbstract();
	}
	
	public AbstractImplement()
	{
		System.out.println("Default Constructor of Abstract Implement");
	}

	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		System.out.println("Use of abstract method");
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

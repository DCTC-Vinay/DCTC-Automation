package polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1=new B();
		b1.show();
		
		A a1=new A();
		a1.show();
		
		A a2=new B();	//Dynamic Method Dispatch
		a2.show();
		
		
		
	}

}

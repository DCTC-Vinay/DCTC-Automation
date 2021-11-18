package interfaceInjava;

public class B implements A {

	int z=56;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.methodinAInterface();
		b1.add();
	}

	@Override
	public void methodinAInterface() {
		// TODO Auto-generated method stub
		System.out.println("Method A from interface");
	}

	public void add()
	{
		int c=a+b;
		System.out.println("Addition : "+c);
	}
}

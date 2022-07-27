package interfaceinjava;

public class B extends E implements A,C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.add(78, 89);
		
		C.div(34, 2);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("Sum ="+c);
		System.out.println("N ="+n);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}

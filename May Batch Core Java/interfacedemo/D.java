package interfacedemo;


//single inheritance using class and interface
public class D implements A{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D();
		d1.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Value of x :"+x);
	}
}

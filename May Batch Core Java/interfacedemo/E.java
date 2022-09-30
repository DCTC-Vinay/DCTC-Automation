package interfacedemo;

//multiple inheritance using class and interface
public class E implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E e1=new E();
		e1.show();
		e1.put();
		
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		System.out.println("value of y: "+y);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("value of x: "+x);
	}

}

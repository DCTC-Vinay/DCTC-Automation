package abstractclassinjava;

public class Demo1 extends Demo{

	
	public Demo1()
	{
		System.out.println("Demo1 Constructor");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Get Method");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Show Method");
	}
	
	public static void display()
	{
		System.out.println("inside static display method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.get();
		d1.show();
		d1.input();
		display();
	}
}

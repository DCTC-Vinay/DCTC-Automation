package abstractdemo;

public class Xyz extends Abc{

	int z;
	public Xyz()
	{
		z=23;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside Show Method");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Inside Get Method");
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Inside Input Method :");
		System.out.println("value of n :"+n);
		System.out.println("value of z :"+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xyz x=new Xyz();
		x.show();
		x.get();
		x.get_input();
		x.input();
		
		//abstraction --- hiding the implementation
		Abc a1=new Xyz();
		a1.get_input();
		a1.get();
		a1.show();
		
		
	}
}

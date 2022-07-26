package intefaceinjava;

public class B implements A,C{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		boolean x=b1.equal(12, 12);
		System.out.println("The values are : "+x);
		
		System.out.println("Values from interface :"+a+" "+n);
		
		b1.c_display();
		
		A a1=new B();
		a1.input();
		
		C c1=new B();
		c1.c_display();
		
		//for calling the static method of interface use interface name and method name
		A.test();
	}
	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equal(int a, int b) {
		// TODO Auto-generated method stub
		
		if(a==b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void c_add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int c_display() {
		// TODO Auto-generated method stub
		System.out.println("Values of C Interface : "+h+" "+e);
		
		return 0;
	}


	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input Method");
	}
}

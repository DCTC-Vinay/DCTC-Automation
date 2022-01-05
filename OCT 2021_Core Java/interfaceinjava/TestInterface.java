package interfaceinjava;

public class TestInterface implements A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface t=new TestInterface();
		t.input();
		t.show();
		t.inputfromB();
		t.showfromB();
	
		
		A a1=new TestInterface(); 
		a1.show();			//hidden abstraction
		a1.input();
		
	}


	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Test Method input");
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Test Method show");
	}
	
	public void test()
	{
		System.out.println("Test Method show");
	}


	@Override
	public void inputfromB() {
		// TODO Auto-generated method stub
		System.out.println("Test Method input B");
	}


	@Override
	public void showfromB() {
		// TODO Auto-generated method stub
		System.out.println("Test Method show B");
	}


	@Override
	public void inputfromC() {
		// TODO Auto-generated method stub
		System.out.println("Test Input method c");
	}


	@Override
	public void showfromC() {
		// TODO Auto-generated method stub
		System.out.println("Test Method show C");
	}

}

import abstractclassinjava.TestAbstractClass;

public class MainClassInJava extends TestAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClassInJava m=new MainClassInJava();
		m.input();
		m.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method in main class");
	}
	
	

}

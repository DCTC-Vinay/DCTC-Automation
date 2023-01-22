package inheritanceinjava.hierarchicalinheritance;

//Hierarchical inheritance
public class B extends A {
	
	public B()
	{
		System.out.println("B class Constructor");
	}
	public void test_B(double b)
	{
		System.out.println("Class B method : "+b);
	}
	
	public static void main(String[] args) {
		
		B b1=new B();
		b1.test_B(114.55);
		b1.test_A(25);
	}
}
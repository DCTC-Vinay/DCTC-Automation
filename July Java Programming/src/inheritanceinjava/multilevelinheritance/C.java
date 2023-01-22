package inheritanceinjava.multilevelinheritance;

//multilevel inheritance
public class C extends B{
	
	public C()
	{
		System.out.println("C class Constructor");
	}
	
	public void test_C(boolean c)
	{
		System.out.println("inside C class : "+c);
	}
	
	
	public static void main(String[] args) {
		
		C c1=new C();
		c1.test_C(false);
		c1.test_B(45.25);
		c1.test_A(25);
	}

}

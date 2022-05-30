package polymorphisminjava;

public class B extends A{
	
	String emp_city="Pune";
	public void method_A()
	{
		System.out.println("inside method_A of child class");
		System.out.println("emp salary :"+emp_sal);
		System.out.println("emp city :"+emp_city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1=new B();
		b1.method_A();
		
		A a1=new A();
		a1.method_A();
		
		A a2=new B();
		a2.method_A();
	}

}

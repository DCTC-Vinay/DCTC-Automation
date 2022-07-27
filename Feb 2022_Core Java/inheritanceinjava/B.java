
//single inheritance
package inheritanceinjava;

public class B extends A{

	int x=56,y=34;
	public void method_B()
	{
		System.out.println("Class B Method");
		System.out.println("In Child Class");
		System.out.println("A :"+a+" B: "+b);
		System.out.println("X :"+x+" Y:"+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.method_A();
		b1.method_B();
		method_static_A();
	}

}

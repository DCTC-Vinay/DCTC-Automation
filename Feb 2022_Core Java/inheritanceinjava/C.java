
//multilevel inheritance
package inheritanceinjava;

public class C extends B{

	int m=43,n=78;
	
	public void method_C()
	{
		System.out.println("Class C Method");
		System.out.println("In Child Class");
		System.out.println("A :"+a+" B: "+b);
		System.out.println("X :"+x+" Y:"+y);
		System.out.println("M :"+m+" N:"+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1=new C();
		c1.method_A();
		c1.method_B();
		c1.method_C();
		method_static_A();
		
		B b1=new C();
		b1.method_B();
	}

}

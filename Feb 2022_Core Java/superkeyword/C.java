//super keyword for constructor call
package superkeyword;
public class C extends B {

	public C(int a,int b)
	{
		super(a);
		System.out.println("Inside child class parameterised constructor :");
	}
	
	public C()
	{
		super(100);
		System.out.println("Inside child class Default constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1=new C(85,89);
		C c2=new C();
		
	}
}

package polymorphism;

public class MethodOverride extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverride mo=new MethodOverride();
		int m=mo.get(3);
		System.out.println(m);
		
		A a1=new A();
		m=a1.get(4);
		System.out.println(m);
		
		A a2=new MethodOverride(); //dynamic method dispatch
		m=a2.get(5);
		System.out.println(m);
	}
	
	public int get(int n)
	{
		return n*n*n;
	}

}

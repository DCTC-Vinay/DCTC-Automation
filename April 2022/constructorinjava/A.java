package constructorinjava;

//this can be passed as argument in the constructor call.

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b2=new B();
	}
	
	public A(B b1)
	{
		System.out.println("Value of a : "+b1.a);
		System.out.println("Value of b : "+b1.b);
	}

}

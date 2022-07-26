package constructorinjava;

public class B {

	int a;
	int b;
	
	public B()
	{
		a=70;
		b=50;
		
		A a1=new A(this);
	}

}

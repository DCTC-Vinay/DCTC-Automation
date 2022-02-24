package constructorinjava;

public class B {

	int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
	}

	B()
	{
		System.out.println("In B Class Constructor");
		ThisKeywordInJava2 cij7=new ThisKeywordInJava2(this);
		System.out.println("Value of n:"+n);
	}
}

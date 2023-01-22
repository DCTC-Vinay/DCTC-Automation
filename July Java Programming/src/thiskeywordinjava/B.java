package thiskeywordinjava;
//passing this as parameter to constructor
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new A();
	}
	
	public B(A a2)
	{
		System.out.println(a2.x);
		System.out.println(a2.y);
	}
	
	
}

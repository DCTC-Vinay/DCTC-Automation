
//for hierarchical inheritance
package inheritanceinjava;

public class D extends A {

	int q=78,r=79;
	public void method_D()
	{
		System.out.println("Class D Method");
		System.out.println("A :"+a+" B: "+b);
		System.out.println("Q :"+q+" R:"+r);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D();
		d1.method_A();
		d1.method_D();
		method_static_A();
		
	}

}

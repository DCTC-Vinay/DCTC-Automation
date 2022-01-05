package thiskeywordinjava;

public class A {

	int x,y;		//class variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A a1=new A(); a1.show();
		 * 
		 * 
		 * A a2=new A(23,45); a2.show();
		 */
		
		A a3=new A(12);
		a3.show();
	}
	
	
	public A(B b1)
	{
		this.x=10;
		this.y=20;
	}
	
	public A(int x)
	{
		this(23,45);
	
	}
	
	public A(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public void show()
	{
		System.out.println("value of x : "+x+" y:"+y);
		show2(this);
	}
	
	public void show2(A a5)
	{
		System.out.println("Test Method");
	}
	
	
	
}

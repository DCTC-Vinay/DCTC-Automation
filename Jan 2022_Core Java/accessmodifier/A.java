package accessmodifier;

public class A {
	
	public int n,m;
	private float a,b;
	protected char p,q;
	boolean x,y;
	
	public A()
	{
		
	}
	
	private A(int a)
	{
		
	}
	
	protected A(int a, int b)
	{
		
	}
	
	A(int a, int b, int c)
	{
		
	}
	
	public void test_public()
	{
		
	}
	
	
	private void test_private()
	{
		
	}
	
	protected void test_protected()
	{
		
	}
	
	void test_default()
	{
		
	}
	
	public static void main(String[] args) {
		
		A a1=new A();
	}
}





package accessmodifierinjava;

public class A {

	//private, public, protected and default
	
	private int a,b;	//inside class
	public int c,d;		//we can access 
	protected int e,f;	//inside other package inherited class
	int q,r;			//inside same package
	
	public void test_public()
	{
		
	}
	
	protected void test_protected()
	{
		
	}
	
	private void test_private()
	{
		
	}
	
	void test_default()
	{
		
	}
}
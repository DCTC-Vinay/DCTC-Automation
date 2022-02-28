package accessmodiers;

public class A {
	
	private int a;	//private
	int b;			//default accessibility
	protected int n;	//protected
	public int m;	//public
	
	public void test_public()
	{
		System.out.println("value of a: "+a);
	}
	
	private void test_private()
	{
		System.out.println("value of a: "+a);
	}
	
	void test_default()
	{
		System.out.println("value of a: "+a);
	}
	
	protected void test_protected()
	{
		System.out.println("value of a: "+a);
	}
}

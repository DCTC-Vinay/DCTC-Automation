package accessmodifier;

public class A {
	
	private int a,b;		
	protected float c,d;
	public double e,f;
	boolean g,h;
	
	private void get_private()
	{
		System.out.println("Inside Private Method");
	}
	protected void get_protected()
	{
		System.out.println("Inside Protected Method");
	}
	public void get_public()
	{
		System.out.println("Inside Public Method");
	}
	void get_default()
	{
		System.out.println("Inside Default Method");
	}
	public static void main(String[] args) {
		
		A a1=new A();
		a1.get_default();
		a1.get_private();
		a1.get_protected();
		a1.get_public();
	}
}

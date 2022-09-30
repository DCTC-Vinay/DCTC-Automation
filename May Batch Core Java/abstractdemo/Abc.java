package abstractdemo;

public abstract class Abc {

	public abstract void show();		//method is declared (abstract method)
	public abstract void get();			//no method body
	public abstract void input();
	
	public int n;
	
	public Abc()
	{
		n=78;
	}
	
	//method is defined
	public void get_input()
	{
		System.out.println("inside get input method of Abc class");
	}
	
}

package abstractclassinjava;

public abstract class TestAbstractClass {
	
	//we can have abstract as well as non abstract methods
	
	public TestAbstractClass()
	{
		System.out.println("Test Abstract");
	}
	
	public abstract void show();
	
	public void input()
	{
		System.out.println("method In abstract class");
	}

	
	//2. We can not create object of abstract class
}

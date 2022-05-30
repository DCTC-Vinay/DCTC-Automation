package abstractclassinjava;

public abstract class Demo {
	
	int a,b;
	public Demo()
	{
		a=23;
		b=25;
		System.out.println("Demo Class Constructor :" +a + " "+b);
	}
	
	public static void display()
	{
		
	}
	
	public abstract void get();
	public abstract void show();
	
	public void input()
	{
		System.out.println("Inside Input Method");
	}
}

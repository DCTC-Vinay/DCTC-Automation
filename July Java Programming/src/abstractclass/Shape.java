package abstractclass;

public abstract class Shape {
	
	int x;
	public Shape()
	{
		x=20;
	}
	
	public abstract double area();
	public abstract int perimeter();
	
	public void show()
	{
		System.out.println("Inside show method of Shape Class");
	}
}

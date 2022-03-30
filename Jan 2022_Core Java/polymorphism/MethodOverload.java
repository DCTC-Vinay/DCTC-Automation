package polymorphism;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverload mo=new MethodOverload();
		mo.show();
		mo.show(11);
		mo.show(12.34f, 45.22f);
		mo.show(12.50f);
		mo.show(56, 54);
	}
	
	public void show()
	{
		System.out.println("In show method no parameter");
	}
	
	public void show(int a)
	{
		System.out.println("In show of int parameter :"+a);
	}
	
	public void show(float a)
	{
		System.out.println("In show of float parameter :"+a);
	}
	
	public void show(int a, int b)
	{
		System.out.println("In show of 2 int parameter :"+a+","+b);
	}

	public void show(float a,float b)
	{
		System.out.println("In show of 2 float parameter :"+a+","+b);
	}
}

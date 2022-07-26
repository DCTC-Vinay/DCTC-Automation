package intefaceinjava;

public interface A {

	//variables are initialized and we cant change the values
	String a="Hello";
	int n=45;
	
	//methods are declared. i.e. methods inside interface wont have method body
	public void add();
	public void avg();
	public float sum();
	public boolean equal(int a, int b);
	public void input();
	
	
	public static void test()
	{
		System.out.println("Test Method From A Intefrace");
	}
}
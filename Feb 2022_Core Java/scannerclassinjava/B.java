package scannerclassinjava;

public class B {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		get();
		int a=returnInt();
		System.out.println("a="+a);
		
		B b1=new B();
		b1.show();
		float x=b1.returnFloat();
		System.out.println("x="+x);
		b1.main();
	}
	
	public void main()
	{
		System.out.println("Main");
	}
	
	public static void get()
	{
		System.out.println("in static get method");
		
	}
	
	public static int returnInt()
	{
		System.out.println("in static returnInt method");
		return -5;
	}
	
	public void show()
	{
		System.out.println("In non static show method");
		
	}
		
	public float returnFloat()
	{
		System.out.println("In non static returnFloat method");
		show();
		return 45.23f;
	}

}

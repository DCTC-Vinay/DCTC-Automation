package polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTimePolymorphism x=new CompileTimePolymorphism();
		x.get();
		x.get(12.25f);
		x.get(105.58);
		x.get(78);
		x.get(25, 35);
	}
	
	public void get()
	{
		System.out.println("Method withput parameter");
	}
	
	public void get(int a)
	{
		System.out.println("Method with 1 Integer parameter :"+a);
	}
	
	public void get(int a, int b)
	{
		System.out.println("Method with 2 Integer parameter :"+a+" "+b);
	}
	
	public void get(float a)
	{
		System.out.println("Method with 1 Float parameter :"+a);
	}
	
	public void get(double a)
	{
		System.out.println("Method with 1 Double parameter :"+a);
	}

}
